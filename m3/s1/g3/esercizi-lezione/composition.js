var Auto = /** @class */ (function () {
    function Auto() {
        this.motore = new Motore();
    }
    Auto.prototype.accendiAuto = function () {
        this.motore.avvia();
    };
    Auto.prototype.spegniAuto = function () {
        this.motore.spegni();
    };
    return Auto;
}());
var Motore = /** @class */ (function () {
    function Motore() {
        this.accenzione = false;
    }
    Motore.prototype.avvia = function () {
        console.log('Motore acceso');
        this.accensione = true;
    };
    Motore.prototype.spegni = function () {
        console.log('Motore spento');
        this.accensione = false;
    };
    Motore.prototype.onOff = function () {
        this.accenzione = !this.accenzione;
    };
    return Motore;
}());
