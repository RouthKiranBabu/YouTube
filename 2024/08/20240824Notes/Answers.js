/*Problem 1:
Given:
let news = `In the news updates section, stay updated with Prime Minister Narendra Modi's news on the go. Read about the events and programmes PM Narendra Modi takes part in and more.
Read and share PM Modi's latest news, track everyday events of the Prime Minister and read PM Modi's speeches. Get inside details of PM Modi's meetings with several heads of states, various international visits, summits and more.
Get information on various schemes and initiatives taken by the central government, read details of PM Narendra Modi's interaction with people from all walks of life and get in-depth details of various important cabinet decisions.`

Question:
Find the index of "PM Modi's latest news"

Answer: 187
*/
let news = `In the news updates section, stay updated with Prime Minister Narendra Modi's news on the go. Read about the events and programmes PM Narendra Modi takes part in and more.
Read and share PM Modi's latest news, track everyday events of the Prime Minister and read PM Modi's speeches. Get inside details of PM Modi's meetings with several heads of states, various international visits, summits and more.
Get information on various schemes and initiatives taken by the central government, read details of PM Narendra Modi's interaction with people from all walks of life and get in-depth details of various important cabinet decisions.`
console.log(news.indexOf("PM Modi's latest news"));

/*Problem 2:
Given:
let wikipedia = `Garikipati Narasimha Rao is an Indian scholar, litterateur, and avadhani from Andhra Pradesh.[2][3] In 1996, he performed Avadhanam with 1116 Pruchchakas for 21 days in Kakinada. He also delivers lectures on personality development based on dharmic culture and way of life. He regularly appears on Telugu TV channels like SVBC, Bhakti TV, and ABN Andhra Jyothi giving discourses on ancient Hindu texts like Bhagavadgita, Ramayana, and Mahabharata. In 2022, he was awarded India's fourth-highest civilian award Padma Shri by the government of India.[4]`

Question:
Print first three words using forloop, break keyword and charAt string method.

Answer: "Garikipati Narasimha Rao"
*/
let wikipedia = `Garikipati Narasimha Rao is an Indian scholar, litterateur, and avadhani from Andhra Pradesh.[2][3] In 1996, he performed Avadhanam with 1116 Pruchchakas for 21 days in Kakinada. He also delivers lectures on personality development based on dharmic culture and way of life. He regularly appears on Telugu TV channels like SVBC, Bhakti TV, and ABN Andhra Jyothi giving discourses on ancient Hindu texts like Bhagavadgita, Ramayana, and Mahabharata. In 2022, he was awarded India's fourth-highest civilian award Padma Shri by the government of India.[4]`
let result = "";
for(let i = 0; i < wikipedia.length; i ++){
    let v = wikipedia.charAt(i);
    result += v;
    if (v == "o"){ break; }
}
console.log(result);

/*Problem 3:
Given:
let chatGPT = `Elon Musk is a multifaceted entrepreneur and engineer known for his role in founding and leading several high-profile technology companies. Born in 1971 in Pretoria, South Africa, he moved to the U.S. to attend the University of Pennsylvania. Musk is the CEO and lead designer of SpaceX, a company dedicated to reducing space transportation costs and enabling the colonization of Mars. He’s also the CEO and product architect of Tesla, Inc., which focuses on electric vehicles and renewable energy solutions.`;

Question:
1. How to check word "Mars" is present.
2. If "Mars" word is present print all the char code of Mars.

Answer:
Char = M, CharCode: 77.
Char = a, CharCode: 97.
Char = r, CharCode: 114.
Char = s, CharCode: 115.
*/
let chatGPT = `Elon Musk is a multifaceted entrepreneur and engineer known for his role in founding and leading several high-profile technology companies. Born in 1971 in Pretoria, South Africa, he moved to the U.S. to attend the University of Pennsylvania. Musk is the CEO and lead designer of SpaceX, a company dedicated to reducing space transportation costs and enabling the colonization of Mars. He’s also the CEO and product architect of Tesla, Inc., which focuses on electric vehicles and renewable energy solutions.`;
let target = "Mars";
let ispresent = chatGPT.includes(target);
console.log(ispresent); // true
if (ispresent){
    for(let i = 0; i < target.length; i ++){
        console.log(`Char = ${target[i]}, CharCode: ${target.charCodeAt(i)}.`);
    }
}

