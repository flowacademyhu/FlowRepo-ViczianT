// let array = [3, 7, 8, 2, 5];
// let key = 4;
let ujTomb = [];
function isGreater (kulcs, tomb) {
  for (let i = 0; i < tomb.length; i++) {
    if (tomb[i] > kulcs) {
      ujTomb.push(tomb[i]);
    }
  }
}

isGreater(5, [3, 7, 8, 2, 5, 10, 1, 1, 3, 4, 6, 6, 3, 8, 7, 9, 245245]);
console.log(ujTomb);
// console.log(ujTomb.length);
