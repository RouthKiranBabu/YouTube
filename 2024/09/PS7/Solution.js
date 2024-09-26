/*Solution-1
1.
let obj = {name: "Routh", age: 23};
let jsonstr = JSON.stringify(obj);
console.log(obj); // { name: 'Routh', age: 23 }
console.log(jsonstr); // {"name":"Routh","age":23}
2.
let jsonstr = '{"name":"Routh","age":23}';
let obj = JSON.parse(jsonstr);
console.log(jsonstr, typeof jsonstr); // {"name":"Routh","age":23} string
console.log(obj); // { name: 'Routh', age: 23 }

Solution-2
1.
function isInteger(str){
    let num = Number(str);
    return Number.isInteger(num) && !isNaN(str);
}
let str1 = "123";
let str2 = "123.45";
let str3 = "abc";
console.log(isInteger(str1)); // true
console.log(isInteger(str2)); // false
console.log(isInteger(str3)); // false
2.
function isFloat(str){
    let num = parseFloat(str);
    return !Number.isInteger(num) && !isNaN(str) && isFinite(num);
}
let str1 = "123";
let str2 = "123.45";
let str3 = "abc";
console.log(isFloat(str1)); // false
console.log(isFloat(str2)); // true
console.log(isFloat(str3)); // false
3.
function isNumber(str){
    return !isNaN(parseFloat(str)) && isFinite(str);
}
let str1 = "123";
let str2 = "123.45";
let str3 = "abc";
console.log(isNumber(str1)); // true
console.log(isNumber(str2)); // true
console.log(isNumber(str3)); // false
*/