
head = localStorage.getItem('heading')
document.getElementById('heading').innerHTML = head

pathParams = new URLSearchParams(window.location.search)
console.log(pathParams.get("email"))