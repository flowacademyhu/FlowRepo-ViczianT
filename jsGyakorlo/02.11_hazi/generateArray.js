const tomb = [];
let randomNumber;

for (let i = 0; i < 10; i++) {
  randomNumber = Math.floor((Math.random() * 10) + 1);
  tomb.push(randomNumber);
}
module.exports = { tomb };
