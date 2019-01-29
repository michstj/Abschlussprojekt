package com.company;

import com.company.Command.UmrechnerBefehle;
import com.company.Decorator.Logger;
import com.company.Decorator.OhneGebühr;
import com.company.Decorator.mitGebühr;
import com.company.LoggingDAO.Log;
import com.company.LoggingDAO.LogImplementation;

import java.util.Stack;

public abstract class WR implements IUmrechnen
{
    protected WR nextWR;
    protected String variante;
    public static double YEN = 124.1;
    public static double DOLLAR = 1.22;
    public static double RUBEL = 75.41;
    private static double neuerbetrag;


    protected static Stack<Log> stack = new Stack<>();

    protected UmrechnerBefehle umrechnerBefehle = new UmrechnerBefehle(this);


    protected LogImplementation logimp = new LogImplementation();


    public void setNextWR(WR nextWR){
        this.nextWR = nextWR;
    }

    public double umrechnen(String variante, double betrag){

        if(this.variante.equals(variante)){
            this.neuerbetrag = rechner(betrag);
            Logger mitGeb = new mitGebühr(this);
                mitGeb.assemble();
            return neuerbetrag;
        }
        else if(nextWR !=null){
            nextWR.umrechnen(variante, betrag);
        }

        return neuerbetrag;
    }

    public int getStacksize(){
        return stack.size();
    }
    public Log getStackTop(){
        return stack.peek();
    }
    public void stackUndo(){
        stack.pop();
    }


    public String getVariante() {
        return variante;
    }

    public static double getNeuerbetrag() {
        return neuerbetrag;
    }

    abstract protected double rechner(double betrag);

}
