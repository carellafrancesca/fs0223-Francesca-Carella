//funzioni assegnate ad una variabile

const prova:Function = function():void{ //void = la funzione non restituisce dati
    console.log('test')
}

prova()

//funzioni classiche

function funzioneProva(){
    return 'stringa restituita';
}

funzioneProva()

//funzioni parametriche

function creaHTMLBold(testo:string){
    //va a scrivere in bold il testo in ingresso
}

function $(selettore:string):HTMLElement | null{
    return document.querySelector(selettore)
}

$('#test')?.style.color // ? = interrompe la lettura dell'oggetto qualora fosse null, come se fosse uno stop prima di procedere

/*let test = $('#test');
    if(test){
        test.style.color
    }
------- alternativa alla riga 27*/

//funzioni freccia

let test1= ():string => 'ciao';

let test2 = ():void => {
    console.log('prova void')
}

let moltiplica = (a:number) => a*2;

//parametri facoltativi

function somma(a:number, b:number, c?:number):number{ //c? è un parametro facoltativo - alternativa per rappresentare un elemento facoltativo => c:number = 0
    if(!c) c = 0; //gestisco la mancanza di c per spegnere l'errore in ts
    return a + b + c;
}
