//Creating For loops
for(var i = 0; i <= 10; i++){
    console.log(i);
}
/*Output
0
1
2
3
4
5
6
7
8
9
10
*/

//Using decrement
for (var num = 10; num >= 0; num--){
    console.log(num);
}
/*Output
10
9
8
7
6
5
4
3
2
1
0*/

for(var val = 0; val <= 10; val += 2){
    console.log("Value: " + val);
}
/*Output
Value: 0
Value: 2
Value: 4
Value: 6
Value: 8
Value: 10*/

//creating the pattern
for (var row = 1; row < 6; row++){
    var line = "";
    for(var column = 1; column < 6; column++){
        line += "*";
    }
    console.log(line);
}
/*Output
*****
*****
*****
*****
*****
*/

for (var bahubali = 0; bahubali < 3; bahubali++){
    for (var sultan = 0; sultan < 3; sultan++){
        if (sultan > bahubali){
            break;
        }
        console.log("Bahubali = " + bahubali + " sultan = " + sultan + ".");
    }
}
/*Output
Bahubali = 0 sultan = 0.
Bahubali = 1 sultan = 0.
Bahubali = 1 sultan = 1.
Bahubali = 2 sultan = 0.
Bahubali = 2 sultan = 1.
Bahubali = 2 sultan = 2.
*/

for (var bahubali = 0; bahubali < 3; bahubali++){
    for (var sultan = 0; sultan < 3; sultan++){
        if (sultan > bahubali){
            continue;
        }
        console.log("Bahubali = " + bahubali + " sultan = " + sultan + ".");
    }
}
/*Output
Bahubali = 0 sultan = 0.
Bahubali = 1 sultan = 0.
Bahubali = 1 sultan = 1.
Bahubali = 2 sultan = 0.
Bahubali = 2 sultan = 1.
Bahubali = 2 sultan = 2.
*/