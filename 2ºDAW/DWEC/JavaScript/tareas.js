// let max = prompt("Ingrese el número máximo para buscar primos");
// for (let index = 2; index < Number(max); index++) {
//   let esPrimo = true;
//   for (let index2 = 2; index2 < index; index2++) {
//     if (index % index2 == 0) {
//       esPrimo = false;
//       break;
//     }
//   }
//   if (esPrimo) {
//     console.log(index);
//   }
// }

let a = +prompt("a", "");

switch (a) {
  case 0:
    alert(0);
    break;

  case 1:
    alert(1);
    break;
  case 2:
  case 3:
    alert("2,3");
    break;

  default:
    break;
}
