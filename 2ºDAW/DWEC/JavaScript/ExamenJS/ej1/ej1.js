/*a)
 Escribe una función que obtenga un array, busque los elementos con
 valor mayor o igual a a y menor o igual a b y devuelva un array con
 los resultados. La función no debe modificar el array. Debe devolver
 un nuevo array. */

let filtraArray = (arr, a, b) => {
  /* 
  Creamos una variable arrayFiltrado que contiene mediante un filtro
  los valores dentro de arr que cumplan la condicion de que el num sea >=a y 
  <= b
    */
  let arrayFiltrado = arr.filter((element) => element >= a && element <= b);

  return arrayFiltrado;
};

//Ejemplo de la función
let array = [1, 2, 3, 4, 5, 6];

console.log(filtraArray(array, 1, 4)); // [1,2,3,4]

/*b)
Escribe una función que obtenga un array y remueva del mismo todos los valores 
excepto aquellos que se encuentran entre a y b. La función solo debe modificar el 
array y tú debes comprobar que lo hace.
 */

let modificaArray = (arr, a, b) => {
  /* 
    Utilizamos un bucle for para recorrer el array y utilizamos el método .splice()
    para eliminar los valores que están fuera del rango [a, b]. 
    Recorremos el array y en el momento que se cumpla la condicion de que un numero sea
    <a || > b borramos del array ese num Y AJUSTAMOS EL INDICE ya que hemos eliminado un 
    elemento del array.
    */

  for (let i = 0; i < arr.length; i++) {
    if (arr[i] < a || arr[i] > b) {
      arr.splice(i, 1);
      i--; // Ajustamos el índice después de eliminar un elemento
    }
  }
  // No devolvemos nada ya que queremos modificar el valor del propio array, no crear uno nuevo
};

//Ejemplo apartado b)

let array2 = [0, 1, 2, 3, 4, 5];

console.log(array2); // [0,1,2,3,4,5]

modificaArray(array2, 1, 4);

console.log(array2); // [1,2,3,4]
