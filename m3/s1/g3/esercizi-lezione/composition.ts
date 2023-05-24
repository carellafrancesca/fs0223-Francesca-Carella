class Auto{
    private motore:Motore;

    constructor(){
        this.motore = new Motore();
    }

    accendiAuto(){
        this.motore.avvia();
    }
    spegniAuto(){
        this.motore.spegni();
    }
}

class Motore{

    accenzione:boolean = false;

    avvia():void{
        console.log('Motore acceso');
        this.accensione = true;
    }

    spegni():void{
        console.log('Motore spento');
        this.accensione = false;
    }

    onOff(){
        this.accenzione = !this.accenzione;
    }
}