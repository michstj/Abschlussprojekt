package com.company.Decorator;

import com.company.WR;

public class OhneGebühr implements Logger{

    @Override
    public void assemble(String variante, double betrag) {
        System.out.print("Umrechnung, Variante "+variante+ " mit dem Betrag: "+betrag +"\n");

    }
}
