package com.company.Command;

import com.company.WR;

public class UmrechnerBefehle implements Commands {

    private WR wr;


    public UmrechnerBefehle(WR wr) {
        this.wr = wr;
    }

    @Override
    public double rechnen(double kurs, double betrag) {
        return betrag*kurs;
    }

}
