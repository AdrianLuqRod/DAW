// Los #region y #endregion son para colapsar el código en VSCode y facilitar la lectura. Además en
// el mapa de navegación de la derecha se pueden ver los títulos de cada región y asi navegar más rápido.

//#region DEFINICIONES Y CREACION DE VARIABLES
const botonReglas = document.getElementById("boton-reglas");
const cerrarBoton = document.getElementById("cerrar-boton");
const reglas = document.getElementById("reglas");
const canvas = document.getElementById("canvas");
const ctx = canvas.getContext("2d");
const menu = document.querySelector(".menu");
const controles = document.getElementById("controles");
const finPartida = document.getElementById("fin-partida");
const titulo = document.querySelector("h1");
const dificultad = localStorage.getItem("dificultad"); // Recuperar el valor de dificultad de localStorage asignado en index.js

let score = 0;
let isPaused = false;
let animationFrameId;

const filasLadrillo = 9;
const columnasLadrillo = 5;


// Crear propiedades de la bola
const pelota = {
  x: canvas.width / 2,
  y: canvas.height / 2,
  size: 10,
  speed: 3,
  dx: 4,
  dy: -4,
  visible: true,
};

// Crear propiedades de la paleta
const paddle = {
  x: canvas.width / 2 - 40,
  y: canvas.height - 20,
  w: 80,
  h: 10,
  speed: 8,
  dx: 0,
  visible: true,
};

// Crear propiedades de los ladrillos
const infoLadrillo = {
  w: 70,
  h: 20,
  padding: 10,
  offsetX: 45,
  offsetY: 60,
  visible: true,
};

// Crear ladrillos
let ladrillos = [];

//#endregion DEFINICIONES Y CREACION DE VARIABLES

//#region FUNCIONES Y LOGICA DE JUEGO
function crearLadrillos() {
  ladrillos = [];
  let contadorNaranja = 0;
  let contadorMorado = 0;

  for (let i = 0; i < filasLadrillo; i++) {
    ladrillos[i] = [];
    for (let j = 0; j < columnasLadrillo; j++) {
      const x = i * (infoLadrillo.w + infoLadrillo.padding) + infoLadrillo.offsetX;
      const y = j * (infoLadrillo.h + infoLadrillo.padding) + infoLadrillo.offsetY;
      let hits;
      let color;

      // Asignar colores y niveles de resistencia en función de la dificultad
      const valorAleatorio = Math.random();
      if (dificultad === "facil") {
        if (valorAleatorio < 0.5) {
          hits = 1;
          color = "#0095dd"; // Azul
        } else if (contadorNaranja < 10) {
          hits = 2;
          color = "#ff9900"; // Naranja
          contadorNaranja++;
        } else {
          hits = 1;
          color = "#0095dd"; // Azul
        }
      } else if (dificultad === "normal") {
        if (valorAleatorio < 0.33) {
          hits = 1;
          color = "#0095dd"; // Azul
        } else if (valorAleatorio < 0.66) {
          hits = 2;
          color = "#ff9900"; // Naranja
        } else if (contadorMorado < 5) {
          hits = 3;
          color = "#800080"; // Morado
          contadorMorado++;
        } else {
          hits = 2;
          color = "#ff9900"; // Naranja
        }
      } else if (dificultad === "dificil") {
        if (valorAleatorio < 0.33) {
          hits = 1;
          color = "#0095dd"; // Azul
        } else if (valorAleatorio < 0.66) {
          hits = 2;
          color = "#ff9900"; // Naranja
        } else {
          hits = 3;
          color = "#800080"; // Morado
        }
      }

      ladrillos[i][j] = { x, y, hits, color, ...infoLadrillo };
    }
  }
}

// Función para mezclar un array
function mezclar(array) {
  for (let i = array.length - 1; i > 0; i--) {
    const j = Math.floor(Math.random() * (i + 1));
    [array[i], array[j]] = [array[j], array[i]];
  }
}

// Hacer que todos los ladrillos aparezcan y barajarlos
function mostrarLadrillos() {
  crearLadrillos();
  ladrillos.forEach((columna) => {
    mezclar(columna);
    columna.forEach((ladrillo) => {
      ladrillo.visible = true;
    });
  });
}

