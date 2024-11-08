// - Ejercicio 1. Realiza un script que le pregunte al usuario la nota obtenida en un examen,
// - y  en función del resultado devuelva “Suspenso”, “Aprobado”, “Notable” o “Sobresaliente”.
// - Realiza otra versión utilizando el operador condicional ?:

let nota = Number(prompt("Introduce una nota"));
if (nota < 5) {
    console.log("Suspenso");
} else if (nota >= 5 && nota < 7) {
    console.log("Aprobado");
} else if (nota >= 7 && nota < 9) {
    console.log("Notable");
} else {
    console.log("Sobresaliente");
}
//. Version con ternario.

let notaTernario = prompt("Introduce una nota");
let resultado = notaTernario < 5 ? "Suspenso" :
    notaTernario >= 5 && notaTernario < 7 ? "Aprobado" :
        notaTernario >= 7 && notaTernario < 9 ? "Notable" :
            "Sobresaliente";

console.log(resultado);


// - Ejercicio 2. Crea un script que calcule el factorial de un número entero. 

let numFactorial = Number(prompt("Introduce un número"));

let calculaFactorial = (num) => {
    if (num === 0) { return 1; }

    let aux = num;
    let factorial = 1;

    while (aux > 0) {
        mul *= aux;
        aux--;
    }
}

// - Ejercicio 3. Realiza un script que pida al usuario un número, e indique  si es par o impar.

let numParImpar = Number(prompt("Introduce un número"));

let parImpar = (num) => {
    let resul = num % 2 === 0 ? "Par" : "Impar";

    console.log(resul);
}

// - Ejercicio 4. Realiza un script que muestre en el documento los múltiplos de 8 comprendidos
// - entre dos números que se solicitarán al usuario. No importa el orden en el que los inserte
// - el usuario, siempre se presentarán de menor al mayor, ambos inclusive.

let numMinMul8 = Number(prompt("Introduce un número"));
let numMaxMul8 = Number(prompt("Introduce otro número"));

if (numMinMul8 > numMaxMul8) {
    let aux = numMaxMul8;
    numMaxMul8 = numMinMul8;
    numMinMul8 = aux;
}

for (let i = numMinMul8 + 1; i < numMaxMul8; i++) {
    if (i % 8 === 0) {
        document.write(i + " ");
    }
}

// - Ejercicio 5. Solicita un número y muestra al usuario su tabla de multiplicar.

let numTabla = Number(prompt("Introduce un número"));

let caculaTablaMultiplicar = (num) => {
    for (let i = 1; i <= 10; i++) {
        console.log(num + " x " + i + " = " + (num * i));
    }
}

// - Ejercicio 6. El cálculo de la letra del Documento Nacional de Identidad (DNI) es un proceso matemático
// - sencillo que se basa en obtener el resto de la división entera del número de DNI y el número 23.
// - A partir del resto de la división, se obtiene la letra seleccionándola dentro de un array de letras.

// - Elaborar un script que almacene en una variable el número de DNI indicado por el usuario y en otra
// - variable la letra del DNI que se ha indicado.
// - Comprobar si el número es menor que 0 o mayor que 99999999. Si ese es el caso, se muestra un mensaje al
// - usuario indicando que el número proporcionado no es válido y el programa no muestra más mensajes.
// - Si el número es válido, se calcula la letra que le corresponde según el método explicado anteriormente.
// - Se debe comparar con la letra indicada por el usuario. Si no coinciden, se muestra un mensaje al usuario
// - diciéndole que la letra que ha indicado no es correcta. En otro caso, se muestra un mensaje indicando que
// - el número y la letra de DNI son correctos. 

let letras = [
    "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B",
    "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E", "T",
];

let numDni = Number(prompt("Introduce un número de DNI"));
let letraDni = prompt("Introduce una letra de DNI");

if (numDni < 0 || numDni > 99999999) {
    console.log("El número proporcionado no es válido");
} else {
    let letraCorrecta = letras[numDni % 23];

    if (letraCorrecta !== letraDni) {
        console.log("La letra que ha indicado no es correcta");
    } else {
        console.log("El número y la letra de DNI son correctos");
    }
}

