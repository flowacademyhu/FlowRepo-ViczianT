function generare2d (size) {
  let arr = new Array(size);
  for (let i = 0; i < size; i++) {
    arr[i] = new Array(size);
  }
  return arr;
}
let tomb1 = generare2d(5);

function fill2d (arr) {
  let fillValue = 0;
  for (let y = 0; y < arr.length; y++) {
    for (let x = 0; x < arr[y].length; x++) {
      arr[y][x] = fillValue;
    }
  }
}
fill2d(tomb1);

function print2d (arr) {
  for (let y = 0; y < arr.length; y++) {
    for (let x = 0; x < arr[y].length; x++) {
      process.stdout.write(arr[y][x] + 'e');
    }
    console.log(arr);
  }
}
print2d(tomb1);
