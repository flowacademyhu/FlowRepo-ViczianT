let staircase = [[]];
let num = 6;
for (let i = 0; i < num; i++) {
  for (let j = 0; j < num; j++) {
    staircase[i][j].push(['#']['&']);
  }
}
console.log(staircase);
