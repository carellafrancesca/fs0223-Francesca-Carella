fetch('https://striveschool-api.herokuapp.com/books')
    .then((res) => {
      if (res.ok) {
        return res.json()
      } else {
        console.log('Errore!')
        throw new Error("Errore nell'esecuzione della chiamata")
      }
    })
    .then((books) => {
      console.log('book', books)
      let mainRow = document.getElementById('main-row')
        books.forEach((books) => {
            let col = document.createElement('div')
            col.classList.add('col-6', 'col-md-4', 'col-lg-3') 
            col.innerHTML = `
            <div class="card">
                <img src=${books.img} class="card-img-top" style="height:400px" alt="...">
                <div class="card-body">
                    <h5 class="card-title">${books.title}</h5>
                    <p class="card-text">${books.price}</p>
                    <p class="card-text">${books.category}</p>
                    <a href="#" class="btn btn-primary" onclick="clicked()">Compra ora</a>
                    <a href="#" class="btn btn-danger" id="deleteButton" onclick="clicked()">Scarta</a>
                    <a href="#" class="btn btn-dark" id="cartButton" onclick="clicked()">
                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-cart4" viewBox="0 0 16 16">
                    <path d="M0 2.5A.5.5 0 0 1 .5 2H2a.5.5 0 0 1 .485.379L2.89 4H14.5a.5.5 0 0 1 .485.621l-1.5 6A.5.5 0 0 1 13 11H4a.5.5 0 0 1-.485-.379L1.61 3H.5a.5.5 0 0 1-.5-.5zM3.14 5l.5 2H5V5H3.14zM6 5v2h2V5H6zm3 0v2h2V5H9zm3 0v2h1.36l.5-2H12zm1.11 3H12v2h.61l.5-2zM11 8H9v2h2V8zM8 8H6v2h2V8zM5 8H3.89l.5 2H5V8zm0 5a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0zm9-1a1 1 0 1 0 0 2 1 1 0 0 0 0-2zm-2 1a2 2 0 1 1 4 0 2 2 0 0 1-4 0z"/>
                  </svg></a>

                </div>
            </div>
            `
            let deleteB = col.querySelector('#deleteButton');
            deleteB.addEventListener('click', () => {
                col.remove();
            });
            mainRow.appendChild(col)
        })
    })
    .catch((error) => {
      console.log(error)
    })
    
  
/*    
  // HINT x CART :)
  localStorage.setItem('cart', '[]')
  
  let currentCart = localStorage.getItem('cart')
  currentCart = JSON.parse(currentCart)
  currentCart.push({ id: 5 })
  currentCart = JSON.stringify(currentCart)
  localStorage.setItem(cart, currentCart)
*/  