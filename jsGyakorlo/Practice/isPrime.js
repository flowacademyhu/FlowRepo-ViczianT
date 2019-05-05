function isPrime (num) {
  let prime = true;
  let divisor = 2;

  while (divisor < num) {
    if (num % divisor === 0) {
      prime = false;
      break;
    }
    divisor++;
  }
  return prime;
}

console.log(isPrime(11));
