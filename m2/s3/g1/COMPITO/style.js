// PRIMO ESERCIZIO //

class User1{
    constructor(firstName, lastName, age, location){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.location = location;
    }
}

let firstUser = new User1('Mario', 'Rossi', 28, 'Italy');
console.log(firstUser);

class User2{
    constructor(firstName, lastName, age, location){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.location = location;
    }
}

let secondUser = new User2('Francesca', 'Carella', 23, 'Italy');
console.log(secondUser);


function ageComparison (User1,User2){
    if(User1.age < User2.age){
        return 'false'
    }else{
        return User1.firstName + ' ' + 'è più vecchio di' + ' ' + User2.firstName;
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

let formReference = document.querySelector('form')
formReference.addEventListener('submit', (e) => {
  e.preventDefault()
})