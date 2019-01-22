package com.company;

import com.company.LoggingDAO.Log;

import java.sql.SQLException;

public class EUR2RUBEL extends WR {

    protected double kurs;

    public EUR2RUBEL(double kurs) {
        this.kurs = kurs;
        this.variante = "EUR2RUBEL";
    }

    @Override
    protected double rechner(double betrag) {
        Log log = new Log(this.variante,betrag,this.kurs,umrechnerBefehle.rechnen(betrag,kurs));
        try{
            this.logimp.addLog(log);
            stack.push(log);
        }
        catch (SQLException se){
            se.getErrorCode();
        }
        return umrechnerBefehle.rechnen(betrag,kurs);
    }
}
