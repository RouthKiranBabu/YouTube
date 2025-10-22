var student1 = "Student One";
var student2 = "Student Two";
var arr = [student1, student2, "Student Three", "Student Four"];
console.log(arr);
//Adding new element to the last place
arr.push("Student Five");
console.log(arr);
/*Output
[ 'Student One', 'Student Two', 'Student Three', 'Student Four' ]
[
  'Student One',
  'Student Two',
  'Student Three',
  'Student Four',
  'Student Five'
]*/

var arr = ['index0 value', 'index1 value', 'index2 value'];
console.log(arr[0])
/*Output
index0 value*/

var arr = [1, 2, 3, 4, 5, 10];
//To know the length of the array
console.log(arr.length);
console.log("last element: " + arr[arr.length - 1]);
/*Output
6
last element: 10*/

//Updating the array values
var arr = [12, 43];
console.log(arr);
arr[0] = 54;
console.log(arr);
/*Output
[ 12, 43 ]
[ 54, 43 ]*/

var arr = ['a for apple', 'b for ball', 'c for cat'];
console.log("The length of array: " + arr.length);
for (var index = 0; index < arr.length; index++){
    console.log(arr[index]);
}
/*Output
The length of array: 3
a for apple
b for ball
c for cat
*/

var arr = [3, 2];
console.log(typeof(arr));
console.log(arr[4]);
console.log(arr[0]);
/*Output
object
undefined
3
*/

var arr = ['new 1', 'new 2', 'new 3'];
var lastval = arr.pop();
console.log(lastval);
console.log(arr);
/*Output
new 3
[ 'new 1', 'new 2' ]*/

var arr = [43, 23, 43, 33, 76, 56, 66, 59];
var newarr = [];
for (var i = 0; i < 3; i++){
    var val = arr.pop();
    newarr.push(val);
    console.log(newarr + " elements are removed from " + arr + ".");
}
/*Output
59 elements are removed from 43,23,43,33,76,56,66.
59,66 elements are removed from 43,23,43,33,76,56.
59,66,56 elements are removed from 43,23,43,33,76.*/

//Use of continue
var arr = [23, 24, 54, 65, 45, 55, 13, 16, 7];
for (var i = 0; i < arr.length; i++){
    if (arr[i] > 50){
        continue;
    }
    console.log(arr[i]);
}
/*Output
23
24
45
13
16
7
*/

var str = "Routh";
console.log("length of the string: " + str.length);
console.log("length of the string: ", str.length);
/*Output
length of the string: 5
length of the string:  5
*/

var string1 = "Hi there";
for (var index = 0; index < string1.length; index++){
    console.log(string1[index]);
}
/*Output
H
i
 
t
h
e
r
e
*/

//Program to change to first letter to other letter
var string = "This is scholl.";
var changeLetterfrom = 'h';
var changeLetterTo = 'o';
var modifiedstring = "";
var isfirst = true;
for (var index = 0; index < string.length; index++){
    if (string[index] == changeLetterfrom && isfirst){
        modifiedstring += changeLetterTo;
        isfirst = false;
        index += 1;
    }
    modifiedstring += string[index];
}
console.log(modifiedstring);
/*Output
Tois is scholl.*/

//Program to convert to the upper case
var string1 = "routh";
var lower = "abcdefghijklmnopqrstuvwxyz";
var upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
console.log(lower.length, upper.length);
var output = "";
for (var lowerindex = 0; lowerindex < string1.length; lowerindex++){
    for (var upperindex = 0; upperindex < lower.length; upperindex++){
        if (string1[lowerindex] == lower[upperindex]){
            output += upper[upperindex];
        }
    }
}
console.log(output);
/*Output
26 26
ROUTH*/