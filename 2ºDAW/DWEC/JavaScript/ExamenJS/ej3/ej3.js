let flag = false;
let num;

while (!flag) {
  num = prompt("Introduce un numero mayor que 100");
  if (typeof (num / 1) === "number" || num !== NaN || null === "") {
    flag = (num > 100) | (num === "") ? true : false;
  } else {
    alert("Numero introducido no válido");
  }
}

let muestraPrimosMenores = (num) => {
  for (let i = 2; i < num; i++) {
    let flag = true;

    for (let j = 2; j < i; j++) {
      if (i % j === 0) {
        flag = false;
        break;
      }
    }
    if (flag) {
      alert(i);
    }
  }
};

muestraPrimosMenores(num);
