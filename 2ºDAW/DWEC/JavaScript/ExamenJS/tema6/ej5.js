// Definición del objeto Vehiculo
function Vehiculo(marca, modelo) {
  this.marca = marca;
  this.modelo = modelo;
}

// Definición del objeto Furgoneta que hereda de Vehiculo
function Furgoneta(marca, modelo, numPasajeros) {
  Vehiculo.call(this, marca, modelo);
  this.numPasajeros = numPasajeros;
}

// Herencia de Vehiculo
Furgoneta.prototype = Object.create(Vehiculo.prototype);
Furgoneta.prototype.constructor = Furgoneta;

// Definición del objeto Todoterreno que hereda de Vehiculo
function Todoterreno(marca, modelo, tieneTraccion) {
  Vehiculo.call(this, marca, modelo);
  this.tieneTraccion = tieneTraccion;
}

// Herencia de Vehiculo
Todoterreno.prototype = Object.create(Vehiculo.prototype);
Todoterreno.prototype.constructor = Todoterreno;

// Crear instancias de Furgoneta y Todoterreno
const miFurgoneta = new Furgoneta("Ford", "Transit", 12);
const miTodoterreno = new Todoterreno("Jeep", "Wrangler", true);

// Mostrar los datos
console.log("Furgoneta:", miFurgoneta);
console.log("Todoterreno:", miTodoterreno);
