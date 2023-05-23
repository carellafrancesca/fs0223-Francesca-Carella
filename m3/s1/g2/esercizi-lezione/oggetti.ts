{
//modalità js
let user = {
    nome: 'mario',
    cognome: 'rossi'
}

console.log(user.nome);

//modalità ts

let userTipizzato:{ nome:string, cognome:string, anni?:number} = {
    nome:'mario',
    cognome:'rossi'
}
//anni è una proprietà facoltativa
//quando si lavora con gli oggetti ts vuole avere certezza della forma di ogni oggetto
}

{

    class User{

        nome:string;
        cognome:string;
        anni?:number | undefined;

        constructor(_nome:string, _cognome:string, _anni:number){
            this.nome= _nome;
            this.cognome = _cognome;
            this.anni = _anni;
        }
    }

    //posso creare un oggetto a mano
    let userTipizzato:User = {
        nome:'mario',
        cognome:'rossi'
    };

    //posso instanziare una classe
    let userTipizzato2:User = new User('Maria','Bianchi');

}