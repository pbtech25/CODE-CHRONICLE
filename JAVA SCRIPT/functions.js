/*
var, let for variables
const : functions
*/

//basic syntax
function f(a, b){
    const sum = a+b;
    return sum;
}
console.log(f(3, 4));

//anonymous function
var func = function(a, b){
    const sum = a+b;
    return sum;
}
console.log(func(7, 8));

//IIFE: Immediately invoked Function Expression
const result = (function(a, b){
    const sum = a+b;
    return sum;
}) (9,10);
console.log(result);


//Closure: in js we have access to vars outside the function too

var c = 10;

function add(a, b){
    console.log("Closure:",a+b+c);
}

add(1,2);

