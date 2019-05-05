var gimme = function (inputArray) {
  if (inputArray[0] < inputArray[1] < inputArray[2]) {
    return 1;
  } else if (inputArray[1] < inputArray[0] < inputArray[2]) {
    return 0;
  } else {
    return 2;
  }
}
console.log(gimme([2, 3, 1]));
