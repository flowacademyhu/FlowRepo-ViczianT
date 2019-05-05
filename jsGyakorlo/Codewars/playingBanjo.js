function areYouPlayingBanjo (name) {
  if (/^r/.test(name) || /^R/.test(name)) {
    console.log(name + ' plays banjo');
  } else {
    console.log(name + ' does not play banjo');
  }
  // return name;
}
areYouPlayingBanjo('Rikka');
