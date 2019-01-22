package com.company.Decorator;

public class mitGebühr implements Logger {

    @Override
    public void assemble(String variante, double betrag) {
        System.out.print("Umrechnung, Variante "+variante+ " mit dem Betrag: "+betrag + " || Die Gebühr beträgt: "+betrag*0.05+"€ || Gesamt:"+(betrag+betrag*0.05)+"€ \n");

    }
}
