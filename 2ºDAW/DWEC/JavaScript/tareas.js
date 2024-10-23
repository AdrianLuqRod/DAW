// ? Ejercicio 2

let alumnos = Math.floor(Math.random() * (31 - 20 + 1) + 20); //! <-- Guapa este de aqui da un numero de 20 hasta 31. (incluyendo ambos)
console.log(alumnos);

// - La funcion Math.random() te genera un numero entre 0 y 1.
// - Si yo quiero un numero entre 20 y 31, minimo 20 le tengo que sumar que eso esta bien.
// - Pero el maximo tiene que ser 31 ya que el maximo no se incluye porque te devuelve un valor ENTRE los que especificas.
// - Entonces para que el maximo pueda obtener 30, tiene que ser entre 0 y 31, por eso has hecho el 31 - 20 pero el +1 sobra.
// - Al final se quedaria algo tipo:

let alumnosGuapi = Math.floor(Math.random() * (31 - 20) + 20);

let temperatura = Math.floor(Math.random() * (41 - 37 + 1) + 37);
// - Con el let temperatura te pasa lo mismo, el +1 sobra.
let temperaturaGuapi = Math.floor(Math.random() * (41 - 37) + 37);


// ? Ejercicio 3
let cadena = (cadenas) => {
  let cadenaAlterna = "";
  for (let index = 0; index < cadenas.length; index++) {
    if (index % 2 == 0) {
      cadenaAlterna = cadenaAlterna + cadenas.charAt(index).toUpperCase();
    } else {
      cadenaAlterna = cadenaAlterna + cadenas.charAt(index).toLowerCase();
    }
  }
  alert(cadenaAlterna);
}
cadena("hola");

// - El ejercicio esta bien, pero si introduzco una cadena con espacios ya sea por ejemplo 'Hola Mundo' no me lo va a hacer bien.
// - Mira el output sería este:

cadena("Hola Mundo"); // . --> HoLa mUnDo

// - Esto pasa porque cuando iteras el index en el bucle 'for' no estas teniendo en cuenta los espacios.
// - Para que lo entiendas bien:
/**
 *  0 -> H
 *  1 -> o
 *  2 -> L
 *  3 -> a
 *! 4 -> " " En esta iteración esta el fallo, ya que realmente esta poninendo un espacio en mayúsculas y a partir de aqui el index se descontrola.
 *  5 -> m
 *  6 -> U
 *  7 -> n
 *  8 -> D
 *  9 -> o
 */

// - Para solucionarlo lo suyo es hacer la iteración mediante un contador que vaya aumentando y que no tenga en cuenta los espacios, por ejemplo:
// - Primero cuando declaramos cadenaAlterna podemos declarar también un contador a 0.

let cadenaGuapi = (cadenas) => {
  let cadenaAlterna = "";
  let contador = 0;

  for (let index = 0; index < cadenas.length; index++) {
    // - Primero nos preguntamos si el caracter que estamos iterando es un espacio. Si lo es, pues ponemos un espacio, sino vamos al else.
    if (cadenas[i] === " ") {
      cadenaAlterna = cadenaAlterna + " ";
    }
    else { // - Como no es un espacio, nuestro contador que empieza en 0 igual que el index nos sirve para iterar cada letra de la cadena.
      if (contador % 2 == 0) {
        cadenaAlterna = cadenaAlterna + cadenas.charAt(index).toUpperCase(); //. Como dato, .charAt() no hace falta, con poner cadenas[index] ya te coge el caracter.
      }
      else {
        cadenaAlterna = cadenaAlterna + cadenas[index].toLowerCase(); //. Así sería sin el .charAt()
      }// - Como hemos acabado de iterar una letra, aumentamos el contador como si fuese nuestro index 
      // - pero exclusivamente de las letras en lugar de todos los caracteres incluyendo los espacios.
      contador++;
    }
    alert(cadenaAlterna);
  }
}

// ? Ejercicio 4
let frase = "Hola Mundo";
alert("La frase es: " + frase);
let contiene = (contiene) => {
  let fraseMayor = frase.toLowerCase();
  if (fraseMayor.indexOf(contiene.toLowerCase(), 0) > 0) {
    return true;
  } else {
    return false;
  }
}
contiene("w");

