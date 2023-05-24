"use strict";
var GiornoSettimana;
(function (GiornoSettimana) {
    GiornoSettimana[GiornoSettimana["DOMENICA"] = 1] = "DOMENICA";
    GiornoSettimana[GiornoSettimana["LUNEDI"] = 3] = "LUNEDI";
    GiornoSettimana[GiornoSettimana["MARTEDI"] = 4] = "MARTEDI";
    GiornoSettimana[GiornoSettimana["MERCOLEDI"] = 5] = "MERCOLEDI";
    GiornoSettimana[GiornoSettimana["GIOVEDI"] = 6] = "GIOVEDI";
    GiornoSettimana[GiornoSettimana["VENERDI"] = 7] = "VENERDI";
    GiornoSettimana[GiornoSettimana["SABATO"] = 8] = "SABATO";
})(GiornoSettimana || (GiornoSettimana = {}));
console.log(GiornoSettimana);
console.log(GiornoSettimana[0]); //DOMENICA
console.log(GiornoSettimana.DOMENICA); //0
var ColorSito;
(function (ColorSito) {
    ColorSito["rosso"] = "#97000";
    ColorSito["giallo"] = "Yellow";
})(ColorSito || (ColorSito = {}));
