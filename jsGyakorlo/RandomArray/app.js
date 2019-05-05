let arrayModule = require('./arrayModule');

function minInc (array) {
  let minValue;
  for (let y = 0; y < array.length; y++) {
    for (let x = 0; x < array[y].length; x++) {
      minValue = Math.min(array[y][x]);
      let index1 = array.indexOf(minValue);
    }
  }
  console.log(array);
}
minInc(arrayModule.fillArray(arrayModule.arrayGen(3, 8)));
