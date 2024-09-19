let producto = {
    nombre: "Auriculares BT",
    precio: 23,
    stock: 44,
    importeEnStock: function () { return this.precio * this.stock }
}
let producto2 = {
    nombre: "Pantalla",
    precio: 20,
    stock: 2,
    importeEnStock: function () { return this.precio * this.stock }
}

let producto3 = {
    nombre: "Mouse",
    precio: 50,
    stock: 90,
    importeEnStock: function () { return this.precio * this.stock }
}


let array = [];
array[0] = producto;
array[1] = producto2;
array[2] = producto3;

for (let iterator of array) {
    console.log("Nombre: " + iterator.nombre + " -Precio: " + iterator.precio + "€ - Stock: " + iterator.stock + " unidades - Importe en stock: " + iterator.importeEnStock() + "€");
}