// - El ejercicio esta bien, yo no use el .indexOf lo hize de otra forma aunque no esta mal.
// - El fallo es que si la letra o palabra que yo introduzco en la funcion esta en la primera posición de la frase, me va a devolver false.
// - Esto pasa porque tu has puesto que si el indexOf es mayor que 0 se encuentra en la frase, pero, ¿qué pasa si está en la primera posición? Mira:

let fraseGuapi = "Hola Mundo";
alert("La frase es: " + frase);

let contieneGuapi = (contiene) => {
  let fraseMayor = fraseGuapi.toLowerCase();
  if (fraseMayor.indexOf(contiene.toLowerCase(), 0) >= 0) { //. --> Aquí he cambiado el > por >= para que si esta en la primera posición me lo devuelva true.
    return true;
  } else {
    return false;
  }
}
contieneGuapi("w");

// - De todas formas yo ni se como funciona el indexOf la verdad, hay un método que es .includes() que te devuelve directamente
// - un booleano si la cadena que le pasas esta en la frase o no. Sería algo así:

let fraseGuapi2 = "Hola Mundo";
alert("La frase es: " + frase);

let contieneGuapi2 = (contiene) => {
  let fraseMayor = fraseGuapi2.toLowerCase();
  return fraseMayor.includes(contiene.toLowerCase()); //. --> Esto te devuelve directamente un booleano y es más fácil de entender creo yo jeje.
}
contieneGuapi2("w");

// ? Ejercicio 5

let truncar = (texto, longitudMax) => {
  let palabraTruncada = "";
  for (let index = 0; index < longitudMax; index++) {
    palabraTruncada = palabraTruncada + (texto.charAt(index));
  }
  alert(palabraTruncada = palabraTruncada + "...");
}
let texto = prompt("Escribe un texto: ");
let longitudMax = prompt("Escribe el numero max de longitud: ");
truncar(texto, longitudMax);

// - Este ejercicio si está mal, el enunciado te pide que si yo por ejemplo:
// . Mi palabra es 'Hola' y la longitud maxima que yo le digo es 6, realmente la funcion me tiene que devolver 'Hola' y no 'Hola...'.
// . Si la palabra es'Hola' y la longitud máxima fuese 3, entonces me devolvería 'Hol...'.
// - Esto pasa porque no tienes en cuenta la longitud de la palabra que introduces, solo la longitud maxima que tu le dices.
// - Para arreglarlo vamos a plantear el ejercicio de otra manera, mira el código y luego te lo explico:

let truncarGuapi = (texto, longitudMax) => {
  let palabraTruncada = "";

  if (texto.length > longitudMax) {
    palabraTruncada = texto.substring(0, longitudMax) + "...";
  }
  else {
    palabraTruncada = texto;
  }

  return palabraTruncada;
}

