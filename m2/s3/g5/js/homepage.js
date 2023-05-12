const strive_URL = 'https://striveschool-api.herokuapp.com/api/product/'

const getEvents = function () {
    fetch(strive_URL)
      .then((res) => {
        console.log('RES', res)
        if (res.ok) {
          return res.json()
        } else {
          throw new Error('ERRORE')
        }
      })
      .then((data) => {
        console.log('RES', data)

        data.forEach((event) => {
          let colTemplate = `
          <div class="col-12 col-md-3">
            <div class="card">
              <div class="card-body">
                <h5 class="card-title">${event.name}</h5>
                <p class="card-text">${event.description}</p>
                <p>${event.price}€</p>
                <a href="./backoffice.html?eventId=${event._id}"class="btn btn-primary">MODIFICA</a>
              </div>
            </div>
          </div>
          `
          let rowReference = document.getElementById('events-container')
          rowReference.innerHTML += colTemplate
        })
      })
      .catch((error) => {
        console.log(error)
      })
}

  window.onload = () => {
    getEvents()
}