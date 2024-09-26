/*Solution-1:
1.
let str = "123";
let num = Number(str);
console.log(num, typeof num); // 123 number
2.
let str = "123";
let num = +str;
console.log(num, typeof num); // 123 number
3.
let str = "123";
let num = parseInt(str);
console.log(num, typeof num); // 123 number

Problem-2:
1.
let str = "123.45";
let num = parseFloat(str);
console.log(num, typeof num); // 123.45 number

Problem-3:
1.
let num = 123;
let str1 = String(num);
let str2 = num.toString();
console.log(`Using the Method: ${str2}\nWith using Constructor: ${str1}.`);
// Using the Method: 123
// With using Constructor: 123.

Problem-4:
1.
let str1 = "true";
let str2 = "";
let bool1 = Boolean(str1);
let bool2 = Boolean(str2);
console.log(bool1); // true
console.log(bool2); // false

Problem-5:
1.
let bool = true;
let str1 = bool.toString();
let str2 = String(bool);
console.log(`With Using Constructor: ${str2}\nWith using method: ${str1}`);

Problem-6:
1.
let arr = [1, 2, 3];
let str = arr.toString();
console.log(str); // 1,2,3
2.
let str = "1,2,3";
let arr = str.split(",");
console.log(arr); // [ '1', '2', '3' ]
*/