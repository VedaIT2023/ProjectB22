const s1 = {
    name:"satwik",
    age :12,
    email:"sat@gmail.com",
    phn:86958695,
    class:9
}

const s2 = {
    name:"Balaji",
    age :13,
    email:"bal@gmail.com",
    phn:869586956,
    class:9
}

const s3 = {
    name:"Satish",
    age :14,
    email:"sati@gmail.com",
    phn:869586956,
    class:9
}

const s4 = {
    name:"Lakki",
    age :15,
    email:"lakki@gmail.com",
    phn:869586956,
    class:9
}

stuArr =  [s1,s2,s3,s4]

stuArr.map((obj,abc)=>{
    obj.class = 10
})

const emailArr = stuArr.map(obj=>{return obj.email})
console.log(emailArr.join("-*-"))

// console.log(stuArr)

class Student{
    fname;
    lname;
    fullName() {
        return this.fname + " " + this.lname
    }

}

const stuKavitha = new Student()
stuKavitha.fname = "Kav"
stuKavitha.lname = "itha"
console.log(stuKavitha.fullName())

localStorage