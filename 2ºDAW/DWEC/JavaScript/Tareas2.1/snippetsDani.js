// Determina si un número es primo o no
let isPrime = (n) => {
    if (n <= 1) return false;
    if (n <= 3) return true;
    if (n % 2 == 0 || n % 3 == 0) return false;
    // Todos los primos tienen la forma 6n ± 1
    for (let i = 5; i <= Math.sqrt(n); i += 6) {
        if (n % i == 0 || n % (i + 2) == 0) return false;
    }
    return true;
};
console.log(${ isPrime(23) }); // true

// Realiza una pregunta y ejecuta la función correspondiente
let ask = (question, yes, no) => (confirm(question) ? yes() : no());
ask(
    "Are you studying JavaScript?",
    () => alert("Awesome! Keep it up"),
    () => alert("Well, you should...")
);

// Devuelve un número (real) entre min y max + 1
let getRandom = (min, max) => Math.random() * (max - min) + min;
console.log(getRandom(20, 30));

// Ajusta un valor dentro de un rango
let clamp = (value, lower, upper) => {
    return Math.min(upper, Math.max(lower, value));
};
console.log(clamp(12, 15, 100)); // 15

// Desanida arreglos según la profundidad
let flatArray = (arr, depth = Infinity) => arr.flat(depth);
console.log(flatArray([1, [2, 3, 4], [[5]]])); // [1, 2, 3, 4, 5]
console.log(flatArray([1, [2, 3, 4].flat, [[5]]], 1)); // [1, 2, 3, 4, [5]]

// Opera sobre los elementos (Math)
let mapArray = (arr, callback) => arr.map((i) => callback(i));
console.log(mapArray([0.123, 3.1416], Math.floor)); // [0, 3]

// Elimina los elementos "falsos"
let compactArray = (arr) => arr.filter(Boolean);
console.log(compactArray([0, 1, false, "", 2])); // [1, 2]

// Subdivide un arreglo en sub-arreglos
const chunkArray = (arr, size) => {
    let result = [];
    for (let i = 0; i < arr.length;) {
        result.push(arr.slice(i, (i += size)));
    }
    return result;
};
console.log(chunkArray([1, 2, 3, 4, 5], 2)); // [[1, 2], [3, 4], [5]]

// Cuenta las ocurrencias de un elemento
let count = (arr, n) => arr.reduce((acc, i) => acc + (i == n), 0);
console.log(count([1, 2, 3, 3], 3)); // 2

// Filtra los elementos repetidos
let unique = (arr) => arr.filter((i) => arr.indexOf(i) == arr.lastIndexOf(i));
console.log(unique([1, 2, 3, 3])); // [1, 2]

// Devuelve el DNI con el dígito de control
let dni = (n) => ${ n }${ "TRWAGMYFPDXBNJZSQVHLCKE"[n % 23]};
console.log(dni(22551234)); // 22551234X

// Opera entre dos arreglos elemento a elemento
let operate = (a1, a2, call) => a1.map((val, i) => call(val, a2[i] || 0));
console.log(operate([1, 2, 3], [4, 5], (a, b) => a + b)); // [5, 7, 3]

// NOTA: En caso de querer multiplicar, dividir o exponenciar...
operate = (a1, a2, call) => a1.map((val, i) => call(val, a2[i] || 1));
console.log(operate([1, 2, 3], [4, 5], (a, b) => a / b)); // [0.25, 0.4, 3]

// Convierte un número de una base a otra
let convertBase = (num, from, to) => parseInt(num, from).toString(to);
console.log(convertBase("110010", 2, 10)); // 50

// Revierte la cadena
let reverseString = (str) => [...str].reverse().join("");
console.log(reverseString("Hello world!")); // !dlrow olleH

// Comprueba si una palabra es palíndroma
let isPalindrome = (str) => str == reverseString(str);
console.log(isPalindrome("level")); // true

// Calcula el factorial de un número
let factorial = (n) => (n < 2 ? 1 : n * factorial(n - 1));
console.log(factorial(5)); // 120

// Calcula la potencia de un número (sin Math)
let pow = (n, p) => (p == 0 ? 1 : n * pow(n, p - 1));
console.log(pow(2, 3)); // 8

// Determina si un número es de Armstrong
const isArmstrong = (n) => {
    let digits = ${ n }.length;
    return n == [...${ n }].reduce((sum, digit) => sum + pow(digit, digits), 0);
};
console.log(isArmstrong(153, 3)); // true (número narcisista)
console.log(isArmstrong(8208, 4)); // true

// Reemplaza todas las instancias de una subcadena por otra
let replace = (str, sub1, sub2) => str.replace(new RegExp(sub1, "g"), sub2);
console.log(replace("interesting", "in", "AAA")); // AAAterestAAAg

// Devuelve la palabra más repetida en una frase
let mostFrequentWord = (str) => {
    let count = new Map();
    str
        .toLowerCase()
        .split(/\s+/)
        .forEach((word) => count.set(word, (count.get(word) || 0) + 1));
    return [...count.entries()].reduce((a, b) => (a[1] > b[1] ? a : b))[0];
};
console.log(mostFrequentWord("It is very cool, isn't it true?")); // it

// Agrega separadores de miles a un número
let addComma = (n) => {
    let [int, float] = ${ n }.split(".");
    let [count, result] = [0, ""];
    for (let i = int.length - 1; i >= 0; i -= 1) {
        count++;
        result = int[i] + result;
        if (count % 3 == 0 && i != 0) {
            result = "," + result;
        }
    }
    return float ? result + .${ float } : result;
};
console.log(addComma(1222333444)); // 1,222,333,444

// Devuelve la fecha con el formato deseado
let formatDate = (date, format) =>
    format
        .replace("DD", ${ date.getDate() }.padStart(2, "0"))
        .replace("MM", ${ date.getMonth() + 1 }.padStart(2, "0"))
        .replace("YYYY", date.getFullYear())
        .replace("HH", ${ date.getHours() }.padStart(2, "0"))
        .replace("mm", ${ date.getMinutes() }.padStart(2, "0"))
        .replace("ss", ${ date.getSeconds() }.padStart(2, "0"));
console.log(formatDate(new Date(), "DD/MM/YYYY | HH:mm:ss"));

// Calcula el máximo común divisor de dos números
let gcd = (a, b) => (b == 0 ? a : gcd(b, a % b));
console.log(gcd(30, 110)); // 10

// Calcula el mínimo común múltiplo de dos números
let mcm = (a, b) => (a * b) / gcd(a, b);
console.log(mcm(6, 10)); // 30