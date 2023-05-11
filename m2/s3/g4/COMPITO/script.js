let apiKey = "p3fpGqWkuduCD6UXQ7E9v8NC1kbEBHRgKcZ784HmnwNGKz2KEhl6S7tN";

const getImages = function(query){
    fetch(apiKey + query, {
        headers : {
            Authorization : 'https://api.pexels.com/v1/search?query=cities'
        },
    })
.then((res) => {
    console.log(res);
    if (res.ok) {
      return res.json();
    } else {
      throw new Error("Errore")
    }
})
.then((data.photos) => {
    console.log(data.photos)
    
})
.catch((error) => {
    console.log(error)
})
}

window.onload = function(){
    let primaryButton = document.querySelector('.btn-primary')
    primaryButton.addEventListener('click', () => 
    getImages('mountains')
)}