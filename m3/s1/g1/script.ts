let player1:number = 35;
let player2:number = 60;

let randomNumber:number = Math.floor(Math.random() * (100-1) + 1);
console.log("Il numero generato casualmente è", randomNumber);

var distanza_giocatore1:number = Math.abs(randomNumber - player1);
var distanza_giocatore2:number = Math.abs(randomNumber - player2);

function generateNumber():void {
    if (player1 === randomNumber) {
        console.log("Il giocatore 1 ha azzeccato il numero casuale");
    } else if (player2 === randomNumber) {
        console.log("Il giocatore 2 ha azzeccato il numero casuale");
    } else if (distanza_giocatore1 < distanza_giocatore2) {
        console.log("Nessuno dei due giocatori ha azzeccato il numero casuale, ma il giocatore 1 si è avvicinato di più");
    } else {
        console.log("Nessuno dei due giocatori ha azzeccato il numero casuale, ma il giocatore 2 si è avvicinato di più");
    }
}

generateNumber();
