let tomb = [ 4, 5, 2, 13, 8, 9 ];
let n = tomb.length;
for (let i = 0; i < n - 1; i++) {
  for (let j = i + 1; j < n; j++) {
    if (tomb[i] > tomb[j]) {
      let temp = tomb[i];
      tomb[i] = tomb[j];
      tomb[j] = temp;
    }
  }
}
console.log(tomb);
