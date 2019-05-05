function generate2d (size) {
  let arr = new Array(size);
  for (let i = 0; i < size; i++) {
    arr[i] = new Array(size);
  }
  return arr;
}

function fill2D (arr) {
  let fillValue = 0;
  for (let y = 0; y < arr.length; y++) {
    for (let x = 0; x < arr[y].length; x++) {
      arr[y][x] = fillValue;
    }
  }
}
let probatomb = generate2d(5);
fill2D(probatomb);
// console.log(probatomb);

function moveValue (arr) {
  let newValue = 1;
  let randomIndY = Math.floor(Math.random() * arr.length);
  for (let y = 0; y < arr.length; y++) {
    for (let x = 0; x < arr[y].length; x++) {
      if (arr[randomIndY][0] !== newValue) {
        arr[randomIndY][0] = newValue;
      }
      let temp = arr[randomIndY][0];
      arr[randomIndY][0] = arr[randomIndY][0 + x];
      arr[randomIndY][0 + x] = temp;
    }
  }
}
moveValue(probatomb);
console.log(probatomb);
