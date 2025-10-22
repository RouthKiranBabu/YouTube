//Objects and Object Methods
/*
0, null and undefined are the false value

if suppose the variable is declared but not provided any value*/
var student;
console.log(student);
/*Output
undefined*/

var fruit;
console.log(fruit);
fruit = 'mango';
console.log(fruit);
/*Output
undefined
mango
*/

var value;
//not provided by the user
console.log(value);
//Provide by the user
value = null;
console.log(value);
/*Output
undefined
null
*/

//null is a false value
console.log(!null);
/*Output
true*/

//undefined is a false value
console.log(!undefined);
/*Output
true*/

console.log(null == undefined);
/*Output
true*/

//both null and undefined are false
//datatype of null and undefined are not same
console.log(null === undefined);
console.log(typeof(null), typeof(undefined));
console.log(typeof null);
console.log(typeof undefined);
/*Output
false
object undefined
object
undefined*/

/*
difference between the null and undefined
null: No value, Javascript will not assign null value, Used to represent 
intentional absence of value
undefined: Not assigned, Default value that javascript assigns, checks
if a variable has been assigned a value
*/

/*Dot Notation
objectName.keyName
Bracket Notation
objectname['keyName']*/
var details = ["NameValueInDetails", 25, false, "c2"];
//not present in the list
console.log(details[10])
var studentObj = {
    name: "NameValueInStudentObj",
    age: 25,
    drivingLicense: false,
    section: "c2",
};
console.log(details[0]);
console.log(studentObj.name);
console.log(studentObj['age']);
console.log(studentObj.age);
//not present in the object
console.log(studentObj.dob);
/*Output
undefined
NameValueInDetails
NameValueInStudentObj
25
25
undefined
*/

var arr = ["name", "class", 25];
console.log(arr);
arr[1] = "newvalue";
console.log(arr);
/*Output
[ 'name', 'class', 25 ]
[ 'name', 'newvalue', 25 ]*/

studentObj = {
    "name": "namevalue",
    "age": 26,
    "gender": "male/female"
};
console.log(studentObj['gender']);
studentObj.gender = "male";
console.log(studentObj);
//Otherway of changing values
studentObj['gender'] = "male/female";
console.log(studentObj);
/*Output
male/female
{ name: 'namevalue', age: 26, gender: 'male' }
{ name: 'namevalue', age: 26, gender: 'male/female' }*/

var details = ["name", "age", "gender"];
console.log(details);
//Use of push
details.push("blood");
console.log(details);
/*Output
[ 'name', 'age', 'gender' ]
[ 'name', 'age', 'gender', 'blood' ]*/

var student = {
    "name": "Name value",
    "age": 32
};
console.log(student);
//adding elements using the bracket notation
student["gender"] = "male/female";
//adding elements using the dot notation
student.phone = 123445;
console.log(student);
/*Output
{ name: 'Name value', age: 32 }
{ name: 'Name value', age: 32, gender: 'male/female', phone: 123445 }*/

var student = {
    "name": "NamedValue",
    "age": 23,
    "gender": "male or Female"
}
console.log(student);
//deleting the existing object
delete student["gender"];
console.log(student);
/*Output
{ name: 'NamedValue', age: 23, gender: 'male or Female' }
{ name: 'NamedValue', age: 23 }*/

studentObj = {
    "name": 'Routh',
    "age": 23,
    drivingLicense: false,
    hobbies: ['programming', 'exercising'],
    address: {
        flatNo: 302,
        name: "RamaLakshmi Nilayam",
        streetName: "Gandhi Nagar",
        landmarks: ["Near Gandhi Statue", "Opp Police Station"]
    }
};
console.log(studentObj.name);
console.log(studentObj.address.name);
console.log(studentObj['address']['name']);
/*Output
Routh
RamaLakshmi Nilayam
RamaLakshmi Nilayam
*/

studentObj = {
    "name": 'Routh',
    "age": 23,
    drivingLicense: false,
    hobbies: ['programming', 'exercising'],
    address: {
        flatNo: 302,
        name: "RamaLakshmi Nilayam",
        streetName: "Gandhi Nagar",
        landmarks: ["Near Gandhi Statue", "Opp Police Station"]
    }
};
//for in loop
for(var key in studentObj){
    console.log("key: " + key);
    console.log("value: " + studentObj[key]);
}
/*Output
key: name
value: Routh
key: age
value: 23
key: drivingLicense
value: false
key: hobbies
value: programming,exercising
key: address
value: [object Object]
*/