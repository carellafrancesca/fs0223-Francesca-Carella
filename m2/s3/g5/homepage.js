const strive_URL = 'https://striveschool-api.herokuapp.com/api/product/'

const getProducts = function () {
    fetch(strive_URL, {
      headers: {
        Authorization: "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NDVlMDRmODg4Zjc0MDAwMTQyODc0ODUiLCJpYXQiOjE2ODM4ODMyNTYsImV4cCI6MTY4NTA5Mjg1Nn0.vsL0r6Oa3M2-4AjxlQSR9ImYVLgqDTc-1t_WHiTrlfY"
      }
    })
      .then((res) => {
        if (res.ok) {
          return res.json()
        } else {
          throw new Error('ERRORE')
        }
      })
      .then((data) => {
        imageElement(data)
        console.log(data)
      })
      .catch((error) => {
        console.log(error)
      })
}

const imageElement = function (elements){
  let elementContainer = document.getElementById("objectsContainer");
  elements.forEach((elements) => {
      let cardsElements = document.createElement("div")
      cardsElements.classList.add("card", "w-25")
      cardsElements.innerHTML = `
          <div class="card">
            <div class="card-body">
              <img src="${elements.imageUrl}" class="card-img-top">
              <h5 class="card-title">${elements.name}</h5>
              <p class="card-text">${elements.description}</p>
              <p class="card-text">${elements.brand}</p>
              <p class="card-text">${elements.price}€</p>
              <a href="./back-office.html?productId=${elements._id}" target="_blank" class="btn btn-dark">MODIFICA</a>
              <a href="#${elements._id}"class="btn btn-dark">COMPRA</a>
            </div>
          </div>`
  
  elementContainer.appendChild(cardsElements);      
  });
};

window.onload = () => {
  getProducts()
}