// Dibujar la bola en el canvas
function dibujarPelota() {
  ctx.beginPath();
  ctx.arc(pelota.x, pelota.y, pelota.size, 0, Math.PI * 2);
  ctx.fillStyle = pelota.visible ? "#0095dd" : "transparent";
  ctx.fill();
  ctx.closePath();
}

// Dibujar el paddle en el canvas
function dibujarPaddle() {
  ctx.beginPath();
  ctx.rect(paddle.x, paddle.y, paddle.w, paddle.h);
  ctx.fillStyle = paddle.visible ? "#0095dd" : "transparent";
  ctx.fill();
  ctx.closePath();
}


// Dibujar los ladrillos en el canvas
function dibujarLadrillos() {
  ladrillos.forEach((columna) => {
    columna.forEach((ladrillo) => {
      ctx.beginPath();
      ctx.rect(ladrillo.x, ladrillo.y, ladrillo.w, ladrillo.h);
      ctx.fillStyle = ladrillo.visible ? ladrillo.color : "transparent";
      ctx.fill();
      ctx.closePath();
    });
  });
}

// Mover la paleta en el canvas
function moverPaddle() {
  paddle.x += paddle.dx;

  // Detección de colisión con las paredes
  if (paddle.x + paddle.w > canvas.width) {
    paddle.x = canvas.width - paddle.w;
  }

  if (paddle.x < 0) {
    paddle.x = 0;
  }
}

// Mover la bola en el canvas
function moverPelota() {
  pelota.x += pelota.dx;
  pelota.y += pelota.dy;

  // Colisión con las paredes (derecha/izquierda)
  if (pelota.x + pelota.size > canvas.width || pelota.x - pelota.size < 0) {
    pelota.dx *= -1; // pelota.dx = pelota.dx * -1
    reproducirSonido("../sounds/pelota.wav");
  }

  // Colisión con las paredes (arriba/abajo)
  if (pelota.y + pelota.size > canvas.height || pelota.y - pelota.size < 0) {
    pelota.dy *= -1;
    reproducirSonido("../sounds/pelota.wav");
  }

  // Colisión con la paleta
  if (
    pelota.x - pelota.size > paddle.x &&
    pelota.x + pelota.size < paddle.x + paddle.w &&
    pelota.y + pelota.size > paddle.y
  ) {
    pelota.dy = -pelota.speed;
    reproducirSonido("../sounds/pelota.wav");
  }

  // Colisión con los ladrillos
  ladrillos.forEach((columna) => {
    columna.forEach((ladrillo) => {
      if (ladrillo.visible) {
        if (
          pelota.x - pelota.size > ladrillo.x && // chequeo del lado izquierdo del ladrillo
          pelota.x + pelota.size < ladrillo.x + ladrillo.w && // chequeo del lado derecho del ladrillo
          pelota.y + pelota.size > ladrillo.y && // chequeo del lado superior del ladrillo
          pelota.y - pelota.size < ladrillo.y + ladrillo.h // chequeo del lado inferior del ladrillo
        ) {
          pelota.dy *= -1;
          ladrillo.hits--;
          reproducirSonido("../sounds/pelota.wav");

          if (ladrillo.hits === 0) {
            ladrillo.visible = false;
            reproducirSonido("../sounds/brickRoto.wav"); // Reproducir sonido de ladrillo roto
            incrementaScore();
          } else if (ladrillo.hits === 2) {
            ladrillo.color = "#ff9900"; // Naranja
          } else if (ladrillo.hits === 1) {
            ladrillo.color = "#0095dd"; // Azul
          }
        }
      }
    });
  });

  // Colisión con la pared inferior - Perder
  if (pelota.y + pelota.size > canvas.height) {
    reproducirSonido("../sounds/derrota.wav");
    mostrarFinPartida();
    score = 0;
  }
}

// Función para reproducir el sonido
function reproducirSonido(src) {
  const sonido = new Audio(src);
  sonido.play();
}

// Función para mostrar la ventana de derrota
function mostrarFinPartida() {
  isPaused = true; // Pausar el juego
  cancelAnimationFrame(animationFrameId); // Cancelar la animación
  finPartida.style.display = "block"; // Mostrar la ventana de derrota
  canvas.style.filter = "blur(5px)"; // Aplicar desenfoque al canvas
  titulo.style.filter = "blur(5px)"; // Aplicar desenfoque al título
}

