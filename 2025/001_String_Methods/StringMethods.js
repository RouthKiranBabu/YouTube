// match()
// matchAll()
// substr() (deprecated, avoid using it)
function myTag(strings, ...values) {
    console.log("'" + strings.raw[0] + "'"); // 'Hello, '
    console.log("'" + strings.raw[1] + "'"); // '! How are you? '
    console.log("'" + strings.raw[2] + "'"); // ' who are you'
    return strings[0] + strings[2] + values[0] + strings[1];
}
let name = 'Alice';
let greeting = myTag`Hello, ${name}! How are you? ${name} who are you`; 
console.log(greeting); // Hello,  who are youAlice! How are you?

// Finding the valueof returns the primitive value of object
let b = new Boolean(true); console.log(b.valueOf()) // true
let d = new Date(); console.log(d.valueOf()) // 1733305880840

// Integer to String
let n = 10
let s = n.toString()
if (typeof s == 'string'){
    console.log(s, typeof s) // 10 string
}

// Providing the formality of score
let score = "45"
let newstr = score.padEnd(5); console.log("'"+ newstr + "'") // '45   '
newstr = score.padEnd(5, "0"); console.log("'"+ newstr + "'") // '45000'

// Providing the formality of score
let score = "45"
let newstr = score.padStart(5); console.log("'"+ newstr + "'") // '   45'
newstr = score.padStart(5, "0"); console.log("'"+ newstr + "'") // '00045'

// Repeating the string
let str = "javaScript "
let newstr = str.repeat(3); console.log("'"+ newstr + "'") // 'javaScript javaScript javaScript '

// Making string to List
// trimStart() / trimLeft()
// trimEnd() / trimRight()
let str = '    Replace me and me  '
let str1 = str.trim(); console.log("'" + str1 + "'") // 'Replace me and me'
let str2 = str.trimStart(); console.log("'" + str2 + "'") // 'Replace me and me  '
let str3 = str.trimEnd(); console.log("'" + str3 + "'") // '    Replace me and me'

// Making string to List
let str = 'Replace me and me'
let arr1 = str.split(" "); console.log(arr1) // [ 'Replace', 'me', 'and', 'me' ]
let arr2 = str.split(""); console.log(arr2)
// [
//     'R', 'e', 'p', 'l', 'a',
//     'c', 'e', ' ', 'm', 'e',
//     ' ', 'a', 'n', 'd', ' ',
//     'm', 'e'
//   ]

// Get substring
let str = 'Replace me and me'
let ele = str.substring(3, 5); console.log(ele) // la
let ele1 = str.substring(2); console.log(ele1) // place me and me

// Get element based on index
let str = 'Replace me and me'
let lstele = str.slice(-4)
console.log(lstele) // d me
let ele = str.slice(3, 5); console.log(ele) // la
let ele1 = str.slice(2); console.log(ele1) // place me and me

// Replace all element
let str = 'Replace me and me'
let news = str.replaceAll("me", "you")
console.log(news) // Replace you and you

// Replace first element
let str = 'Replace me and me'
let news = str.replace("me", "you")
console.log(news) // Replace you and me

// Find the index of 'index'
let str = "Search my index!"
let index = str.search("index")
console.log(index) // 10

// Print element which ends with 'df'
let arr = ["ssfadf", "4sedf", "4s1443f", "qseqwf"]
for (let e of arr){
    if (e.endsWith("df")){
        console.log(e)
    }
}
/*Output
ssfadf
4sedf*/

// Print element which starts with '4s'
let arr = ["ssfadf", "4sedfs", "4s1443f", "qseqwf"]
for (let e of arr){
    if (e.startsWith("4s")){
        console.log(e)
    }
}
/*Output
4sedfs
4s1443f*/

// Print element where last 's' must be present at index 1
let arr = ["ssfadf", "4sedfs", "451443f", "qseqwf"]
for (let e of arr){
    if (e.lastIndexOf("s") == 1){
        console.log(e)
    }
}
/*Output
ssfadf
qseqwf*/

// Detect all the index of 'then' present in sentence
let sentence = "1 then 2 then 3 then";
let w = "then"
let ispre = sentence.includes(w)
let i = 0
while (ispre){
    console.log("Checking in: " + sentence.substring(i, sentence.length))
    i = sentence.indexOf(w, i)
    console.log("Present at index: " + i)
    i += w.length
    ispre = sentence.substring(i, sentence.length).includes(w)
}
/*Output
Checking in: 1 then 2 then 3 then
Present at index: 2
Checking in:  2 then 3 then
Present at index: 9
Checking in:  3 then
Present at index: 16*/

// Seperate into different category
let str = "df3453ga&*%^%*&%dgaJYUGHJVfgaOHPOHga"
let numbers = ""
let upper = ""
let lower = ""
let others = ""
for (let i = 0; i < str.length; i++){
    let n = str.charCodeAt(i)
    // let n = str.codePointAt(i)
    if (97 <= n && n <= 122){
        lower = lower.concat(str.charAt(i))
    }else if (65 <= n && n <= 90){
        upper = upper.concat(str.charAt(i))
    }else if (48 <= n && n <= 57){
        numbers = numbers.concat(str.charAt(i))
    }else{
        others = others.concat(str.charAt(i))
    }
}
console.log("Numbers: " + numbers)
console.log("Uppers: " + upper)
console.log("lower: " + lower)
console.log("others: " + others)
// Numbers: 3453
// Uppers: JYUGHJVOHPOH
// lower: dfgadgafgaga
// others: &*%^%*&%

// Get Vowels From String
let str = "HEllo WORld!"
let v = ""
for (let s of str){
    if ("aeiouAEIOU".includes(s)){
        v = v.concat(s)
    }
}
console.log(v) // EoO

// Make Even index to upper case and odd index to lower case
let str = "HEllo WORld!"
let res = ""
for (let i = 0; i < str.length; i++){
    let c = str.charAt(i)
    if (i % 2 == 0){
        res = res.concat(c.toUpperCase())
    }else{
        res = res.concat(c.toLowerCase())
    }
    // toLocaleLowerCase()
    // toLocaleUpperCase()
}
console.log(res) // HeLlO WoRlD!