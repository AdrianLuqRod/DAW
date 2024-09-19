console.log("MENU CALCULÍN");
console.log("1 – Calcular el cuadrado de un número");
console.log("2 – Calcular el 20% de un número");
console.log("3 – Calcular la mitad de un número");
let opcion = prompt("Dime la opcion que quieres elegir");
let numero = Number(prompt("Dime el numero con el que quieres operar"));
switch (opcion) {
    case "1":
        console.log("El cuadrado es: "+numero*numero);
        break;

    case "2":
        console.log("El 20% es: "+numero*0.2);
        break;

    case "3":
        console.log("La mitad es: "+numero/2);
        break;

    default:
        console.log("Opcion incorrecta");
        break;
}