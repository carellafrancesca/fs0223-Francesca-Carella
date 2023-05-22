console.log('Hello world');

let nome:string = 'Mario';
let anni:number = 30;
let boolean:boolean = false;

let array:any[] = [true, 30, 'testo']; //any: array misto, qualsiasi tipo di dato
let arrayString:string[] = ['stringa'];
let arrayNumber:number[] = [30,15,24];

nome = 'Marco';

let vuota:undefined|number;
vuota = 0;

//tipizzazione oggetti

let user:{nome:string} = {
    nome: 'Mario'
}

console.log(user.nome);


//let element:HTMLInputElement | null = document.querySelector('#test')


//tipizzazione funzioni

let salutoVar:Function = ():void => {
    console.log('Ciao!')
}

function saluto():void{
    console.log('Ciao')
}
saluto()

function restituisciSaluto():string{
    return 'Ciao!'
}

function somma(a:number,b:number):number{
    return a + b;
}
somma(0,5);