var snowing = false;
var shoes;
if (snowing){
    shoes = "Boots";
} else {
    shoes = "Sneakers";
}
console.log(shoes);
/*Output
Sneakers*/

var light = "red";
if(light == "red"){
    console.log("Vehicle must stop!");
} else if (light = "green"){
    console.log("Vehicle must move!");
}else {
    console.log("Vehicle must slow down");
}
/*Output
Vehicle must stop!*/

if(true){
    console.log("Yes this condition is true!");
}if (5 > 3){
    console.log("Five is greater than 3.");
}
/*Output
Yes this condition is true!
Five is greater than 3.*/

var name1 = "routh";
var name2 = "routh";
if (name1 == name2){
    console.log('Name matches!');
}else{
    console.log("Name does'nt matches");
}
/*Output
Name matches!*/

var istrue = false;
if (istrue){console.log("This condition is true for false!");}
istrue = 0;
if (istrue){console.log("This condition is true for false!");}
istrue = "";
if (istrue){console.log("This condition is true for false!");}
istrue = '';
if (istrue){console.log("This condition is true for false!");}
istrue = null;
if (istrue){console.log("This condition is true for false!");}
istrue = undefined;
if (istrue){console.log("This condition is true for false!");}
istrue = NaN
if (istrue){console.log("This condition is true for false!");}
istrue = 1
if (istrue){console.log("This condition is true when 1.");}
/*Output
This condition is true when 1.*/

