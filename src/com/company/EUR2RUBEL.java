package com.company;

public class EUR2RUBEL extends WR {

    protected double kurs;

    public EUR2RUBEL(double kurs) {
        this.kurs = kurs;
        this.variante = "EUR2RUBEL";
    }

    @Override
    protected double rechner(double betrag) {
        return betrag * kurs;
    }
}
