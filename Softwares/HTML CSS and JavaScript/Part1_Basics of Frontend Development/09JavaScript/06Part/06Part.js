//Functions and its use
/*Syntax
function FunctionName(){
    code block
}
*/

function sum(a, b){
    var addition = a + b;
    console.log("The sum of ", a, " and ", b, " is ", addition, ".");
    console.log("The sum of "+ a + " and " + b + " is " + addition + ".");
    return NaN;
}
var val = sum(1, 2);
console.log(val)
/*Output
The sum of  1  and  2  is  3 .
The sum of 1 and 2 is 3.
NaN
*/

function addpdt(a, b, c){
    var add = a + b;
    var pro = add * c;
    return pro;
}
var val = addpdt(1, 5, 3);
console.log(val);
/*Output
18*/

/*
arguments and parameters
parameters are the variables provided beside the function name
eg: function FunctionName(parameter1, parameter2){}
1 and 2 are the arguments present inside the function call
arguments are the values given to the function taken value
eg: FunctionName(1, 2);
*/
function FunctionName(parameter1, parameter2){
    //code block
    console.log(parameter1, parameter2);
}
FunctionName(1, 2);
/*Output
1 2*/

//Function takes number returns number is prime or not
function isPrime(num){
    var factors = 0;
    for (var n = 0; n <= num; n++){
        if (num % n == 0){
            factors += 1;
        }
    }
    if (factors == 2){ 
        //console.log("Yes, its a prime Number!"); 
        return num + " is prime.";
    }
    else{ 
        //console.log("No, its not a prime number!");
        return num + " is not prime.";
     }
}
//Function returns a list containing both prime and non prime number
function primeRange(initial, final){
    var arr = [];
    for (var start = initial; start <= final; start++){
        arr.push(isPrime(start));
    }
    return arr;
}
var arrprime = primeRange(1, 11);
//To check all the elements present in the array
for(var index = 0; index < arrprime.length; index++){
    console.log(arrprime[index]);
}

/*
Go to MDN Web Docs
select the javascript: https://developer.mozilla.org/en-US/docs/Web/JavaScript

search: push
which provides the example:
const animals = ['pigs', 'goats', 'sheep'];
const count = animals.push('cows');
console.log(count);
// Expected output: 4
console.log(animals);
// Expected output: Array ["pigs", "goats", "sheep", "cows"]
animals.push('chickens', 'cats', 'dogs');
console.log(animals);
// Expected output: Array ["pigs", "goats", "sheep", "cows", "chickens", "cats", "dogs"]

now search for the join function
const elements = ['Fire', 'Air', 'Water'];
console.log(elements.join());
// Expected output: "Fire,Air,Water"
console.log(elements.join(''));
// Expected output: "FireAirWater"
console.log(elements.join('-'));
// Expected output: "Fire-Air-Water"
*/

//Use of Builtin function
var arr = [1, 2, 3];
var res = "";
for (var index = 0; index < arr.length; index++){
    res += arr[index] + ".";
}
console.log(res);
//No need to create function
console.log(arr.join("."));
/*Output
1.2.3.
1.2.3
*/

//Reference: https://developer.mozilla.org/en-US/docs/Web/JavaScript

//Use of trim function
var str = "  Hello world  ";
console.log(str);
str = str.trim();
console.log(str);
/*Output
  Hello world  
Hello world
*/