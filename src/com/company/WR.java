package com.company;

public abstract class WR implements IUmrechnen
{
    protected WR nextWR;
    protected String variante;
    public static double YEN = 124.1;
    public static double DOLLAR = 1.22;
    public static double RUBEL = 75.41;
    private static double neuerbetrag;

    public void setNextWR(WR nextWR){
        this.nextWR = nextWR;
    }

    public double umrechnen(String variante, double betrag){

        if(this.variante.equals(variante)){
            this.neuerbetrag = rechner(betrag);
            return neuerbetrag;
        }
        else if(nextWR !=null){
            nextWR.umrechnen(variante, betrag);
        }
        else if(nextWR == null){
            return neuerbetrag;
        }

        return neuerbetrag;
    }

    abstract protected double rechner(double betrag);

}
