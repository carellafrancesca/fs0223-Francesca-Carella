// PRIMO ESERCIZIO //

class User{
    constructor(firstName, lastName, age, location){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.location = location;
    }
}

let firstUser = new User('Mario', 'Rossi', 28, 'Italy');
console.log(firstUser);

let secondUser = new User('Francesca', 'Carella', 23, 'Italy');
console.log(secondUser);

function ageComparison (firstUser,secondUser){
    if(firstUser.age < secondUser.age){
        return 'false'
    }else{
        return firstUser.firstName + ' ' + 'è più vecchio di' + ' ' + secondUser.firstName;
    }
}

console.log(ageComparison(firstUser,secondUser));

// SECONDO ESERCIZIO //

class Pet {
    constructor(petName, ownerName, species, breed) {
        this.petName = petName;
        this.ownerName = ownerName;
        this.species = species;
        this.breed = breed;
    }

    compareOwners = function (pets){
        return this.ownerName === pets.ownerName
    }
}


let nameInputField = document.getElementById('pet-name')
let ownerInputField = document.getElementById('owner-name')
let speciesInputField = document.getElementById('species')
let breedInputField = document.getElementById('breed')

let species = [];
let breed = [];

let formReference = document.querySelector('form')
formReference.addEventListener('submit', (e) => {
  e.preventDefault()
    let elementsForm = new Element(nameInputField.value,ownerInputField.value,speciesInputField.value,breedInputField-value)
    console.log(elementsForm)

    species.push('Cane', 'Gatto', 'Coniglio', 'Pesce')
    breed.push('Labrador', 'Soriano', 'Nano')
    createList()
})