/*Problem 4:
Given:
let string = "The quick brown fox jumps over the lazy dog.";
Question:
Print all the five letter word in array.
Answer:
[ 'quick', 'brown', 'jumps' ]
*/
let string = "The quick brown fox jumps over the lazy dog.";
let nstring = string.match(/\b\w{5}\b/g);
console.log(nstring);

/*Problem 5:
Given:
let str1 = "The quick brown fox jumps over the lazy dog.";
let vowels = "aeiou";
Question:
Print five letter words which contains letters in vowels.
Answer:
quick
brown
jumps
*/
let str1 = "The quick brown fox jumps over the lazy dog.";
let vowels = "aeiou";
let nstr = str1.match(/\b\w{5}\b/g);
for(let i = 0; i < nstr.length; i ++){
    let s = nstr[i];
    for (let j = 0; j < vowels.length; j ++){
        let v = vowels.charAt(j);
        if(s.includes(v)){
            console.log(s);
            break;
        }
    }
}

/*Problem 6:
Given:
None
Question:
Print "*<>*<>*<>*" pattern.
Answer:
*<>*<>*<>*
*/
console.log("*<>".repeat(3).concat("*"));

/*Problem 7:
Given:
let str2 = "The quick brown fox jumps over the lazy dog.";
let v2 = "aeiouAEIOU";
Question:
Replace all the vowels present in str2 into *.
Answer:
Th* q**ck br*wn f*x j*mps *v*r th* l*zy d*g.
*/
let str2 = "The quick brown fox jumps over the lazy dog.";
let v2 = "aeiouAEIOU";
let r2 = "";
for (let i = 0; i < str2.length; i ++){
    if(v2.includes(str2[i])){
        r2 = r2.concat("*");
        continue;
    }
    r2 = r2.concat(str2.charAt(i));
}
console.log(r2);

/*Problem 8:
Given:
let str3 = "The qIUck brown fox jumps over the lAzy dog.";
let v3 = "aeiouAEIOU";
Question:
Print vowels and non-vowels seperately as shown in answer.
Answer:
Th qck brwn fx jmps vr th lzy dg.
e IU o o u oe e A o
*/
let str3 = "The qIUck brown fox jumps over the lAzy dog.";
let v3 = "aeiouAEIOU";
let r3 = "";
let r4 = "";
for(let i = 0; i < str3.length; i ++){
    if (v3.includes(str3.charAt(i))){
        r3 = r3.concat(str3.charAt(i));
        continue;
    }
    if (str3[i] == " "){r3 = r3.concat(" ");}
    r4 = r4.concat(str3.charAt(i));
}
console.log(r4.concat("\n").concat(r3));

/*Problem 9:
Given:
let str4 = "The qIUck brown fox jumps over the lAzy dog.";
let start4 = 1;
let end4 = 11;
Question:
Print the string which starts from index 1 to 10.
Answer:
he qIUck b
*/
let str4 = "The qIUck brown fox jumps over the lAzy dog.";
let start4 = 1;
let end4 = 11;
let res4 = ""
for(let i = start4; i < end4; i ++){
    res4 = res4.concat(str4.charAt(i));
}
console.log(res4);

/*Problem 10:
Given:
let str5 = "The qIUck brown fox jumps over the lAzy dog.";
let start5 = 1;
let end5 = 11;
Question:
Print the string which starts from index 1 to 10 using builtin method.
Answer:
he qIUck b
*/
let str5 = "The qIUck brown fox jumps over the lAzy dog.";
let start5 = 1;
let end5 = 11;
console.log(str5.slice(start5, end5));