// - Ejercicio 7. Realiza un script que muestre mediante mensajes los dígitos que componen un número.
// - Éste tiene que ser menor de 1000. 

let numDigitos = prompt("Introduce un número");

if (Number(numDigitos) >= 1000) {
    console.log("El número tiene que ser menor de 1000");
} else {
    for (let i = 0; i < numDigitos; i++) {
        console.log(numDigitos.charAt(i));
    }
}

// - Ejercicio 8. Realiza un script que muestre mediante mensajes los literales de los números entre 1 y 5. 

let muestraLiterales = (num) => {
    switch (num) {
        case 1:
            return "Uno";
            break;

        case 2:
            return "Dos";
            break;

        case 3:
            return "Tres";
            break;

        case 4:
            return "Cuatro";
            break;

        case 5:
            return "Cinco";
            break;

        default:
            return "Numero no válido";
            break;
    }
}

for (let i = 2; i < 5; i++) {
    console.log(muestraLiterales(i));
}

// - Ejercicio 9. Realiza un script que solicite al usuario introducir algunas de estas palabras (casa, mesa, perro, gato)
// - para luego mostrar la palabra traducida en inglés.

let flag = false;
while (!flag) {
    let palabra = prompt("Introduce alguna de estas palabras: casa | mesa | perro | gato").toLowerCase();
    flag = palabra === "casa" ||
        palabra === "mesa" ||
        palabra === "perro" ||
        palabra === "gato" ? true : false;
}

switch (palabra) {
    case "casa":
        console.log("House");
        break;

    case "mesa":
        console.log("Table");
        break;

    case "perro":
        console.log("Dog");
        break;

    case "gato":
        console.log("Cat");
        break;

    default:
        break;
}

// - Ejercicio 10. Realiza un script en el que un usuario introduzca una frase (ésta puede contener todo tipo de caracteres),
// - ir mostrando todos los caracteres uno a uno, excepto si es un número que lo obviará.

let frase = prompt("Introduce una frase");

for (let i = 0; i < frase.length; i++) {
    if (isNaN(frase.charAt(i))) {
        console.log(frase.charAt(i));
    }
}

// - Ejercicio 11. Realiza un script en el que un usuario introduzca un número, y vaya sumando cada una de sus cifras y devuelva el resultado.  
let numSumaCifras = Number(prompt("Introduce un número"));

let sumaCifrasNum = (num) => {
    let suma = 0;
    let aux = num;

    while (aux > 9) {
        suma += aux % 10;
        aux = Math.floor(aux / 10);
    }

    suma += aux;

    return suma;
}

//. MODIFICACION: Si el número es decimal suma solo la parte entera
let numSumaCifrasEnteras = Number(prompt("Introduce un número"));

let sumaCifrasNumEnteras = (num) => {
    let suma = 0;
    let aux = Math.floor(num);

    while (aux > 9) {
        suma += aux % 10;
        aux = Math.floor(aux / 10);
    }

    suma += aux;

    return suma;
}

//. MODIFICACION: Si el número es decimal suma la parte entera y decimal.
let numSumaCifrasEnterasDecimal = prompt("Introduce un número");

let sumaCifrasNumEnterasDecimal = (num) => {
    let suma = 0;
    let aux = Number(num.split(".").join(""));

    while (aux > 9) {
        suma += aux % 10;
        aux = Math.floor(aux / 10);
    }

    suma += aux;

    return suma;
}

// - Ejercicio 12. Realiza un script que muestre por pantalla un menú:
/* “Calculadora”
Pulse 1 para sumar
Pulse 2 para restar
Pulse 3 para multiplicar
Pulse 4 para dividir
Pulse 5 para obtener el módulo
Pulse 6 para salir
*/
// - En función de la opción seleccionada realizará la operación y si pulsa la opción 6,
// - con el botón confirm preguntar si está seguro de salir, si es que si cerrará la ventana
// - si es que no, se volverá a elegir una opción del menú.  

