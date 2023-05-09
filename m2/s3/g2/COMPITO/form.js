let nameList = []

const nameField = document.getElementById('name')
const saveButton = document.getElementById('save-button')
let clearButton = document.getElementById('clear-button')

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
    console.log(contactsListAsAString)    
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

clearButton.addEventListener('click', function () {
    localStorage.removeItem('savedText')
    nameField.value = ''
})

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

/* let nameField = document.getElementsyTagName("input")[0]

const buttonSave = document.getElementsbyId("save");
const buttonDelete = document.getElementsbyId("delete");

const lastName = document.getElementbyId("#target");

buttonSave.addEventListener("click", save);
function save(e) {
  e.preventDefault();
  localStorage.setItem("Names", nameField.value);

  lastName.textContent = localStorage.getItem("Names");
  document.getElementbyId("container").reset();
}

buttonDelete.addEventListener('click', delete);
function delete(e) {
  localStorage.removeItem('#target')
}
*/