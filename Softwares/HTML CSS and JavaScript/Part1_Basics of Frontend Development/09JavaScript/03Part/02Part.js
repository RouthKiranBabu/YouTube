/*
Logical Operators AND &&
*/

console.log(true && true);
console.log(false && true);
console.log(true && false);
console.log(false && false);
/*Ouput
true
false
false
false*/

console.log(3 > 1 && 4 > 3);
/*Output
true*/

console.log(2 > 3 && 3 > 2 && 4 > 3);
/*Output
false*/

if (2 > 1){
    if (3 > 2){
        console.log("Both the statements are true!");
    }
}
//Other alternative of above code is using the and operator
if (2 > 1 && 3 > 2){
    console.log("Both the statements are true!");
}
/*Output
Both the statements are true!
Both the statements are true!*/

//Using OR Operator
console.log(true || true);
console.log(false || true);
console.log(true || false);
console.log(false || false);
/*Output
true
true
true
false*/

//Using not Operator !
if (!false){
    console.log("Make possible");
}
/*Output
Make possible*/

//Switch statement
option = 0;
switch(option){
    case 1:
        console.log("This is in the case 1!");
    case 2:
        console.log("This is in the case 2!");
    default:
        console.log("This is default");
}
/*Output
This is default
*/

//Switch statement
option = 1;
switch(option){
    case 1:
        console.log("This is in the case 1!");
    case 2:
        console.log("This is in the case 2!");
    default:
        console.log("This is default");
}
/*Output
This is in the case 1!
This is in the case 2!
This is default
*/

//Switch statement
option = 1;
switch(option){
    case 1:
        console.log("This is in the case 1!");
        break;
    case 2:
        console.log("This is in the case 2!");
        break;
    default:
        console.log("This is default");
}
/*Output
This is in the case 1!
*/

//Using if statement
var char = 'a';
if (
    char == 'a' ||
    char == 'e' ||
    char == 'i' ||
    char == 'o' ||
    char == 'u' ||
    char == 'A' ||
    char == 'E' ||
    char == 'I' ||
    char == 'O' ||
    char == 'U'
){
    console.log("Vowels");
}else {
    console.log("Consonant");
}
//Using Switch Statements
switch(char){
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
    case "A":
    case "E":
    case "I":
    case "O":
    case "U":
        console.log("Vowels");
        break;
    default:
        console.log("Consonant");
}
/*Output
Vowels
Vowels*/