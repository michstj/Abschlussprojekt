package com.company;

public class EUR2DOLLAR extends WR {

    protected double kurs;

    public EUR2DOLLAR(double kurs) {
        this.kurs = kurs;
        this.variante = "EUR2DOLLAR";
    }

    @Override
    protected double rechner(double betrag) {
        return betrag * kurs;
    }
}
