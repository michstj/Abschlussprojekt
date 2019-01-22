package com.company;

import com.company.LoggingDAO.Log;

import java.sql.SQLException;

public class EUR2YEN extends WR {

    protected double kurs;

    public EUR2YEN(double kurs) {
        this.kurs = kurs;
        this.variante = "EUR2YEN";
    }

    @Override
    protected double rechner(double betrag) {
        Log log = new Log(this.variante,betrag,this.kurs,umrechnerBefehle.rechnen(betrag,kurs));
        try{
            this.logimp.addLog(log);
        }
        catch (SQLException se){
            se.getErrorCode();
        }
        return umrechnerBefehle.rechnen(betrag,kurs);
    }
}
