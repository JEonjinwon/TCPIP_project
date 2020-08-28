let hours = (new Date()).getHours();

console.log(hours < 3 || 8 < hours);
console.log(3 <= hours && hours <= 8);

let pi = 3.14159265;
let radius = 10;

console.log(`둘레: ${2*pi*radius}`);
console.log(`넓이: ${pi*radius*radius}`)

let output = 0;
output += 52;
output += 273;
output += 103;

console.log(output);

let output1 = "hello";
output1 += " world";
output1 += " !";
console.log(output1);

let nan = Number("안녕하세요");
console.log(nan == nan);
console.log(nan != nan);
console.log(isNaN(nan));
