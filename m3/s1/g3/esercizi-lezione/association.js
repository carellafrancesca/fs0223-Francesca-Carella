var User = /** @class */ (function () {
    function User(name, lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    Object.defineProperty(User.prototype, "getName", {
        get: function () {
            return this.name;
        },
        enumerable: false,
        configurable: true
    });
    return User;
}());
var Invoice = /** @class */ (function () {
    function Invoice(intestatario, numeroFattura, importo) {
        this.intestatario = intestatario;
        this.numeroFattura = numeroFattura;
        this.importo = importo;
    }
    return Invoice;
}());
var utente = new User('Mario', 'Rossi');
var fattura = new Invoice(utente, '1/2023', 1000);
console.log(fattura);
console.log(fattura.intestatario.getName);
//fattura.intestatario.getName = 'Mirko'; getName è un metodo getter(get) quindi non posso andare in assegnazione
