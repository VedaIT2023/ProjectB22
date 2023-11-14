console.log("1:",myName)
var myName = "Dinesh";
var age = 50;
console.log("3:",myName)
if(age){
    var myName = "Java"
    console.log("6",myName)
}
console.log("8:",myName)

var myName = "Java script"

console.log("12:",myName)

sampleFunction()

function sampleFunction(){
    var myName = "Sample Function"
    console.log("16:",myName)
}

console.log("21:",myName)

//let

let nameS = "Dinesh"
let age2 = 20;
nameS = "Java Script"
console.log("5:",nameS);
if(age2==20){
    let nameS = "IF Condition"
    console.log("8:",nameS);
}

console.log("11:",nameS);

function mysSampleFunction(){
     let nameS  = "Sample Function"
    let age = 30;
    if(age == 30){
        let nameS = "insde condition" 
    }
}


//Const
const instName = "Veda IT"
const age3 = 30
if(age3==30){
   const instName = "JS INSTITUTE"
   
}

console.log(instName)



let stuName = "Satwik";

//Single If
// if (condition) {

// }

// //Multiple If
// if (condition) {

// }
// if (condition) {

// }

// // If else
// if (condition) {

// } else {

// }

// //Switch
// switch (key) {
//     case value:

//         break;

//     case value:

//         break;


//     case value:

//         break;

//     case value:

//         break;

//     default:
//         break;
// }

// &&, ||, !=,>=,<=,<,> ==,

let age5 = 40;
//terinary operator
let name = (age5 > 40) ? "script" : "java"
if(age5>40){
    name = "script"
}else{
    name = "java"
}
console.log(name)


let nameSS = "Ramakrishna , Diwakar , Valli , Sunil"
let replaced = nameSS.replace("Java","hi")
console.log(nameSS)
console.log(replaced)

 let arrName = nameSS.split(",")
 console.log(arrName)

let rk = "RamaKrisHnA "
if(rk.trim().toLowerCase()=="ramakrishna"){
    console.log("YES")
}
let ch = nameSS.charAt(10)
console.log(ch)
let enD = nameSS.endsWith("Sunil")
console.log(enD)

let letter = "A"
 let rep = letter.repeat(10)
 console.log(rep)


let yesORno = true;

let namesAray = [ 'Ramakrishna ', ' Diwakar ', ' Valli ', ' Sunil' ];
console.log("Before ",namesAray)
let count =  namesAray.push("Sunanda")

console.log("After ",namesAray)
console.log(count)


let removedValue = namesAray.pop()
console.log("pop ",namesAray)
console.log(removedValue)

let removedValue2 = namesAray.pop()
console.log("pop ",namesAray)
console.log(removedValue2)

let nameString = namesAray.join(",,")
console.log(nameString)


let allNames = ["Satish","Satwik","Balaji","Satish"].concat(namesAray)
console.log(allNames)

let ind = allNames.lastIndexOf("Satish")
console.log(ind)

let shiftValue = allNames.shift()
console.log(shiftValue)
console.log(allNames)

console.log(allNames.toString())

allNames.sort()
console.log(allNames)

const numberArr = [100,12,37,41,53,72,45]
numberArr.sort((a,b)=>{ 
    return a-b
})

console.log(numberArr)

let sliceArr = numberArr.slice(3)
console.log(sliceArr)

