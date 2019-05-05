function fibo (num) {
  return fibo(num - 1) + fibo(num - 2);
}

console.log(fibo(6));
