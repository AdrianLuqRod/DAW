let dni = prompt("Introduce tu dni completo");
let letras = [
  "T",
  "R",
  "W",
  "A",
  "G",
  "M",
  "Y",
  "F",
  "P",
  "D",
  "X",
  "B",
  "N",
  "J",
  "Z",
  "S",
  "Q",
  "V",
  "H",
  "L",
  "C",
  "K",
  "E",
  "T",
];

let numDni;
let letraDni;
let contadorLetras;

/* 
Comprobamos que el numero del Dni este correcto y en el formato deseado, mostrando un alert
en caso contrario.
*/
if (parseInt(dni) > 99999999 || parseInt(dni) < 0 || isNaN(parseInt(dni))) {
  alert("El numero del dni introducido es erróneo");
} else {
  numDni = parseInt(dni);

  /*Ahora vamos a comprobar que hay una letra introducida en el dni(AUN NO COMPROBAMOS AUN QUE SEA LA LETRA CORRECTA)
Para ello recorremos cada caracter del string dni recogido por el prompt y en el momento que se encuentre una letra
aumentamos un contador para saber que hay una letra.
Si el contandor es 1, es decir, se encuentra la primera letra, asignamos esa letra a nuestra variable pero en el caso
de que introduzcamos mas letras, por ejemplo "123456789ZA" no asignamos esa letra y nos quedamos solo con la primera.
De esta forma se autocorrige en parte el prompt si el usuario lo introduce mal, otra forma sería con un if else y mostrar
un alert con el error y no asignar nada */
  for (let i = 0; i < dni.length; i++) {
    if (typeof dni.charAt(i) === "string") {
      contadorLetras++;
      letraDni = contadorLetras > 1 ? letraDni : dni.charAt(i);
    }
  }
}

let calculaLetraDni = (letras, dni) => {
  return letras[dni % 23];
};

if (calculaLetraDni(letras, numDni) !== letraDni) {
  alert("La letra introducida no corresponde con la correcta.");
} else {
  alert("Tanto el numero como la letra introducidos son correctos");
}
