let contains = (tomb, givenNo) => {
  let readline = require('readline-sync');
  givenNo = readline.questionInt('Adj meg egy szamot 0-10 között: ');
  tomb = require('./generateArray');
  console.log(tomb);
  for (let i = 0; i < tomb.length; i++) {
    if (tomb[i] === givenNo) {
      return true;
    }
  }
  return false;
};

contains();
