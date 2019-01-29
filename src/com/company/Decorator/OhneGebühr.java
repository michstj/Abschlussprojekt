package com.company.Decorator;


import com.company.WR;

public class OhneGebühr implements Logger{
    protected WR wr;

    public OhneGebühr(WR wr){
        this.wr = wr;

    }



    @Override
    public void assemble() {
        System.out.print("Umrechnung, Variante "+wr.getVariante()+ " mit dem Betrag: "+wr.getNeuerbetrag());

    }
}
