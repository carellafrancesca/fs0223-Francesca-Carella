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
var Veicolo = /** @class */ (function () {
    function Veicolo(nRuote, velMax) {
        if (nRuote === void 0) { nRuote = 2; }
        this.vel = 0;
        this.nRuote = nRuote;
        this.velMax = velMax;
    }
    Veicolo.prototype.fermaVeicolo = function () {
        this.vel = 0;
    };
    return Veicolo;
}());
var Bicicletta = /** @class */ (function (_super) {
    __extends(Bicicletta, _super);
    function Bicicletta() {
        return _super.call(this, 2, 50) || this;
    }
    Bicicletta.prototype.accelera = function (vel) {
        this.vel++;
    };
    Bicicletta.prototype.frena = function (vel) {
        this.vel--;
    };
    return Bicicletta;
}(Veicolo));
var Automobile = /** @class */ (function (_super) {
    __extends(Automobile, _super);
    function Automobile(velMax) {
        return _super.call(this, 4, velMax) || this;
    }
    Automobile.prototype.accelera = function (vel) {
        this.vel += 40;
    };
    Automobile.prototype.frena = function (vel) {
        this.vel -= 40;
    };
    return Automobile;
}(Veicolo));
var bici = new Bicicletta();
console.log(bici.vel);
bici.accelera();
bici.accelera();
bici.accelera();
console.log(bici.vel);
bici.fermaVeicolo();
console.log(bici.vel);
var auto = new Automobile(150);
console.log(auto.vel);
auto.accelera();
console.log(auto.vel);
auto.fermaVeicolo();
console.log(auto.vel);
