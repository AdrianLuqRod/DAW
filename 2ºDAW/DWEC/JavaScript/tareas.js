function esPrimo(num) {
  if (num <= 1) return false;
  for (let i = 2; i < num; i++) {
    if (num % i === 0) return false;
  }
  return true;
}

function descomposionNumero(num) {
  for (let i = 2; i <= num; i++) {
    while (num % i === 0) {
      console.log(i + " ");
      num /= i;
    }
  }
}

let input;

while (true) {
  input = prompt("Introduce un numero: ");
  if (input === "") break;
  let num = parseInt(input);
  let numSuma = 0;
  if (!isNaN(num)) {
    numSuma += num;
  }
}
console.log(`La suma de los numeros es: ${numSuma}`);

if (isPrimo(numSuma)) {
  console.log("El numero es primo");
} else {
  console.log("El numero no es primo");
  descomposionNumero(numSuma);
}
