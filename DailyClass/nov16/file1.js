function saveTolocalStorage(){    
    entererdName = document.getElementById('input-name').value
    localStorage.setItem("heading",entererdName)
    window.location.href = 'file2.html'
}

function urlparams(){
    entererdValue = document.getElementById('input-url').value  
    // 'filePath?key=value&key2=value2'
    window.location.href = `file2.html?email=${entererdValue}` 

}