Array.prototype.eliminarValor = function (valor) {
  const index = this.indexOf(valor);
  if (index > -1) {
    this.splice(index, 1);
  }
  return this;
};

// Ejemplo de uso:
let array = [1, 2, 3, 4, 5];
array.eliminarValor(3);
console.log(array); // [1, 2, 4, 5]
