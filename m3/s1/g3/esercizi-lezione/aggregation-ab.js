var Studente = /** @class */ (function () {
    function Studente(name, lastname, materie) {
        this.name = name;
        this.lastname = lastname;
        this.materie = materie;
    }
    Object.defineProperty(Studente.prototype, "presentazione", {
        get: function () {
            return "Sono ".concat(this.name, " ").concat(this.lastname, ", e studio le seguenti materie: ").concat(this.materie.join(' - '));
        },
        enumerable: false,
        configurable: true
    });
    return Studente;
}());
var Classe = /** @class */ (function () {
    function Classe(nome) {
        this.studenti = [];
        this.nome = nome;
    }
    Classe.prototype.aggiungiStudente = function (studente) {
        this.studenti.push(studente);
    }; //popolare l'array con la classe precedente
    Object.defineProperty(Classe.prototype, "getStudenti", {
        get: function () {
            return this.studenti;
        },
        enumerable: false,
        configurable: true
    });
    return Classe;
}());
var materie = ['js', 'ts'];
var studente1 = new Studente('Mario', 'Rossi', materie);
var studente2 = new Studente('Maria', 'Rossini', materie);
var studente3 = new Studente('Marco', 'Rosa', materie);
var studente4 = new Studente('Marica', 'Bianchi', materie);
var studente5 = new Studente('Marino', 'Verdi', materie);
var fs0223 = new Classe('fs0223');
fs0223.aggiungiStudente(studente1);
fs0223.aggiungiStudente(studente2);
fs0223.aggiungiStudente(studente3);
fs0223.aggiungiStudente(studente4);
fs0223.aggiungiStudente(studente5);
console.log(fs0223.getStudenti);
console.log(fs0223.getStudenti[0].presentazione);
