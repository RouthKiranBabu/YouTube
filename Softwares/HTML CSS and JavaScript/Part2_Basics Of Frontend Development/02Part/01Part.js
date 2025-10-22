//array of object
var classroom = [
    {name: 'Cherry', age: 12},
    {name: 'NewCherry', age: 23},
    {name: "NameValue", age: 43}
];
for(var index = 0; index < classroom.length; index++){
    console.log(classroom[index].name);
    console.log(classroom[index]['age']);
    console.log(classroom[index]);
}
/*Output
Cherry
12
{ name: 'Cherry', age: 12 }
NewCherry
23
{ name: 'NewCherry', age: 23 }
NameValue
43
{ name: 'NameValue', age: 43 }
 */

var product = [
    {name: "Speaker", price: 1200, rating: 4.5},
    {name: "Laptop", price: 120000, rating: 4.0},
    {name: "Android", price: 25000, rating: 4.3}
];
var minprice = 1300;
for (var pro = 0; pro < product.length; pro++){
    if (product[pro].price > minprice){
        console.log(product[pro].name);
    }
}
/*Output
Laptop
Android
*/

var studentobj = {
    name: 'nameValue',
    age: 12,
    print: function(){
        console.log("This is the sentence");
    }
};
studentobj.print();
/*Output
This is the sentence*/

var productname = ['iphone', 'ipad', 'macbook'];
var productprice = [60000, 2500, 9000];
var productdata = [];
for (var index = 0; index < productname.length; index++){
    var obj = {};
    obj.name = productname[index];
    obj['price'] = productprice[index];
    productdata.push(obj);
}
console.log(productdata);
/*Output
[
  { name: 'iphone', price: 60000 },
  { name: 'ipad', price: 2500 },
  { name: 'macbook', price: 9000 }
]
  */