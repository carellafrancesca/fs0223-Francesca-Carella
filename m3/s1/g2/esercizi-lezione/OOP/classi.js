var User = /** @class */ (function () {
    function User(_nome, _cognome, _anni, _password) {
        this.nome = _nome;
        this.cognome = _cognome;
        this.anni = _anni;
        this.password = _password;
    }
    User.prototype.presentazione = function () {
        console.log("Ciao, mi chiamo ".concat(this.nome, " ").concat(this.cognome, " ed ho ").concat(this.anni, "anni"));
    };
    return User;
}());
var user1 = new User('Mario', 'Rossi', 30);
var user2 = new User('Maria', 'Bianchi', 35, 'jncfndcjwbe');
console.log(user2);
console.log(user2.nome);
console.log(user2.password);
