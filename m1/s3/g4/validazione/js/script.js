let myForm = document.getElementById('myForm');
let myFormButton = document.querySelector('#myForm .invia');

//modalità gestendo il submit sul form

myForm.addEventListener('submit', function(e){
    e.preventDefault(); //blocca funzionamenti predefiniti qualora ce ne fossero, per l'elemento selezionato e questo evento
    console.log('inviato');
});

//modalità gestendo il click sul bottone

myFormButton.addEventListener('click', function(e){
    e.preventDefault();

    let nome = document.querySelector('#myForm input[name="nome"]');
    let cognome = document.querySelector('#myForm input[name="cognome"]');
    let email = document.querySelector('#myForm input[name="e-mail"]');
    let password = document.querySelector('#myForm input[name="password"]');

    let valid = true;

    if(nome.value == ''){
        console.log('Il campo nome è vuoto');
        valid = false;
    }
    if(cognome.value == ''){
        console.log('Il campo cognome è vuoto');
        valid = false;
    }
    if(email.value == ''){
        console.log('Il campo email è vuoto');
        valid = false;
    }
    if(password.value == ''){
        console.log('Il campo password è vuoto');
        valid = false;
    }

    if(valid){
        //codice che invia i dati al server
        console.log('inviato');

    }
});

