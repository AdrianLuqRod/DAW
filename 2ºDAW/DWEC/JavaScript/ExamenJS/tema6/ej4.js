function Factura(
  cliente,
  elementos,
  info = { baseImponible: 0, iva: 21, total: 0, formaPago: "contado" }
) {
  this.cliente = cliente;
  this.elementos = elementos;
  this.info = info;
  this.empresa = {
    nombre: "",
    direccion: "",
    telefono: "",
    cif: "",
  };
}

Factura.prototype.calcularTotal = function () {
  let baseImponible = 0;
  for (let i = 0; i < this.elementos.length; i++) {
    baseImponible += this.elementos[i].cantidad * this.elementos[i].precio;
  }
  this.info.baseImponible = baseImponible;
  this.info.total = baseImponible + (baseImponible * this.info.iva) / 100;
};

Factura.prototype.mostrarTotal = function () {
  console.log(`Total factura: ${this.info.total}€`);
};

// Ejemplo de uso
const cliente = {
  nombre: "Juan Pérez",
  direccion: "Calle Falsa 123",
  telefono: "123456789",
  nif: "12345678A",
};

const elementos = [
  { descripcion: "Producto 1", cantidad: 2, precio: 10 },
  { descripcion: "Producto 2", cantidad: 1, precio: 20 },
];

const factura = new Factura(cliente, elementos);
factura.calcularTotal();
factura.mostrarTotal();
