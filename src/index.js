const { math } = require('./utils')

console.log(`Next year is ${math.add(2018, 1)}.`)
console.log(`${math.subtract(2020, 2018)} years until Tokyo Olympic.`)
console.log(`The tax of 100 yen is ${math.multiply(100, 0.1)} yen if the tax rate is 10%.`);
console.log(`I baked 10 cookies. There're 5 people here so you can eat ${math.divide(10, 5)}.`);

