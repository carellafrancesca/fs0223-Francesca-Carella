var Studente1 = /** @class */ (function () {
    function Studente1(name, lastname, materie) {
        this.name = name;
        this.lastname = lastname;
        this.materie = materie;
    }
    Object.defineProperty(Studente1.prototype, "presentazione", {
        get: function () {
            return "Sono ".concat(this.name, " ").concat(this.lastname, ", e studio le seguenti materie: ").concat(this.materie.join(' - '));
        },
        enumerable: false,
        configurable: true
    });
    return Studente1;
}());
var Classe1 = /** @class */ (function () {
    function Classe1(nome) {
        this.studenti = [];
        this.nome = nome;
    }
    Classe1.prototype.aggiungiStudente = function (studente) {
        this.studenti.push(studente);
    };
    Object.defineProperty(Classe1.prototype, "getStudenti", {
        get: function () {
            return this.studenti;
        },
        enumerable: false,
        configurable: true
    });
    return Classe1;
}());
var Iscrizione = /** @class */ (function () {
    function Iscrizione(studente, classe) {
        this.studente = studente;
        this.classe = classe;
    }
    Iscrizione.prototype.aggiungiCorso = function () {
        this.classe.aggiungiStudente(this.studente);
    };
    return Iscrizione;
}());
