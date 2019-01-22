package com.company;

public class EUR2YEN extends WR {

    protected double kurs;

    public EUR2YEN(double kurs) {
        this.kurs = kurs;
        this.variante = "EUR2YEN";
    }

    @Override
    protected double rechner(double betrag) {
        return betrag * kurs;
    }
}
