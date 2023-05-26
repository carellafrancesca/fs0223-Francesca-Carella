interface ISmartphone{
    carica:number;
    numeroChiamate:number;
    costoMinuto:number;

    ricarica(euro:number):void;
    numero404():string;
    getNumeroChiamate():number;
    chiamata(min:number):void;
    azzeraChiamate():void;
}

class Smartphone implements ISmartphone{
    carica:number;
    numeroChiamate: number;
    costoMinuto: number;

    constructor(carica:number){
        this.carica = carica;
        this.numeroChiamate = 0;
        this.costoMinuto = 0.20;
    }

    ricarica(euro:number):void{
        this.carica += euro;
    }

    numero404():string{
        return `Il credito residuo è: ${this.carica} €`;
    }

    getNumeroChiamate():number{
        return this.numeroChiamate;
    }

    chiamata(min:number):void{
        let costoTotaleChiamata = min * this.costoMinuto;
        if (costoTotaleChiamata <= this.carica){
            this.carica -= costoTotaleChiamata;
            this.numeroChiamate ++;
            console.log(`La chiamata è durata ${min} minuti`)
        } else {
            console.log("Credito insufficiente.");
        }
    }

    azzeraChiamate():void{
        this.numeroChiamate = 0;
    }

}

let cellulare1 = new Smartphone(0);
let cellulare2 = new Smartphone(0);
let cellulare3 = new Smartphone(0);

//CELLULARE1
cellulare1.ricarica(30);
console.log(cellulare1);

cellulare1.numero404();
console.log(cellulare1.numero404());

cellulare1.chiamata(3);
console.log(cellulare1.numero404());
console.log(cellulare1.numeroChiamate);

cellulare1.azzeraChiamate();
console.log(cellulare1.numeroChiamate);

//CELLULARE2
cellulare2.ricarica(40);
console.log(cellulare2);

cellulare2.numero404();
console.log(cellulare2.numero404());

cellulare2.chiamata(7);
console.log(cellulare2.numero404());
console.log(cellulare2.numeroChiamate);

cellulare2.azzeraChiamate();
console.log(cellulare2.numeroChiamate);

//CELLULARE3
cellulare3.ricarica(25);
console.log(cellulare3);

cellulare3.numero404();
console.log(cellulare3.numero404());

cellulare3.chiamata(15);
console.log(cellulare3.numero404());
console.log(cellulare3.numeroChiamate);

cellulare3.azzeraChiamate();
console.log(cellulare3.numeroChiamate);