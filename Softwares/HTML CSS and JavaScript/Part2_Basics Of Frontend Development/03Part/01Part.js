/*
Higher Order Functions
*/
// basic function creation
function functionName(){
    console.log("This is the sentence.");
}
//basic way to call the function name
functionName();
/*Output
This is the sentence.
*/

var functionName = function (){
    console.log("This is the sentence.");
}
functionName();
/*Output
This is the sentence.
*/

//where a and b are the parameters
function sum(a, b){
    console.log(a + b);
}
//providing values like 1, 2, 3 and 4 are the arguments
sum(1, 2);
sum(3, 4);
/*Output
3
7
*/

function sum(a, b){
    return a + b;
}
var sumvalue = sum(1, 2);
console.log(sumvalue);
function eatBreakfast(item){
    console.log("I will eat " + item + " later.");
}
eatBreakfast('Dosa');
/*Output
3
I will eat Dosa later.
*/

function doBrush(){
    console.log("Clean your teeth first!");
}
function eatBreakfast(somefunction, item){
    somefunction();
    console.log("I will eat " + item + " later.");
}
//Brackets are not given to the function
eatBreakfast(doBrush, 'Dosa');
/*Output
Clean your teeth first!
I will eat Dosa later.
*/

//Use of forEach
var names = ['name1', 'name2', 'name3'];
names.forEach(function (elem, index, array){
    console.log(elem, index, array);
});
/*Output
name1 0 [ 'name1', 'name2', 'name3' ]
name2 1 [ 'name1', 'name2', 'name3' ]
name3 2 [ 'name1', 'name2', 'name3' ]
*/

var names = ['name1', 'name2', 'name3'];
var box = [];
names.forEach(function (elem, index, array){
    box.push(elem);
});
console.log(box);
/*Output
[ 'name1', 'name2', 'name3' ]*/

var names = ['name1', 'name2', 'name3'];
var res = names.map(function(elem){
    return elem;
});
console.log(res);
/*Output
[ 'name1', 'name2', 'name3' ]*/

var names = ['name1', 'name2', 'name3'];
var res = names.forEach(function(elem){
    return elem;
});
console.log(res);
/*Output
undefined
*/

var nums = [1, 2, 3, 4, 5, 6];
var output = nums.map(function (elem){
    if(elem % 2 == 0){
        return elem;
    }
});
var newoutput = nums.map(function (elem){
    return elem % 2 == 0;
});
console.log(output);
console.log(newoutput);
/*Output
[ undefined, 2, undefined, 4, undefined, 6 ]
[ false, true, false, true, false, true ]
 */

//Use of filter to get value
nums = [1, 2, 3, 4, 5, 6];
var newoutput = nums.filter(function (elem){
    return elem % 2 == 0;
});
console.log(newoutput);
/*Output
[ 2, 4, 6 ]*/

var arr = [1, 2, 3, 4, 5];
var sum = 0;
for(var ele = 0; ele < arr.length; ele++){
    sum += arr[ele];
}
console.log(sum);
var out = arr.reduce(function (acc, el){
    return acc + el;
});
console.log(out);
/*Output
15
15
*/

// iteration       acc         ele         acc + ele 
// 1st             nums[0]=1   nums[1]=2   1 + 2 = 3
// 2nd             3           nums[2]=3   3 + 3 = 6
// 3rd             6           nums[3]=4   6 + 4 = 10
var accumulator = function(acc, el){
    return acc + el;
}
nums = [1, 2, 3, 4, 5, 6];
var res = nums.reduce(accumulator, 0);
console.log(res);
/*Output
21
*/

// iteration       acc     el              acc + el
// 1st             0       nums[0] = 1     0 + 1 = 1
// 2nd             1       nums[1] = 2     1 + 2 = 3
// 3rd             3       nums[2] = 3     3 + 3 = 6
// 4th             6       nums[3] = 4     6 + 4 = 10    

//Chaining Operation
nums = [1, 2, 3, 4, 5, 6];
var res = nums
.map(function (elem){
    return elem ** 3;
})
.filter(function (elem){
    return elem % 2 == 0;
})
.reduce(function (acc, el){
    return acc + el;
});
console.log(res);
/*Output
288*/

/*From the higher or functions like forEach, map, filter and reduce
for the forEach input is in form of array and the output is in the 
undefined
for the map input is in array and also the output is also in form of 
array
for the filter input is in form of array and the output is in form of 
array
for the reduce the input is in form of array and output is in form of 
single value
forEach         map         filter          reduce
i=>arr          i=>arr      i=>arr          i=>arr
0=>undefined    0=>arr      o=>arr          o=>single value
*/

// Map.filter 
// can be chainable becouse output of map is in form of Array
// which act as the input for the filter
/*
forEach.filter is not possible output for forEach is undefined
so cant filter the undefined value so finally this kind of 
chaining is not possible

reduce.forEach is not possble becouse reduce is the single value
which cannot be set as the input for the forEach

so forEach and reduce cannot be used as the first step of chain
but they can be present at the last element

we can write map.filter.forEach
*/