class Empleado {
  constructor(nombre = "", departamento = "General") {
    this.nombre = nombre;
    this.departamento = departamento;
  }
}

class Director extends Empleado {
  constructor(nombre = "", departamento = "General", informes = []) {
    super(nombre, departamento);
    this.informes = informes;
  }
}

class Trabajador extends Empleado {
  constructor(nombre = "", departamento = "General", proyectos = []) {
    super(nombre, departamento);
    this.proyectos = proyectos;
  }
}

class Ingeniero extends Trabajador {
  constructor(nombre = "", proyectos = [], maquina = "") {
    super(nombre, "Ingeniería", proyectos);
    this.maquina = maquina;
  }
}

// Casos de prueba
const empleado = new Empleado("Juan");
console.log(empleado); // Empleado { nombre: 'Juan', departamento: 'General' }

const director = new Director("Ana", "Administración", [
  "Informe1",
  "Informe2",
]);
console.log(director); // Director { nombre: 'Ana', departamento: 'Administración', informes: [ 'Informe1', 'Informe2' ] }

const trabajador = new Trabajador("Luis", "Producción", ["Proyecto1"]);
console.log(trabajador); // Trabajador { nombre: 'Luis', departamento: 'Producción', proyectos: [ 'Proyecto1' ] }

const ingeniero = new Ingeniero("Carlos", ["Proyecto2"], "Máquina1");
console.log(ingeniero); // Ingeniero { nombre: 'Carlos', departamento: 'Ingeniería', proyectos: [ 'Proyecto2' ], maquina: 'Máquina1' }
