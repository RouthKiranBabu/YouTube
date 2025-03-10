function areAnagrams(str1, str2) {
    if (str1.length !== str2.length) {
        return false;
    }
    return str1.split('').sort().join('') === str2.split('').sort().join('');
}

let str1 = "listen";
let str2 = "silent";
console.log(`Are '${str1}' and '${str2}' anagrams?`, areAnagrams(str1, str2));

//Are 'listen' and 'silent' anagrams? true
