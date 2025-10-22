var a = 2;
var b = 3;
//Product of a and b
var c = a * b;
//a to the power b by using the exponentiation operator(**)
var d = a ** b;
console.log(c);
console.log(d);
/*Output
6
8
*/

/*
String Concatenation
*/
var name = "Routh";
console.log("Hi " + name + ", welcome to Masai School!");
name = "Rout";
console.log("Hi " + name + ", welcome to Masai School!");
/*Output
Hi Routh, welcome to Masai School!
Hi Rout, welcome to Masai School!
*/

//How to name a variable
var name = "Routh";
var age = 26;
var gender = "Male";
var has_driving_license = true;
var citizen_of_india = true;

/*
JavaScript Comparison Operators
> >= < <=
== != === !==
*/

var age1 = 32;
var age2 = 30;
var word = "this";
console.log("type of age1 variable is " + typeof(age1) + ".");
console.log(age1 > age2);
//Converting the number variable into the string
console.log("age1 is " + String(age1)  + " age2 is " + String(age2) + " is age1 greater than age2: " + String(age1 > age2));
/*Output
type of age1 variable is number.
true
age1 is 32 age2 is 30 is age1 greater than age2: true
*/

var marks1 = 12;
var marks2 = 13;
var boolvalue = marks1 > marks2;
console.log(boolvalue);
console.log(10 > 11);
console.log(10 >= 11);
console.log(10 < 11);
boolvalue = 1 >= 0;
console.log(boolvalue);
/*Output
false
false
false
true
true
*/

/*
Comparison Operators
== != === !==
*/
var age1 = 20;
var age2 = "20";
console.log("It(==) will check the value not the datatype: ");
console.log(age1 == age2);
console.log("It(===) will check both the value and the datatype: ");
console.log(age1 === age2);
/*Output
It(==) will check the value not the datatype: 
true
It(===) will check both the value and the datatype: 
false*/

var age3 = 30;
console.log("It(!=) will check the value not the datatype: ");
console.log(age1 != age3);
console.log("It(!==) will check both the value and the datatype: ");
console.log(age1 !== age3);
console.log(5 === "5");
/*Output
It(!=) will check the value not the datatype: 
true
It(!==) will check both the value and the datatype: 
true
false
*/