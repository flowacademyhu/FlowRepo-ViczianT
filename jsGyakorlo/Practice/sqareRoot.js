function isPowerOfTwo (n) {
  if (n === 1) {
    return true;
  } else if (n === 0) {
    return false;
  } else {
    return Math.sqrt(n) === 0 ? true : false;
  }
}

console.log(isPowerOfTwo(512));
console.log(Math.sqrt(512));

console.log(Math.pow(2, 18));
console.log(Math.sqrt(262144));
