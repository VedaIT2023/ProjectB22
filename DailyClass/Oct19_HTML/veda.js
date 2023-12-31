fetch("http://localhost:8080/api/az/getAllDoctors")
    .then(response=>{
        if(!response.ok){
            throw Error.new("No connect");
        }
        return response.json();
    })
    .then(data=>{
        console.log(data)
        displayDoctors(data)
    })  
    .catch(error=>{
        console.log(error)
    })

function displayDoctors(docList){
    container = document.getElementById("grid-container")
    for(let i=0;i<docList.length;i++){
        tile = document.createElement('div')        
        tile.classList.add('doctor-tile');

        img = document.createElement('img')

        h3 = document.createElement('h3')
        h3.innerHTML = docList[i].dName

        p1 = document.createElement('p')
        p1.innerHTML = docList[i].degree

        p2 = document.createElement('p')
        p2.innerHTML = docList[i].specialisation

        tile.appendChild(img)
        tile.appendChild(h3)
        tile.appendChild(p1)
        tile.appendChild(p2)
        
        container.appendChild(tile)
    }
}