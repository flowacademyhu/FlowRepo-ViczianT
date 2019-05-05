var countBits = function (n) {
  let bin = parseInt(n, 10).toString(2);
  let result = 0;
  for (let i = 0; i < bin.length; i++) {
    if (bin.charAt(i) === '1') {
      result++;
    }
  }
  return result;
};

console.log(countBits(34));
