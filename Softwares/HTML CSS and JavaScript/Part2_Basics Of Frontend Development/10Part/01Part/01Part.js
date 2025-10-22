/*1 3 shows first and then 2 shows after 2 seconds
this is how asynchronous programming works becouse 
it has not waited for set time out and executed the 
console.log(3) before*/
console.log("1");
setTimeout(function test(){
    console.log("2");
}, 2000);
console.log(3);
/*Output
1
3
2
*/