// - El primer fallo independientemente de tener o no en cuenta la longitud de la palabra es que no sabes bien como formar esa palabra truncada.
// - En tu función truncar, estas iterando la palabra entera hasta llegar a la longitud máxima que tu le has dicho, y al final le añades "..." pero,
// - ¿Y si la palabra que introduces es más corta que esa longitudMax, que ocurre? Pues que te devuelve la palabra truncada con "..." al final pese 
// - a ser mas corta que longitudMax. Por ejemplo:
truncar("Hola", 6); // --> El output que queremos seria: 'Hola' pero el que devuelve es 'Hola...', ¿por qué?
// - Esto pasa porque no tienes en cuenta la longitud de la palabra que tu introduces, que es lo más importante de la función.
// - Teniendo esto en cuenta, primero debemos preguntarnos si palabra es mas larga que la distancia máxima que establecemos.
// - En el caso de que sea MÁS LARGA, pues tendremos que hacer cosas para que se ajuste a la longitud máxima.
// - Pero si NO LO ES, devolvemos la palabra tal y como viene.
// - Para hacer esto, primero nos preguntamos si palabra.length > longitudMax { hago magia } entonces nos planteamos hacer algo, pero si no, else{ return palabra; }
// - Vale, ahora sabemos si nuestra palabra es más larga o no, si no lo es la devolvemos, pero si es más larga, ¿qué hacemos?
// - Pues tenemos que cortar la palabra a la longitud que se nos dice y añadirle al final "..." para que se ajuste a la longitud máxima.
//. POR EJEMPLO: si yo digo truncar("Hola", 3); pues quiero que me devuelva 'Hol...', porque la longitud maxima es 3 y solo cojo 3 letras.
// - Para hacer esto utilizamos el metodo .substring() aunque hay 2 mas, en las diapositivas salen, pero yo use este.
// - .substring() básicamente te divide la palabra y te quedas con las letras que depende de los 2 parametros del método.
// - El primero es de donde partes, es decir, 0 porque queremos LAS LETRAS DESDE EL PRINCIPIO.
// - El segundo parametros es hasta donde quieres hacer la nueva 'palabra truncada', en este caso longitudMax.
// - Una vez formada la palabra pues al final le añadimos literalmente "...",  y asi tenemos la nueva palabra formada de manera truncada.
// - Por si te cuesta entenderlo:
/**
 *  Hola --> longitudMax = 3
 * hola.length es 4, por lo que 4 > 3, entonces hacemos el truncamiento.
 * substring(0,3) --> 'Hol' Nos devuelve LO QUE HAY ENTRE 0 y 3. El 0 se incluye y el 3 no aunque en la definicion pone que otra cosa pero bueno.
 *  H -> 0
 * o -> 1
 * l -> 2
 * a -> 3
 */

// ? Ejercicio 6

precio = "€120."; //. --> Te he corregido el punto al final, lee más abajo para entendelo jeje.
let extraerEuro = (precio) => {
  let nuevoPrecio = "";
  for (let index = 1; index < precio.length; index++) {
    nuevoPrecio = nuevoPrecio + precio.charAt(index);
  }
  alert(nuevoPrecio);
}
extraerEuro(precio);

// - El ejercicio esta bien, pero precio no es '€120', es '€120.' (lo dice el enunciado) con un punto al final, de hecho no se ni como te devuelve el 120 en tu codigo pero bueno, no importa jeje.
// - Si ponemos que precio='€120.' tu función te devuelve '120.' y no '120' como debería ser. Creo que hay varias formas de hacerlo, te explico la mía:
// - Mi idea es coger precio y dividirlo en arrays de String por ejemplo, que yo coja precio='€120.' y lo divida en: arrayPrecio=['€','120','.'];
// - Viendolo asi seria muy facil coger el precio, ¿no? Simplemente devolveríamos arrayPrecio[1] y listo, pero, ¿cómo lo hacemos?
// - Igual que antes, te pongo el código y luego te lo explico:
let extraerEuroGuapi = (precio) => {
  let division1 = precio.split("€");
  let division2 = division1[1].split(".");
  return division2[0];
}
// - Ahora mismo igual te has rayao un poquito, pero no te preocupes que TU NIÑO SHICO te lo explica jeje.
// - Mira el metodo .split lo que hace es dividir un String en un array de String mediante un identificador que tu le pones, en este caso el primero es '€'.
// - Entonces, si yo hago 'let division1 = precio.split("€");, ¿qué ocurre?.
// - Pues coge a precio y empieza a iterarlo, y en el momento que se encuentra el "€", lo que tenia antes lo pone en la posicion [0] del array y lo de después en [1].
// - Por lo tanto, si yo hago 'let division1 = precio.split("€");' con precio='€120.', se quedaria que:
// - division1[0] = "€" y division1[1] = "120."
// - Entendiendo esta lógica, es fácil. Ahora hacemos lo mismo con la palabra que hay en division1[1], que es "120.".
// - Hacemos lo mismo, otra división con el método .split() pero esta vez con el identificador ".", para que lo separe del número.
// - Entonces, si hacemos 'let division2 = division1[1].split(".");' con division1[1] = "120.", se quedaría que:
// - division2[0] = "120" y division2[1] = "."
// - Y como queremos el precio, simplemente devolvemos division2[0] que es el precio sin el punto.

// - Me he tirao un ratillo al final haciendo esto ghfjdkgh jeje espero que te sirva mucho guapi. <3