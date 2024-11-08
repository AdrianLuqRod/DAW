// - Ejercicio 2.


let alumnos = Math.floor(Math.random() * 11) + 20;
let afectados = Math.floor(Math.random() * 7) + 5;
let temperatura = Math.floor(Math.random() * 4) + 37;

console.log(`El total de alumnos en el aula es ${alumnos}, de ellos están afectados ${afectados} por la enfermedad,
    y la temperatura que están sufriendo es ${temperatura} grados centígrados.`);


// - Ejercicio 3.

let alternaMayusMinus = (str) => {
    let result = "";
    let contador = 0;
    for (let i = 0; i < str.length; i++) {
        if (str[i] === " ") {
            result += " ";
        } else {
            if (contador % 2 === 0) {
                result += str[i].toUpperCase();
            } else {
                result += str[i].toLowerCase();
            }
            contador++;
        }
    }
}

// - Ejercicio 4.

let contieneString = (str, texto) => {
    return str.toLowerCase().includes(texto.toLowerCase());
}

// - Ejercicio 5.

let truncaString = (str, length) => {
    return str.length > length ? str.slice(0, length) + "..." : str;
}

// - Ejercicio 6.

let precio = "€120.";

let extraerValor = (str) => {
    return parseInt(str.slice(1));
}

// - Ejercicio 1.

let numeros = [2, 22, 36, 350, 12, 500];

let ordenaNumsArray = (arr) => {
    return arr.sort((a, b) => a - b);
}

// - Ejercicio 2.

let ciudades = ["Madrid", "Sevilla", "Paris", "Munich", "Berlin", "Roma"];
let capitales = ["Madrid", "Berlin", "Roma", "Otawa", "Atenas"];

// . Listar por consola ciudades

console.log(ciudades);

//. Funcion que obtenga ciudades que son capitales

let ciudadesCapitales = (arr1, arr2) => {
    return arr1.filter((ciudad) => arr2.includes(ciudad));
}

//. Modificar anterior para que cree nuevo array

let ciudadesCapitalesNuevo = (arr1, arr2) => {
    let resultado = arr1.filter((ciudad) => arr2.includes(ciudad));

    return resultado;
}

//. Unir dos arrays

let unirArrays = (arr1, arr2) => {
    return arr1.concat(arr2);
}

//. Funcion flecha que guarde ciudades que no son capitales

let ciudadesNoCapitales = (arr1, arr2) => {
    return arr1.filter((ciudad) => !arr2.includes(ciudad));
}

// - Ejercicio 3.

let codigos = [1, -2, 3, 4, -9, 6];

let obtenerMaxSubsSums = (arr) => {
    let maxSum = 0;
    let currentSum = 0;

    for (let i = 0; i < obtenerMaxSubsSums.length; i++) {
        if (i + 1 <= obtenerMaxSubsSums.length) {

            if (arr[i] < 0 || arr[i + 1] < 0) {
                currentSum = 0;
            } else {
                currentSum = arr[i] + arr[i + 1];
            }

            maxSum = currentSum > maxSum ? currentSum : maxSum;

        } else {

            break;
        }
    }

    return maxSum;
}

// - Ejercicio 5.

let caramelizar = (str) => {
    let result = "";
    for (let i = 0; i < str.length; i++) {
        if (str.charAt(i) === "-") {
            result += str.charAt(i + 1).toUpperCase();
            i++;
        } else {
            result += str.charAt(i);
        }

    }

    return result;
}

// - Ejercicio 6.

let filtrarRango = (arr, a, b) => {
    let result = [];
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] >= a && arr[i] <= b) {
            result.push(arr[i]);
        }
    }

    return result;
}

// - Ejercicio 7.

let filtrarRangoEnLugar = (arr, a, b) => {
    arr = arr.filter((num) => num >= a && num <= b);
}

// - Ejercicio 8.

let ordenaDecreciente = (arr) => {
    return arr.sort((a, b) => b - a);
}

// - Ejercicio 9.

let copiaOrdenada = (arr) => {
    let result = arr.sort((a, b) => a - b);

    return result;
}

// - Ejercicio 11.

let unico = (arr) => {
    return arr.filter((elem) => arr.indexOf(elem) === arr.lastIndexOf(elem));
}

// - Ejercicio 13.

let aclean = (arr) => {
    let result = [];
    for (let i = 0; i < arr.length; i++) {
        let palabra = arr[i].toLowerCase().split("").sort().join("");
        if (!result.includes(palabra)) {
            result.push(arr[i]);
        }
    }

    return result;
}

// - Ejercicio 14.

let fecha = new Date(2012, 1, 20, 3, 12);
console.log(fecha.toLocaleString());

// - Ejercicio 15.

let getWeekDay = (date) => {
    let num = date.getDay();

    switch (num) {
        case 0:
            console.log("SU");

            break;

        case 1:
            console.log("MO");

            break;

        case 2:
            console.log("TU");

            break;

        case 3:
            console.log("WE");

            break;

        case 4:
            console.log("TH");

            break;

        case 5:
            console.log("FR");

            break;

        case 6:
            console.log("SA");

            break;

        default:
            break;
    }
}

// - Ejercicio 16.

let getLocalDay = (date) => {
    let num = date.getDay();

    return num === 0 ? 7 : num;
}

// - Ejercicio 17.

let getDateAgo = (date, days) => {
    let newDate = new Date(date);
    newDate.setDate(date.getDate() - days);

    return newDate.getDate();
}

// - Ejercicio 18.

let getLastDayOfMonth = (year, month) => {
    let date = new Date(year, month + 1, 0);
    return date.getDate();
}

// -Ejercicio 19.

let getSecondsToday = () => {
    let date = new Date();
    let today = new Date(date.getFullYear(), date.getMonth(), date.getDate());
    let diff = date - today;
}

// - Ejercicio 20.

let getSecondsToTomorrow = () => {
    let date = new Date();
    let tomorrow = new Date(date.getFullYear(), date.getMonth(), date.getDate() + 1);
    let diff = tomorrow - date;
}

// - Ejercicio 21.

let formatDate = (date) => {
    let diff = new Date() - date;

    if (diff < 1000) {
        return "ahora mismo"
    }
    else if (diff < 60000) {
        return `${Math.floor(diff / 1000)} segundos atrás`
    }
    if (diff < 3600000) {
        return `${Math.floor(diff / 60000)} minutos atrás`
    } else {
        let day = date.getDate().toString().padStart(2, '0');
        let month = (date.getMonth() + 1).toString().padStart(2, '0');
        let year = date.getFullYear().toString().slice(-2);
        let hours = date.getHours().toString().padStart(2, '0');
        let minutes = date.getMinutes().toString().padStart(2, '0');
        return `${day}.${month}.${year} ${hours}:${minutes}`;
    }
}