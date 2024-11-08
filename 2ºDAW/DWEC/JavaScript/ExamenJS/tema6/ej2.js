// Definición del objeto Producto_alimenticio
function Producto_alimenticio(codigo, nombre, precio) {
  this.codigo = codigo;
  this.nombre = nombre;
  this.precio = precio;

  this.imprimeDatos = function () {
    console.log(
      `Código: ${this.codigo}, Nombre: ${this.nombre}, Precio: ${this.precio}`
    );
  };
}

// Creación de tres instancias del objeto Producto_alimenticio
let producto1 = new Producto_alimenticio(1, "Manzana", 0.5);
let producto2 = new Producto_alimenticio(2, "Pan", 1.2);
let producto3 = new Producto_alimenticio(3, "Leche", 0.9);

// Guardar las instancias en un array
let productos = [producto1, producto2, producto3];

// Utilizar el método imprimeDatos para mostrar los valores de los tres objetos instanciados
productos.forEach((producto) => producto.imprimeDatos());
