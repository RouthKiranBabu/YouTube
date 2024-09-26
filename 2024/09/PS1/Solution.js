/*Solution of Problem-1
1.
let str = "The Quick brown fox Jumps over The lazy dog";
let strresult = ""
for(let index = 0; index < str.length; index+=2){
    strresult = strresult.concat(str.charAt(index));
}
console.log(strresult); // TeQikbonfxJmsoe h aydg

2.
let str = "The Quick brown fox Jumps over The lazy dog";
let strresult = ""
for(let index = 1; index < str.length; index+=2){
    console.log(`At index ${index} Character code of ${str.charAt(index)} is ${str.charCodeAt(index)}.`)
}
console.log(strresult);

3.
let str = "The Quick brown fox Jumps over The lazy dog";
let evenchar = ""
let oddchar = ""
for(let index = 0; index < str.length; index++){
    if (index % 2 != 0){oddchar = oddchar.concat(str.charAt(index));}
    if(index % 2 == 0){evenchar = evenchar.concat(str.charAt(index));}
}
console.log(evenchar); // TeQikbonfxJmsoe h aydg
console.log(oddchar); // h uc rw o up vrTelz o

4.
let str = "The Quick brown fox Jumps over The lazy dog";
let refstr = "bro";
let result = str.indexOf(refstr);
console.log(result); // 10

5.
let str = "The Quick brown fox Jumps over The lazy dog";
let refstr = "The";
let result = str.lastIndexOf(refstr);
console.log(result); // 31

6.
let str = "The Quick brown fox Jumps over The lazy dog";
let refstr = str.match(/\b\w{5}\b/g);
console.log(refstr) // [ 'Quick', 'brown', 'Jumps' ]
*/