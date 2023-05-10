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