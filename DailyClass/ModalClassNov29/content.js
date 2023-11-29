musicDataArray = []

getAPIData()

function getAPIData(){
    var requestOptions = {
        method: 'GET',
        redirect: 'follow'
      };
      
      fetch("http://ax.itunes.apple.com/WebObjects/MZStoreServices.woa/ws/RSS/topsongs/limit=25/json", requestOptions)
        .then(response => {
            return  response.json()
        })
        .then(result => {
            formUI(result)            
        })
        .catch(error =>{
            console.log('error', error)            
        });

}

function formUI(data) {
    
    for (let index = 0; index < data.feed.entry.length; index++) {
        musiocObj = new MusicDataModal()
        musiocObj.title = data.feed.entry[index]["im:name"].label
        musiocObj.price = data.feed.entry[index]["im:price"].label
        musiocObj.rights = data.feed.entry[index]["rights"].label
        musiocObj.favourite = false
        // console.log(data.feed.entry[index].rights.label)
        musicDataArray.push(musiocObj)
    }
    printValues()
}

function printValues(){
    console.log("Entered into printValues")
    musicDataArray.forEach(element => {
        console.log(element.rights)
    });
}

class MusicDataModal{
    title
    artistName
    price
    rights
    category
    releaseDate
    favourite
}