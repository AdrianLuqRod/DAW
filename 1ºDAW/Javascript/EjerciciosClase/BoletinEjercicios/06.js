function divideNumeros(a, b) {
    if (typeof a !== "number" || typeof b !== "number" || b === 0) {
        return NaN;
    } else {
        return a / b;
    }
}

console.log(divideNumeros(1, 2));
console.log(divideNumeros("dsa", 2));
console.log(divideNumeros(1, 0));