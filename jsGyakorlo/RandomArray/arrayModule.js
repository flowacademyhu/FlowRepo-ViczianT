function arrayGen (rows, columns) {
  let array = new Array(rows);
  for (let i = 0; i < rows; i++) {
    array[i] = new Array(columns);
  }
  return array;
}
function fillArray (array) {
  let fillValue = 0;
  for (let y = 0; y < array.length; y++) {
    for (let x = 0; x < array[y].length; x++) {
      array[y][x] = fillValue;
    }
  }
  return array;
}

module.exports = {
  fillArray,
  arrayGen
};
