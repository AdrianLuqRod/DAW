let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let a = 2;
let b = 6;

let filtrarRangoEnLugar = (arr, a, b) => {
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] < a || arr[i] > b) {
      arr.splice(i, -1);
    }
  }
  return arr;
}

console.log(filtrarRangoEnLugar(arr, a, b));