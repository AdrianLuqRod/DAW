let codigos = [1, -2, 3, 4, -9, 6];

let obtenerMaxSubsSum = (codigos) => {
  let maxSum = 0;
  let sum = 0;
  let valor1 = 0;
  let valor2 = 0;

  for (let i = 0; i < codigos.length; i++) {
    sum = 0;

    for (let j = i; j <= i + 1; j++) {
      if (codigos[i + 1] === undefined) {
        break;
      }
      sum += codigos[j];
    }
    if (sum > maxSum) {
      maxSum = sum;

      valor1 = codigos[i];
      valor2 = codigos[i + 1];
    }
  }
  console.log(`Los valores sumados son ${valor1} y ${valor2}`);

  return maxSum;
};

console.log(obtenerMaxSubsSum(codigos)); // 7
