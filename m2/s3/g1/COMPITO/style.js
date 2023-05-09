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

// SECONDO ESERCIZIO - NON FINITO //

let petList = []

let petnameInputField = document.getElementById('#pet-name')
let ownerInputField = document.getElementById('#owner-name')
let speciesInputField = document.getElementById('#species')
let breedInputField = document.getElementById('#breed')

class Pet {
    constructor(petName, ownerName, species, breed) {
        this.petName = petName;
        this.ownerName = ownerName;
        this.species = species;
        this.breed = breed;
    }
}

const putPetsinHTML = function(){
    let petListReference = document.getElementById
}

// new Pet() 
// console.log()

let petformReference = document.querySelector('form')
petformReference.addEventListener('submit', (e) => {
  e.preventDefault() //questo evita che la pagina si aggiorni in automatico

    let petCreated = new Pet(petnameInputField.value,ownerInputField.value,speciesInputField.value,breedInputField.value)
    console.log('HO CREATO UN PET', petCreated)

    petList.push(petCreated)
    petnameInputField.value = ''
    ownerInputField.value = ''
    speciesInputField.value = ''
    breedInputField.value = ''

    petnameInputField
})