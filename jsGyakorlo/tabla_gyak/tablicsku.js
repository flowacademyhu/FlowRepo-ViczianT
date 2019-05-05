const { table } = require('table');

let data,
  output;

data = [['0A', '0B', '0C'], ['1A', '1B', '1C'], ['2A', '2B', '2C']];

let config = {
  columns: {
    0: {
      alignment: 'left',
      width: 10
    },
    1: {
      alignment: 'center',
      width: 10
    },
    2: {
      alignment: 'right',
      width: 10
    }
  },
  border: {
    topBody: `─`,
    topJoin: `┬`,
    topLeft: `┌`,
    topRight: `┐`,

    bottomBody: `─`,
    bottomJoin: `┴`,
    bottomLeft: `└`,
    bottomRight: `┘`,

    bodyLeft: `│`,
    bodyRight: `│`,
    bodyJoin: `│`,

    joinBody: `─`,
    joinLeft: `├`,
    joinRight: `┤`,
    joinJoin: `┼`
  }
};

output = table(data, config);
console.log(output);
