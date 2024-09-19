function reponeUnidades(producto, numero) {
    producto.stock += numero;
}
let producto = {
    nombre: "Auriculares BT",
    precio: 23,
    stock: 10
}
console.log(producto);
reponeUnidades(producto, 20)
console.log(producto);