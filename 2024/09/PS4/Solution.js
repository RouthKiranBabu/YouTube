/*Solution-1:
1.
let num = 123.456789;
let res = num.toFixed(2);
console.log(res, typeof res); // 123.46 string

Solution-2:
1.
let num = 1234567.89;
let newval = num.toLocaleString("en-US", {style:'currency', currency: "USD"});
console.log(newval); // $1,234,567.89

2.
let num = 1234567.89;
let formatter = new Intl.NumberFormat('en-US', {style: 'decimal', minimumFractionDigits:2, maximumFractionDigits:2});
let val = formatter.format(num);
console.log(val); // 1,234,567.89

Solution-3:
1.
let num = 5;
let val = num.toString().padStart(5, "0");
console.log(val); // 00005

Solution-4:
1.
console.log(Number.MIN_SAFE_INTEGER); // -9007199254740991
2.
console.log(Number.MIN_SAFE_INTEGER - 1); // -9007199254740992
3.
console.log(Number.MAX_SAFE_INTEGER); // 9007199254740991
4.
console.log(Number.MAX_SAFE_INTEGER + 1); // 9007199254740992
5.
console.log(Number.MIN_VALUE); // 5e-324
6.
console.log(Number.MAX_VALUE); // 1.7976931348623157e+308
7.
console.log(Infinity); // Infinity
console.log(-Infinity); // -Infinity
*/