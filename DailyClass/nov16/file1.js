function saveTolocalStorage(){    
    entererdName = document.getElementById('input-name').value
    localStorage.setItem("heading",entererdName)
    window.location.href = 'file2.html'
}