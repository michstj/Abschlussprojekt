package com.company.Adapter;

import com.company.ISammelumrechnung;
import com.company.WR;
import com.sun.scenario.effect.impl.prism.PrImage;

public class Adapter implements ISammelumrechnung {

    private WR wr;

    public Adapter(WR wr) {

        this.wr = wr;
    }

    @Override
    public double sammelumrechnen(double[] betraege, String variante) {
        double temp;
        double newtemp = 0;
        for (double betrag:betraege) {
            temp = wr.umrechnen(variante, betrag);
            newtemp = newtemp + temp;
        }
        return newtemp;
    }
}
