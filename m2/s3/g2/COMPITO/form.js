let nameList = []

const nameField = document.getElementById('name')
const saveButton = document.getElementById('save-button')

const renderList = function () {
    console.log('')
    let list = document.querySelector('ul')

    list.innerHTML = ''

    nameList.forEach((contact) => {
      const newLi = document.createElement('li')
      newLi.innerText =
        contact.name
      list.appendChild(newLi)
    })
}

saveButton.addEventListener('click', function (e) {
    e.preventDefault() 
    const newUser = {
      name: nameField.value,
    }
    console.log(newUser)
    nameList.push(newUser)

    const contactsListAsAString = JSON.stringify(nameList) 
    console.log("valore dell'array stringhifizzato:", contactsListAsAString)    
    localStorage.setItem('contactsArray', contactsListAsAString)

    nameField.value = ''
    renderList()
})    

window.onload = function () {
    if (localStorage.getItem('contactsArray')) {
      let arrayAsAStringFromLocalStorage = localStorage.getItem('contactsArray') 
      let newContactsArray = JSON.parse(arrayAsAStringFromLocalStorage)
      nameList = newContactsArray
      renderList()
    }
}

const restoreContent = function () {
    let previouslySavedName = localStorage.getItem('savedText') 
    if (previouslySavedName) {
        nameField.value = previouslySavedName
    } else {
    }
}

window.onload = function () {
    restoreContent()
}
  