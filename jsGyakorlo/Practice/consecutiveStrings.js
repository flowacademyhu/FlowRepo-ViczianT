function longestConsecTry (strarr) {
  let longest = '';
  for (let i = 0; i < strarr.length - 1; i++) {
    if (strarr[i].length > strarr[i + 1].length) {
      longest = strarr[i];
      console.log(longest);
    }
  }
  return longest;
}

console.log(longestConsecTry(['zone', 'abigail', 'theta', 'form', 'libe', 'zas']));

let arr = ['zone', 'abigail', 'theta', 'form', 'spfagpfnpmqwrm', 'libe', 'zas'];
arr.sort(function (a, b) {
  return a.length - b.length;
});
console.log(arr);

function longestConsec (strarr, k) {
  let sorted = strarr.sort(function (a, b) { return b.length - a.length; });
  for (let i = 0; i < k; i++) {

  }
}