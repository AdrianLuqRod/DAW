// Guapi, te comento. He hecho un resumen creo que bastante sencillo de entender de los metodos que hacen falta creo para el examen ( mas o menos).
// He puesto los necesarios para que no te satures mucho y no vayas mal para el examen. Te adelanto que con las fechas te he puesto un truquito para
// ver los metodos en medio del examen y lo del tema5 no esta aqui porque eso es otro rollo y a parte de que si estas saturada va a ser mucho para ti
// yo aun si quiera lo he empezado. De hecho lo empezare ahora que termine el tema4 y he hecho esto con lo mas relevante. Cualquier cosa me dices por favor. 

// METODOS DE COSAS NORMALES
// .tolowerCase() // Convierte un string a minúsculas
// .toUpperCase() // Convierte un string a mayúsculas



//.split() // Separa un string en un array
// EJEMPLO DE SPLIT
let cadena = "Hola mundo";
let array = cadena.split(" "); // ["Hola", "mundo"]



//.join() Une un array en un string
// El join casi siempre (siempre) se usa con  "" dentro de los paréntesis.
// EJEMPLO DE JOIN. Si tengo una palabra con guiones y quiero quitarselos
let palabra = "hola-mundo";
let palabraSinGuiones = palabra.split("-").join(""); // "holamundo"



// .sort() // Ordena un array
// Esto aprendetelo de memoria. 
// Si quieres ordenar DE MENOR A MAYOR
arr.sort((a, b) => a - b);
// Si quieres ordenar de MAYOR A MENOR
arr.sort((a, b) => b - a);

//Si te lias mucho intentado escribirlo de memoria sigue estos pasos:
// 1. Escribes el arr.sort(); Asi como tal, que es facil porque sort en ingles es ordenar y es facil de recordar.
//2. Por separado escribes (a,b) => a - b. Esto asi solo no es complicado de aprender, es lo unico que te tienes que memorizar.
//3. Lo del paso 2 lo metes dentro de los parentesis.
//4. Si quieres ordenar de mayor a menor solo cambiar el a - b por b - a

//RESUMEN SORT - Hago enfasis con sort porq es un poco lioso pero muy facil de memorizar, yo lo hago siempre asi y creo que va a caer algo con esto.

// Ejemplo de sort intentando escribirlo
// 1.
arr.sort();
// 2.
(a, b) => a - b;
// 3.
arr.sort((a, b) => a - b); // <- Te aaprendes a hacerlo asi y si quieres que sea de mayor a menor solo cambias el a - b por b - a

//. Math.floor() <- Te quita los decimales
//. Math.random() <- Te da un número aleatorio

//. slice() <- Te corta un string. Para cortar cadenas solo hace falta con saberte este, por ejemplo:
let miCadena = "Hola mundo";
miCadena.slice(0, 4); // "Hola" 
// El primer número es donde empieza y el ultimo donde acaba, el ultimo no se incluye.
// Si solo pones el numero del principio te corta hasta el final.
// Ejercicio que puede caer con esto, el de truncar desde una longitud.
let truncar = (palabra, longitud) => {
    let resultado = "";
    if (palabra.length > longitud) {
        resultado = palabra.slice(0, longitud) + "...";
    } else {
        resultado = palabra;
    }

    return resultado;
}

//. includes() <- Te dice si un string está dentro de otro
// Ejemplo de includes
let miPalabra = "Hola mundo";
let miPalabra2 = "Hola";
palabra.includes(miPalabra2); // true

//. parseInt() <- Te convierte un string a número
//. toString() <- Te convierte un número a string

//. toFixed() <- Te redondea un número a un número de decimales
// Ejemplo de toFixed
let numero = 12.3456;
numero.toFixed(2); // 12.35

//. trim() <- Te quita los espacios en blanco de un string desde el principio y el final, no entre medio.
// Ejemplo de trim
let miCadena2 = " Hola mundo ";
miCadena.trim(); // "Hola mundo"


//. charAt() <- Te devuelve el caracter de una posición concreta de un string

//. concat() <- Une dos strings o arrays
// Ejemplo de concat
let miCadena3 = "Hola";
let miCadena4 = " mundo";
miCadena3.concat(miCadena4); // "Hola mundo"
// Ejemplo de concat con arrays
let miArray = [1, 2, 3];
let miArray2 = [4, 5, 6];
miArray.concat(miArray2); // [1, 2, 3, 4, 5, 6]


// Mi vida no quiero poner mucho mas porque pretendo que sepas lo justo para poder aprobar, aunque si
// sabes todo lo de antes, puedes sacar bastante nota. Me he dejado fuera las fechas y lo del html
// Si quieres saber los metodos de las fechas en medio del examen creas un objeto Date y le pones un punto delante
// y te saldran todos los metodos que puedes usar con las fechas.
let fecha = new Date();
fecha. // Aqui te salen todos los metodos que puedes usar con las fechas. Si pones un metodo y dejas el raton encima, te explica que hace.

// El ultimo metodo que te voy a explicar es uno que te costo entender en clase y si no quieres verlo no te preocupes.
// .filter() <- Filtra un array

// Ejemplo de filter
let miArray3 = [1, 2, 3, 4, 5, 6];
miArray.filter((numero) => numero > 3); // [4, 5, 6]
// Si te cuesta mucho aprendertelo haz lo mismo que con sort vale?
// Primero escribes el arr.filter();
// Despues escribes () =>
// Dentro del parentesis va como quieres llamar al elemento que recorres, como un for each en java.
// Y despues de la flechita va la condicion que quieres que se cumpla.
// Por ejemplo, si quiero que del array de numeros me devuelva los que sean mayores que 3, pongo (numero) => numero > 3.

// Si no te cuesta mucho aprendertelo asi, con esto vas bien para el examen, ya depende de donde caigan mas ejercicios.
// Y si sabes hacer lo del tema 5 pues mejor que mejor que de eso creo que 1 seguro cae.

