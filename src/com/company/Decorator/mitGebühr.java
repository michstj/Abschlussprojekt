package com.company.Decorator;

import com.company.WR;

public class mitGebühr extends OhneGebühr implements Logger {
    protected WR wr;

    public mitGebühr (WR wr){
        super(wr);

    }



    @Override
    public void assemble() {
        super.assemble();
        System.out.println(" mit Gebühren von "+Math.round(100*super.wr.getNeuerbetrag()*0.05)/100d + " " + super.wr.getVariante().substring(4));
    }


}
