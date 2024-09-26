/*
Solution-1:
1.
let str = "Hello, World!";
let newvar = str.replace("World", "Javascript");
console.log(newvar); // Hello, Javascript!

2.
let str = "Hello, World!";
let newvar = str.search(/World/);
console.log(newvar, typeof newvar); // 7 number

3.
let str = "Hello, World!";
let newvar = str.slice(0, 5);
let lastvar = str.slice(-6);
console.log(newvar); // Hello
console.log(lastvar); // World!

4.
let str = "Hello, World!";
let newvar = str.substring(3, 8);
let lastvar = str.substr(3, 8 - 3);
console.log(newvar); // lo, W
console.log(lastvar); // lo, W

5.
let str = "Hello, World!";
let newvar = str.toUpperCase();
console.log(newvar); // HELLO, WORLD!

6.
let str = "Hello, World!";
let newvar = str.toLowerCase();
console.log(newvar); // hello, world!

Solution-2:
1.
let str = "       Hello World      ";
let newstr1 = str.trim();
console.log(newstr1); // Hello World

2.
let str = "       Hello World      ";
let newstr1 = str.trimEnd();
console.log(newstr1); //        Hello World

3.
let str = "       Hello World      ";
let newstr1 = str.trimStart();
console.log(newstr1); // "Hello World      "

Solution-3:
1.
let str = new String("Hello World");
console.log(str.valueOf()) // Hello World
*/