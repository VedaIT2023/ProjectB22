

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

    for (let index = 0; index < 100; index++) {
            
    
    tile = document.createElement('div')
    tile.className = 'grid-box'
    

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
}
}

createDoctorInformation()
