let lanzarMoneda = () => {
  // Generamos un numero aleatorio y vemos si sale "Cara" o "Cruz" para redirigir a un html o a otro
  let moneda = Math.floor(Math.random() * 2);
  let resultado = moneda === 0 ? "Cara" : "Cruz";

  if (resultado === "Cara") {
    window.open("", "nuevaVentana", "width=300,height=600");
    let cara = window.open("", "nuevaVentana", "width=300,height=600");
    // Hacemos que la ventana nueva vaya al html creado con ruta "cara.html"
    cara.location.href = "cara.html";
  } else {
    window.open("", "ventanaCruz", "width=300,height=600");
    let cara = window.open("", "ventanaCruz", "width=300,height=600");
    // Hacemos que la ventana nueva vaya al html creado con ruta "cruz.html"
    cara.location.href = "cruz.html";
  }
};

let enviarNota = () => {
  // Creamos una variable que tenga el valor de la caja que ponemos con id nota en el html
  let nota = parseInt(document.getElementById("nota").value);

  //   Hacemos un switch en función del valor recogido en la caja input con id nota del html
  switch (nota) {
    case 0:

    case 1:

    case 2:

    case 3:
      alert("Deberías haber aprovechado mejor esta oportunidad");
      break;
    case 4:

    case 5:
      alert("Las chuches favorita de María son las de color rojo");
      break;
    case 6:

    case 7:
      alert("Parece que nos hemos enterado de algo");
      break;
    case 8:

    case 9:

    case 10:
      alert("Escribimos código mejor que la Chati");
      break;

    default:
      alert("Nota no válida");
      break;
  }
};
