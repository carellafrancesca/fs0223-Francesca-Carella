//CLASSE
class Capo{
    id:number;
    codprod:number;
    collezione:string;
    capo:string;
    modello:number;
    quantità:number;
    colore:string;
    prezzoivaesclusa:number;
    prezzoivainclusa:number;
    disponibile:string;
    saldo:number;

    constructor(
      id: number, 
      codprod: number,
      collezione: string,
      capo: string, 
      modello: number, 
      quantità: number, 
      colore: string, 
      prezzoivaesclusa: number, 
      prezzoivainclusa: number, 
      disponibile: string, 
      saldo: number)
    {
        this.id = id;
        this.codprod = codprod;
        this.collezione = collezione;
        this.capo = capo;
        this.modello = modello;
        this.quantità = quantità;
        this.colore = colore;
        this.prezzoivaesclusa = prezzoivaesclusa;
        this.prezzoivainclusa = prezzoivainclusa;
        this.disponibile = disponibile;
        this.saldo = saldo;
        this.mostraPrezzo()
    }

    mostraPrezzo(): void {
        console.log('Prodotto: ' + this.capo);
        console.log('Prezzo con Iva ' + this.prezzoivainclusa + '$');
    }
}

//FETCH
fetch("Abbigliamento.json")
  .then((res:Response) => {
    if (res.ok) {
      return res.json()
    } else {
      throw new Error("Errore")
    }
  })
  .then((data) => {
    let arr:any = []
    data.forEach((element:any) =>{
    let capoAbbigliamento = new Capo(
        element.id,
        element.codprod,
        element.collezione,
        element.capo,
        element.modello,
        element.quantità,
        element.colore,
        element.prezzoivaesclusa,
        element.prezzoivainclusa,
        element.disponibile,
        element.saldo
    );
    arr.push(capoAbbigliamento)
    });
    console.log(arr);
  })
  .catch((err) => {
    console.log(err)
  })

