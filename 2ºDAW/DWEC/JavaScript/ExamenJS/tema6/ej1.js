// a. Crear constructor.
// b. Crear propiedades: marca, modelo, color y año fabricación.
class Vehiculo {
  constructor(marca, modelo, color, anioFabricacion) {
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
    this.anioFabricacion = anioFabricacion;
  }
}

// c. Instanciar dos objetos.
const vehiculo1 = new Vehiculo("Toyota", "Corolla", "Rojo", 2019);
const vehiculo2 = new Vehiculo("Honda", "Civic", "Azul", 2020);

// d. Mostrar por pantalla una propiedad con notación por puntos. Objeto 1 - marca.
console.log("Objeto 1 - Marca: " + vehiculo1.marca);

// e. Mostrar por pantalla una propiedad con notación por corchetes. Objeto 2 - color.
console.log(`Objeto 1 - Marca: ${vehiculo2.color}`);
console.log(vehiculo2["color"]);

// f. Crear el método mostrarDatos.
Vehiculo.prototype.mostrarDatos = function () {
  console.log(
    `Marca: ${this.marca}, Modelo: ${this.modelo}, Color: ${this.color}, Año: ${this.anioFabricacion}`
  );
};

// g. Crear un método que tenga argumentos acelerar(velocidad).
Vehiculo.prototype.acelerar = function (velocidad) {
  console.log(`El coche ha acelerado a ${velocidad} km/h`);
};

// h. Crear un método con función interna arrancar.
Vehiculo.prototype.arrancar = function () {
  console.log(
    `El coche de marca ${this.marca}, modelo ${this.modelo}, de color ${this.color} ha arrancado`
  );
};

// i. Asignar una nueva propiedad cilindrada.
vehiculo1.cilindrada = "2000cc";
vehiculo2.cilindrada = "1800cc";

// j. Asignar un nuevo método frenar.
Vehiculo.prototype.frenar = function () {
  console.log(
    `El coche de marca ${this.marca}, modelo ${this.modelo}, color ${this.color} ha parado`
  );
};

// k. Realizar las siguientes modificaciones en el Objeto 1
Object.defineProperty(vehiculo1, "marca", {
  configurable: false,
});

Object.defineProperty(vehiculo1, "modelo", {
  value: "xx",
  writable: false,
});

Object.defineProperty(Vehiculo.prototype, "mostrarDatos", {
  enumerable: false,
});

Object.defineProperty(Vehiculo.prototype, "acelerar", {
  enumerable: false,
});

Object.defineProperty(Vehiculo.prototype, "arrancar", {
  enumerable: false,
});

Object.defineProperty(Vehiculo.prototype, "frenar", {
  enumerable: false,
});

// l. Borrar la propiedad marca, modificar la propiedad modelo y volver a mostrar los datos de Objeto 1.
delete vehiculo1.marca;
vehiculo1.modelo = "Camry";
vehiculo1.mostrarDatos();

// m. Muestra todas las propiedades de Objeto1 utilizando: for in , Object.getOwnPropertyNames(), Object.keys().
for (let prop in vehiculo1) {
  console.log(prop);
}

console.log(Object.getOwnPropertyNames(vehiculo1));
console.log(Object.keys(vehiculo1));

//1.b
const vehiculos = [
  new Vehiculo("Ferrari", "Scaglietti", "Rojo", 2010),
  new Vehiculo("BMW", "Z4", "Blanco", 2010),
  new Vehiculo("Seat", "Toledo", "Azul", 1999),
  new Vehiculo("Fiat", "500", "Verde", 1995),
];

let tablaHTML =
  "<table border='1'><tr><th>MARCA</th><th>MODELO</th><th>COLOR</th><th>AÑO FABRICACIÓN</th></tr>";

vehiculos.forEach((vehiculo) => {
  tablaHTML += `<tr>
    <td>${vehiculo.marca}</td>
    <td>${vehiculo.modelo}</td>
    <td>${vehiculo.color}</td>
    <td>${vehiculo.anioFabricacion}</td>
  </tr>`;
});

tablaHTML += "</table>";

document.write(tablaHTML);