console.log(`"Calculadora"
Pulse 1 para sumar
Pulse 2 para restar
Pulse 3 para multiplicar
Pulse 4 para dividir
Pulse 5 para obtener el módulo
Pulse 6 para salir`);

console.log("hola");


let opcion = Number(prompt("Introduce una opción"));
let num1;
let num2;
let confirmacion;

let preguntaNums = () => {
    num1 = Number(prompt("Introduce un número"));
    num2 = Number(prompt("Introduce otro número"));
}
do {
    confirmacion = true;
    switch (opcion) {
        case 1:
            preguntaNums();
            console.log(num1 + num2);
            break;

        case 2:
            preguntaNums();
            console.log(num1 - num2);
            break;

        case 3:
            preguntaNums();
            console.log(num1 * num2);
            break;

        case 4:
            preguntaNums();
            console.log(num1 / num2);
            break;

        case 5:
            preguntaNums();
            console.log(num1 % num2);

            break;

        case 6:
            if (confirm("¿Estás seguro de salir?")) {
                windows.close();
            }
            else {
                confirmacion = false;
                opcion = Number(prompt("Introduce una opción"));
            }
            break;

        default:
            console.log("Opción no válida");

            break;
    }
} while (!confirmacion);

// - Ejercicio 13. A partir de un array con los siguientes valores: [true, 5, false, "hola", “adios, 2]:
// - Determinar cuál de los dos elementos de texto es mayor.
// - Determinar el resultado de dos operaciones lógicas realizadas con los elementos booleanos.
// - Determinar el resultado de dos operaciones aritméticas realizadas con los elementos numéricos.

let valores = [true, 5, false, "hola", "adios", 2];

let info = (arr) => {
    let maxLength = 0;
    let indiceAux = 0;
    let num1;
    let num2;
    let booleano1;
    let booleano2;

    for (let i = 0; i < arr.length; i++) {
        if (typeof arr[i] === "string") {
            if (arr[i].length > maxLength) {
                maxLength = arr[i].length;
                indiceAux = i;
            }
        }

        else if (typeof arr[i] === "number") {
            if (num1 === undefined) {
                num1 = arr[i];
            }
            else {
                num2 = arr[i];
            }
        }

        else if (typeof arr[i] === "boolean") {
            if (booleano1 === undefined) {
                booleano1 = arr[i];
            }
            else {
                booleano2 = arr[i];
            }
        }
    }
    console.log(`El elemento de texto con mayor longitud es: ${valores[indiceAux]}`);
    console.log(`El resultado de la operación lógica AND es: ${booleano1 && booleano2}`);
    console.log(`El resultado de la operación lógica OR es: ${booleano1 || booleano2}`);
    console.log(`El resultado de la suma es: ${num1 + num2}`);
    console.log(`El resultado de la resta es: ${num1 - num2}`);
}

// - Ejercicio 14. Realiza un script que pida la contraseña de acceso a una página web y compruebe si
// - es la misma que la almacenada en una variable. Si es correcta, le dará la bienvenida, sino se volverá a pedir.

let pass = "1234";
let acceso = false;
while (!flag) {
    let userPass = prompt("Introduce la contraseña");
    acceso = userPass === pass ? true : false;
}

// - Ejercicio 15. Realiza un script que determine si la cadena de texto que se le pide al usuario es un palíndromo.

let esPalindromo = (str) => {
    let cadena = str.split(" ").join("").toLowerCase();
    return cadena.reverse() === cadena ? true : false;
}

// - Ejercicio 16. La nota del examen de una asignatura corresponde en un 20% al primer parcial, un 20% al segundo
// - parcial y un 60% al examen final. La nota final es la mejor entre la nota del examen y la nota obtenida con la
// - evaluación continua (teniendo en cuenta los dos parciales).
// - Escriba un programa que pida estas tres notas y calcule la nota final de un alumno. A continuación, el programa
// - debe preguntar al usuario si quiere calcular una nueva nota o finalizar (pulsando la tecla ‘s’).
let notaFinal = (nota1, nota2, nota3) => {
    let notaParciales = (nota1 + nota2) / 2;
    let evalContinua = (notaParciales * 0.2) + (nota3 * 0.6);
    let notaFinal = evalContinua > nota3 ? evalContinua : nota3;

    return notaFinal;

}

