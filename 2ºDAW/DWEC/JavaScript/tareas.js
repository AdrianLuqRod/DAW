// Este es el archivo JavaScript inicial para el ejercicio de calidad de código

// Variables globales
var data = [1, 2, 3, 4, 5];
var total = 0;

// Función para calcular la suma de los elementos del array
function sumArray(arr) {
  for (var i = 0; i < arr.length; i++) {
    total += arr[i];
  }

  return total;
}

// Función para calcular el promedio de los elementos del array
function averageArray(arr) {
  var sum = sumArray(arr);
  var average = sum / arr.length;

  return average;
}

// Función para buscar un elemento en el array
function findElement(arr, element) {
  for (var i = 0; i < arr.length; i++) {
    if (arr[i] === element) {
      return true;
    }
  }

  return false;
}

// Ejecución del código
console.log('Suma:', sumArray(data));
console.log('Promedio:', averageArray(data));
console.log('¿Contiene el número 3?', findElement(data, 3));