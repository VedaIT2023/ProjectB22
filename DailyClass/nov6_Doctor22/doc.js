
// Replace 'https://api.example.com/data' with the actual URL of the API you want to call
const apiUrl = 'http://localhost:8080/api/az/getAllDoctors';

// Make a GET request using the fetch function
fetch(apiUrl)
  .then(response => {
    // Check if the request was successful (status code 200)
    if (!response.ok) {
      throw new Error(`HTTP error! Status: ${response.status}`);
    }

    // Parse the JSON in the response
    return response.json();
  })
  .then(data => {
    // Process the data from the API
    console.log(data);
    createDoctorInformation(data)
  })
  .catch(error => {
    // Handle any errors that occurred during the fetch
    console.error('Fetch error:', error);
  });





loadHeading()
function loadHeading() {
    var name = "String literals Intro"
    // heading = document.createElement('h1')
    // heading.innerHTML = name
    // document.getElementById('html-body').appendChild(heading)
    
    heading = `<h1>${name}</h1>`
    document.getElementById('test-heading').innerHTML = heading


}

function showDoctorsList(){
    document.getElementById('doc_grid-container').style.display = 'grid';
    document.getElementById('admission-form').style.display = 'none';
}
function showAdmissionForm(){
    document.getElementById('doc_grid-container').style.display = 'none';
    document.getElementById('admission-form').style.display = 'block';
    
}

function createDoctorInformation(data){
    console.log("Doctor information is creating")
    gridParent = document.getElementById('doc_grid_child')

    for (let index = 0; index < data.length; index++) {
            
    
    tile = document.createElement('div')
    tile.className = 'grid-box'
    tile.id = index
    

    image = document.createElement('img')
    image.src = 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQA130ECB9S8KCMu_a8Qx6-4KS7Ke9CVZGGrdDK3MxW&s'
    
    docName = document.createElement('label')
    docName.innerHTML = data[index].dName

    specialisation = document.createElement('label')
    specialisation.innerHTML = data[index].specialisation

    consultation = document.createElement('label')
    consultation.innerHTML = data[index].conslutation


    tile.appendChild(image)
    tile.appendChild(docName)
    tile.appendChild(specialisation)
    tile.appendChild(consultation)
    
    gridParent.appendChild(tile)
    
    
    tile.addEventListener('click',function(){
        console.log("Docor Tile Clicked")
    })
    }
}
formEmailString()
function formEmailString(){
    const s1 = {
        name:"satwik",
        age :12,
        email:"sat@gmail.com",
        phn:869586956
    }
    
    const s2 = {
        name:"Balaji",
        age :13,
        email:"bal@gmail.com",
        phn:869586956
    }
    
    const s3 = {
        name:"Satish",
        age :14,
        email:"sati@gmail.com",
        phn:869586956
    }
    
    
    
    const s4 = {
        name:"Lakki",
        age :15,
        email:"lakki@gmail.com",
        phn:869586956
    }
    
    stuArr =  [s1,s2,s3,s4]
    let email = []
    for (let index = 0; index < stuArr.length; index++) {
        email.push(stuArr[index].email)                
    }
    console.log(email.join(","))    
    
    stuArr.map(obj=>{
        obj.age += 1
    })
    console.log(stuArr)

   emailArr = stuArr.map(obj=>{
    console.log("Arrow=>",obj.name)
        return obj.name
    })
    console.log(emailArr)

}
//Take an array of our student Names (String array)
//Display the names in place of doctor name
//Print the respective name when user clicks on th tile
//