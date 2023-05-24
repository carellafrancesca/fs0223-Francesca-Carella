console.error('=======================')
function numero(n:number):number{
    return n
}

console.log(numero(0));

function sommaConcatenata<T>(a:T, b:T):T{
    //return a + b;
}

console.log(sommaConcatenata<number>(2,3));
console.log(sommaConcatenata<string>('ciao','come stai?'));

//GENERICS MULTIPLI

interface chiaveValore<T,U>{
    prop1:T,
    prop2:U
}

let obj:chiaveValore<string,boolean> = {
    prop1: "",
    prop2: false
}

let obj2:chiaveValore<number,boolean> = {
    prop1: 0,
    prop2: false
}

class Prova<T>{
    prop!:T; //! => spegne l'errore, comunica a ts che sappiamo cosa stiamo facendo
}

new Prova<string[]>()

let pizze = ['Margherita','Diavola','Capricciosa']
let numeri = [4,6,7];

function filtra(arr:T[], str:T):T[]{
    return arr.filter((el:T) => el == str);
}

console.log(filtra<string>(pizze,'Capricciosa'));
console.log(filtra<number>(numeri, 6));
