package com.company.LoggingDAO;

import java.sql.*;
import java.util.ArrayList;

public class Log {

    private int id;
    private String variante;
    private double betrag;
    private double kurs;
    private double neuerbetrag;

    public Log(String variante, double betrag, double kurs, double neuerbetrag) {
        this.variante = variante;
        this.betrag = betrag;
        this.kurs = kurs;
        this.neuerbetrag = neuerbetrag;
    }

    public Log() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public double getBetrag() {
        return betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    public double getKurs() {
        return kurs;
    }

    public void setKurs(double kurs) {
        this.kurs = kurs;
    }

    public double getNeuerbetrag() {
        return neuerbetrag;
    }

    public void setNeuerbetrag(double neuerbetrag) {
        this.neuerbetrag = neuerbetrag;
    }
}
