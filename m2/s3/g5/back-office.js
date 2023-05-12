/*{
"_id": "5d318e1a8541744830bef139", //SERVER GENERATED
"name": "app test 1",  //REQUIRED
"description": "somthing longer", //REQUIRED
"brand": "nokia", //REQUIRED
"imageUrl": "https://drop.ndtv.com/TECH/product_database/images/2152017124957PM_635_nokia_3310.jpeg?downsize=*:420&output-quality=80", //REQUIRED
"price": 100, //REQUIRED
"userId": "admin", //SERVER GENERATED
"createdAt": "2019-07-19T09:32:10.535Z", //SERVER GENERATED
"updatedAt": "2019-07-19T09:32:10.535Z", //SERVER GENERATED
"__v": 0 //SERVER GENERATED
}*/

const product_URL = 'https://striveschool-api.herokuapp.com/api/product/';

fetch(product_URL, {
    headers: {
        Authorization: "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NDVlMDRmODg4Zjc0MDAwMTQyODc0ODUiLCJpYXQiOjE2ODM4ODMyNTYsImV4cCI6MTY4NTA5Mjg1Nn0.vsL0r6Oa3M2-4AjxlQSR9ImYVLgqDTc-1t_WHiTrlfY"
    }
})
.then((response) => {
    console.log(response)
    if (response.ok) {
      return response.json()
    } else {
      throw new Error("Errore")
    }
  })
.then((data) => {
    console.log(data)
  })
.catch((error) => {
    console.log(error)
})

const eventForm = document.getElementById('event-form')
    eventForm.addEventListener('submit', function (e) {
    e.preventDefault()

    let productName = document.getElementById('name')
    let productDescription = document.getElementById('description')
    let productBrand = document.getElementById('brand')
    let productImageUrl = document.getElementById('imageUrl')
    let productPrice = document.getElementById('price')

    let newObject = {
        name: productName.value,
        description: productDescription.value,
        brand: productBrand.value,
        imageUrl: productImageUrl.value,
        price: productPrice.value
      }
    console.log("Nuovo Prodotto", newObject)

    fetch(product_URL, {
        method: "POST",
        body: JSON.stringify(newObject),
        headers: {
            Authorization: "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NDVlMDRmODg4Zjc0MDAwMTQyODc0ODUiLCJpYXQiOjE2ODM4ODMyNTYsImV4cCI6MTY4NTA5Mjg1Nn0.vsL0r6Oa3M2-4AjxlQSR9ImYVLgqDTc-1t_WHiTrlfY",
            'Content-Type': 'application/json'
        },
    })
    .then((res) => {
        console.log(res)
        if (res.ok) {
          alert('SALVATAGGIO ESEGUITO')
          location.assign('homepage.html')
        } else {
          alert('ERRORE NEL SALVATAGGIO')
          throw new Error('ERRORE NEL SALVATAGGIO')
        }
      })
      .catch((err) => {
        console.log(err)
    })
}); 


