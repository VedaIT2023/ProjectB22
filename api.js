// const names = [
//     {name:"Satya",email:"satya@gmail.com"},
//     {name:"Kavitha",email:"Kavitha@gmail.com"},
//     {name:"Sunanda",email:"sunanda@gmail.com"}
// ]


// address = "Hyderadab"
// address = address.replace('dab','bad')
// console.log(address)

// names.map(obj=>{
//   obj.email = obj.email.replace('gmail','vedait')
// })

// console.log(names)

// new Promise((resolve,reject)=>{

//     const isPromise = false

//     if(isPromise){
//         resolve("Promise Executed Successfully")
//     }else{
//         reject("Promise Failed")
//     }

// })
// .then(result=>{
//     console.log(result)
// })
// .catch(error=>{
//     console.log(error)
// })

fetch('https://reqres.in/api/users?page=2')
.then(response=>{
    if(!response.ok){
        throw new Error('Details not found');
    }

    return response.json()
})
.then(result=>{
    formGridDataUI(result.data)
})
.catch(error=>{
    console.log(error)
})


function  formGridDataUI(empsArray) {
    empsArray.map(obj=>{
        console.log(obj.email)
    })
    
}