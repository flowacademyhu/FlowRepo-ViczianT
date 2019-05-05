function dontGiveMeFive (start, end) {
  let nums = [];
  let patt = /[5]/g;
  for (let i = start; i <= end; i++) {
    nums.push(i);
  }
  let index = nums.indexOf(patt);
  if (index > -1) {
    nums.splice(index, 1);
    console.log(index);
  }
}
dontGiveMeFive(4, 17);
