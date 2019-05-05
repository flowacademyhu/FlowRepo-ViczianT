let tomb = [ 4, 5, 2, 13, 8, 9 ];
let len = tomb.length;
let min = 0;
for (let i = 0; i < len; i++) {
  min = i;
  for (let j = i + 1; j < len; j++) {
    if (tomb[j] < tomb[min]) {
      min = j;
    }
  }
  if (i !== min) {
    let temp = tomb[i];
    tomb[i] = tomb[min];
    tomb[min] = temp;
  }
}

console.log(min);
console.log(tomb);
