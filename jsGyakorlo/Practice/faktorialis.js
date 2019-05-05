function fakt (num) {
  if (num <= 1) {
    return 1;
  }
  return num * fakt(num - 1);
}

console.log(fakt(6));

function fakt2 (num) {
  let result = 1;
  let i = 2;

  while (i <= num) {
    result = result * i;
    i++;
  }
  return result;
}

console.log(fakt2(3));
