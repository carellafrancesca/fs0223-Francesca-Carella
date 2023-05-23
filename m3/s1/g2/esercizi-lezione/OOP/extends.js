var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Pizza = /** @class */ (function () {
    function Pizza(_gusto, _prezzo) {
        this.formati = ['Normale', 'Mini', 'Mezzo Metro'];
        this.gusto = _gusto;
        this.prezzo = _prezzo;
    }
    Pizza.prototype.informazioni = function () {
        console.log("Gusto:".concat(this.gusto, ", Prezzo:").concat(this.prezzo, "$"));
    };
    return Pizza;
}());
var margherita = new Pizza('Margherita', 5);
//console.log(margherita.prezzo);
margherita.informazioni();
var PizzaSpeciale = /** @class */ (function (_super) {
    __extends(PizzaSpeciale, _super);
    function PizzaSpeciale(_gusto, _prezzo, _altezzaCornicione) {
        var _this = _super.call(this, _gusto, _prezzo) || this;
        _this.altezzaCornicione = _altezzaCornicione;
        return _this;
    }
    return PizzaSpeciale;
}(Pizza));
var diavola = new PizzaSpeciale('Diavola', 1, 5);
console.log(diavola);
