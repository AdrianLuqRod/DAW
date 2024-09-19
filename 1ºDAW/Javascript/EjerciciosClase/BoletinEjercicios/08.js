let producto = {
    nombre: "Auriculares BT",
    precio: 23,
    stock: 44
}

console.log(producto);

producto.importeEnStock = function () {
    return this.precio * this.stock;
}

producto.stock -= 3;
producto.precio += producto.precio * 0.05;

console.log(producto);
console.log(producto.importeEnStock());