let condicion;

do {
    let primerParcial = Number(prompt("Introduce la nota del primer parcial"));
    let segundoParcial = Number(prompt("Introduce la nota del segundo parcial"));
    let examenFinal = Number(prompt("Introduce la nota del examen final"));
    notaFinal(primerParcial, segundoParcial, examenFinal);
    condicion = prompt("¿Quieres calcular otra nota? (s/n)").toLowerCase();
} while (condicion !== 'n');

// - Ejercicio 17. La empresa que fabrica un modelo de máquinas expendedoras de refrescos necesita un programa para
// - estas máquinas que realice el cálculo de cuántas monedas de cada tipo debe devolver.
// - Para ello, en primer lugar, se introducirá por teclado la cantidad a devolver en euros.
// - Para devolver el dinero se dispone de monedas de 50, 20, 10, 5, 2 y 1 céntimo. 
// - Siempre se dispone de monedas necesarias de todos los tipos y es necesario devolver el menor número de monedas posible.

let cantidadDevolver = Number(prompt("Introduce la cantidad en euros a devolver"));

let devolverMonedas = (num) => {
    let cantidadEnCentimos = num * 100;
    let monedas = [50, 20, 10, 5, 2, 1];
    let cantidadMonedas = [];

    for (let i = 0; i < monedas.length; i++) {

        while (cantidadEnCentimos >= monedas[i]) {
            cantidadMonedas.push(monedas[i]);
            cantidadEnCentimos -= monedas[i];
        }

        if (cantidadEnCentimos === 0) {
            break;
        }

    }

    return cantidadMonedas;
}

// - Ejercicio 18. Escribir el código de una función a la que se pasa como parámetro un número entero y devuelve como resultado una 
// - cadena de texto que indica si el número es par o impar. Mostrar por pantalla el resultado devuelto por la función.

let numParOImpar = Math.floor(Number(prompt("Introduce un número")));

let parOImpar = (num) => {
    return num % 2 === 0 ? "Par" : "Impar";
}

console.log(parOImpar(numParOImpar));


// - Ejercicio 19. Realizar una página con un script que calcule el valor de la letra de un número de DNI.
// - El algoritmo para calcular la letra del dni es el siguiente :
// - El número debe ser entre 0 y 99999999.
// - Debemos calcular el resto de la división entera entre el número y el número 23.
// - Según el resultado, de 0 a 22, le corresponderá una letra de las siguientes: 
// - (T, R, W, A, G, M, Y, F, P, D, X, B, N, J, Z, S, Q, V, H, L, C, K, E)
// - Si lo introducido no es un número deberá indicarse con un alert y volver a preguntar.
// - Deberá de repetirse el proceso hasta que el usuario pulse «cancelar»
let letrasDni = [
    "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B",
    "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E",
];

while (!correcto) {
    let numeroDni = Number(prompt("Introduce un número de DNI"));
    if (isNaN(numeroDni) || numeroDni < 0 || numeroDni > 99999999) {
        alert("Valor incorrecto, pruebe de nuevo");
        correcto = false;
    }
    else {
        let letraDni = letrasDni[numeroDni % 23];
        alert(`La letra de su DNI es: ${letraDni}`);
    }
}

// - Ejercicio 20. Crea una función que reciba un número de parámetros indeterminado y que devuelva la media
// - aritmética de los valores pasados.

let mediaAritmetica = (...numeros) => {
    // El método reduce() ejecuta una función que 'reduce' el array a un solo valor.
    // En este caso, la funcion (acc, num) => acc + num, 0 suma todo los elementos del array.
    // Acc es el acumulador que inicializamos a 0 y num es el valor actual que se va iterando.
    let suma = numeros.reduce((acc, num) => acc + num, 0);

    return suma / numeros.length;
}

