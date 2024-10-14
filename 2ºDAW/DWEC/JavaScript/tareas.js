for (let index = 100; index < 1000; index++) {
  let centenas = parseInt(index / 100);
  let decenas = parseInt((index % 100) / 10);
  let unidades = parseInt(index % 10);
  centenas = centenas ** 3;
  decenas = decenas ** 3;
  unidades = unidades ** 3;
  let numero = Number(centenas) + Number(decenas) + Number(unidades);
  if (Number(numero) === index) {
    console.log(index);
  }
}

for (let index = 100; index < 1000; index++) {
  let centenas = Math.floor(index / 100);
  let decenas = Math.floor((index % 100) / 10);
  let unidades = index % 10;
  if (
    index ===
    Math.pow(centenas, 3) + Math.pow(decenas, 3) + Math.pow(unidades, 3)
  ) {
    console.log(index);
  }
}
