package com.AbbonamentiPalestra.Class;

public enum TipoAbbonamento {
    MENSILE(50.00),
    SEMESTRALE(100.00),
    ANNUALE(170.00);

    private double prezzo;

    TipoAbbonamento(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getPrezzo() {
        return prezzo;
    }
}