// Función para ocultar la ventana de derrota y reiniciar el juego
function ocultarFinPartida() {
  finPartida.style.display = "none"; // Ocultar la ventana de derrota
  canvas.style.filter = "none"; // Eliminar desenfoque del canvas
  titulo.style.filter = "none"; // Eliminar desenfoque del título
  mostrarLadrillos(); // Mostrar todos los ladrillos
  score = 0; // Reiniciar la puntuación
  pelota.x = canvas.width / 2;
  pelota.y = canvas.height / 2;
  pelota.dx = 4;
  pelota.dy = -4;
  paddle.x = canvas.width / 2 - 40;
  paddle.y = canvas.height - 20;
  pelota.visible = true;
  paddle.visible = true;
  isPaused = false; // Reanudar el juego
  mostrarCuentaAtras(update); // Mostrar la cuenta atrás y reanudar la animación
}

// Incrementar la puntuación
function incrementaScore() {
  score++;

  if (score % (filasLadrillo * columnasLadrillo) === 0) {
    pelota.visible = false;
    paddle.visible = false;

    // Después de 0.5 segundos reiniciar el juego
    setTimeout(function () {
      mostrarLadrillos();
      score = 0;
      paddle.x = canvas.width / 2 - 40;
      paddle.y = canvas.height - 20;
      pelota.x = canvas.width / 2;
      pelota.y = canvas.height / 2;
      pelota.visible = true;
      paddle.visible = true;
    }, 500);
  }
}

// Dibujar todo
function dibujar() {
  // Limpiar el canvas
  ctx.clearRect(0, 0, canvas.width, canvas.height);

  dibujarPelota();
  dibujarPaddle();
  dibujarLadrillos();
}

// Actualizar el dibujo y la animación del canvas
function update() {
  if (!isPaused) {
    moverPaddle();
    moverPelota();
    dibujar();
    animationFrameId = requestAnimationFrame(update);
  }
}

// Función para mostrar la cuenta atrás
function mostrarCuentaAtras(callback) {
  let cuentaAtras = 3;
  const cuentaAtrasIntervalo = setInterval(() => {
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    ctx.font = "40px Arial";
    ctx.fillStyle = "#0095dd";
    ctx.textAlign = "center"; // Centrar el texto
    ctx.fillText(cuentaAtras, canvas.width / 2, canvas.height / 2);
    cuentaAtras--;

    if (cuentaAtras < 0) {
      clearInterval(cuentaAtrasIntervalo);
      callback();
    }
  }, 1000);
}

// Función para pausar el juego y mostrar el menú
function pausarPartida() {
  isPaused = true;
  cancelAnimationFrame(animationFrameId);
  menu.style.display = "block";
  canvas.style.filter = "blur(5px)";
  titulo.style.filter = "blur(5px)"; // Aplicar desenfoque al título
}

// Función para reanudar el juego y ocultar el menú
function reanudarPartida() {
  isPaused = false;
  menu.style.display = "none";
  canvas.style.filter = "none";
  titulo.style.filter = "none"; // Eliminar desenfoque del título
  setTimeout(update, 500); // Esperar 0.5 segundos antes de reanudar el juego
}

// Función para mostrar los controles
function mostrarControles() {
  controles.style.display = "block";
}

// Función para ocultar los controles
function ocultarControles() {
  controles.style.display = "none";
}

// Inicializar el juego con cuenta atrás
mostrarLadrillos();
mostrarCuentaAtras(update);

// Evento de presionar tecla
function presionarTecla(e) {
  if (e.key === "Right" || e.key === "ArrowRight") {
    paddle.dx = paddle.speed;
  } else if (e.key === "Left" || e.key === "ArrowLeft") {
    paddle.dx = -paddle.speed;
  } else if (e.key === "Escape") {
    if (isPaused) {
      reanudarPartida();
    } else {
      pausarPartida();
    }
  }
}

// Evento de soltar tecla
function soltarTecla(e) {
  if (
    e.key === "Right" ||
    e.key === "ArrowRight" ||
    e.key === "Left" ||
    e.key === "ArrowLeft"
  ) {
    paddle.dx = 0;
  }
}

// Manejadores de eventos del teclado
document.addEventListener("keydown", presionarTecla);
document.addEventListener("keyup", soltarTecla);

botonReglas.addEventListener("click", () => {
  reglas.style.display = "block";
});

cerrarBoton.addEventListener("click", () => {
  reglas.style.display = "none";
});

//#endregion FUNCIONES Y LOGICA DE JUEGO