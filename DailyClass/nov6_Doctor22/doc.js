

function showDoctorsList(){
    document.getElementById('doc_grid-container').style.display = 'grid';
    document.getElementById('admission-form').style.display = 'none';
}
function showAdmissionForm(){
    document.getElementById('doc_grid-container').style.display = 'none';
    document.getElementById('admission-form').style.display = 'block';
    
}

function createDoctorInformation(){
    console.log("Doctor information is creating")
    gridParent = document.getElementById('doc_grid_child')

    for (let index = 0; index < 10; index++) {
            
    
    tile = document.createElement('div')
    tile.className = 'grid-box'
    tile.id = index
    

    image = document.createElement('img')
    image.src = 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQA130ECB9S8KCMu_a8Qx6-4KS7Ke9CVZGGrdDK3MxW&s'
    
    docName = document.createElement('label')
    docName.innerHTML = 'Doc Name'

    specialisation = document.createElement('label')
    specialisation.innerHTML = 'Specialisation'

    consultation = document.createElement('label')
    consultation.innerHTML = 'Cost $'

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


createDoctorInformation()
//Take an array of our student Names (String array)
//Display the names in place of doctor name
//Print the respective name when user clicks on th tile
//