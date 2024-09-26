/*Problem 1:
Given:
let str = "Hare Rama Hare Krishna";
let newstr = str.replace("krishna", "Krishna Paramatma");
console.log(newstr);
Question:
Tell me what result do we get?
Answer:
Hare Rama Hare Krishna
*/

/*Problem 2:
Given:
let str = "Guru bramha Guru vishnu Guru davo Maheswaraha";
let newstr = str.replace("Guru", "guru");
console.log(newstr);
Question:
Tell me what result do we get?
Answer:
guru bramha Guru vishnu Guru davo Maheswaraha
*/

/*Problem 3:
Given:
let str = "Guru bramha Guru vishnu Guru davo Maheswaraha";
Question:
Convert the "Guru" into "GURU".
Answer:
GURU bramha GURU vishnu GURU davo Maheswaraha
*/
let str = "Guru bramha Guru vishnu Guru davo Maheswaraha";
let newstr = str.replace("Guru", "guru");
while(str.includes("Guru")){
    str = str.replace("Guru", "GURU");
}
console.log(str);

/*Problem 4:
Given:
let str = "Guru bramha Guru vishnu Guru davo Maheswaraha";
console.log(str.includes("guru"));
Question:
Guess the output.
Answer:
false
*/

/*Problem 5:
Given:
let str = "   Hello World!   ";
console.log(str.trimStart().concat(str.trim()));
console.log(str.trimLeft().concat(str.trimEnd()));
console.log(str.trimRight());
Question:
Guess the output.
Answer:
Hello World!   Hello World!
Hello World!      Hello World!
   Hello World!
*/

/*Problem 6:
Given:
let str1 = `Dont Run away from pain. 
Dont Let Your Desires becomes your rat trap. 
Work like Worshiping to god.`;
let r = "";
let v = "aeiouAEIOU";
Question:
Make the Vowels from small letters to capital letters.
Answer:
DOnt RUn AwAy frOm pAIn. 
DOnt LEt YOUr DEsIrEs bEcOmEs yOUr rAt trAp. 
WOrk lIkE WOrshIpIng tO gOd.
*/
let str1 = `Dont Run away from pain. 
Dont Let Your Desires becomes your rat trap. 
Work like Worshiping to god.`;
let r = "";
let v = "aeiouAEIOU";
for(let i = 0; i < str1.length; i++){
    if(v.includes(str1.charAt(i))){
        r = r.concat(str1.charAt(i).toUpperCase());
        continue;
    }
    r = r.concat(str1.charAt(i));
}
console.log(r);

/*Problem 7:
Given:
let game = "Game Score: 009";
Question:
Print "Game Score: 010" using built-in String Methods.
Answer:
"Game Score: 010"
*/
let game = "Game Score: 009";
let index = game.lastIndexOf(" ") + 1;
let news = game.substring(0, index).concat("010");
console.log(news);

/*Problem 8:
Given:
let v1 = `This is for those who do exercise Everday. 
When someone CHOOSE YOU as a protector That's what it feels like a warrior.`;
Question:
Use the search method to find the index of "CHOOSE YOU as a protector".
Answer:
57
*/
let v1 = `This is for those who do exercise Everday. 
When someone CHOOSE YOU as a protector That's what it feels like a warrior.`;
console.log(v1.search(/CHOOSE YOU as a protector/));

/*Problem 9:
Given:
let v2 = `This is for those who do exercise Everday. 
When someone CHOOSE YOU as a protector That's what it feels like a warrior.`;
let str2 = "CHOOSE YOU as a protector";
Question:
First search the index of v2 where str2 exists
Print from the searched index to the last letter of v2.
Answer:
CHOOSE YOU as a protector That's what it feels like a warrior.
*/
let v2 = `This is for those who do exercise Everday. 
When someone CHOOSE YOU as a protector That's what it feels like a warrior.`;
let str2 = "CHOOSE YOU as a protector";
let inx2 = v2.indexOf(str2);
console.log(v2.substring(inx2, v2.length));

