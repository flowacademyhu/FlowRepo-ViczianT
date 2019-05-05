function accum(s) {
  let temp = s.split('');
  let result = [];
  for (let i = 0; i < temp.length; i++) {
    result = temp * temp[i];
    result.toString();
  }
}
accum(dkHn);
