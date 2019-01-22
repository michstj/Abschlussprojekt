package com.company;

import com.company.Adapter.Adapter;
import com.company.Decorator.OhneGebühr;
import com.company.LoggingDAO.Log;
import com.company.LoggingDAO.LogImplementation;

import java.sql.SQLException;

public class Main {


    private static WR getChainOfWR(){

        WR eur2dollar = new EUR2DOLLAR(WR.DOLLAR);
        WR eur2yen = new EUR2YEN(WR.YEN);
        WR eur2rubel = new EUR2RUBEL(WR.RUBEL);

        eur2dollar.setNextWR(eur2yen);
        eur2yen.setNextWR(eur2rubel);

        return eur2dollar;
    }
    public static void main(String[] args) {
        WR WRChain = getChainOfWR();
/*
        double test = WRChain.umrechnen("EUR2DOLLAR",10);
        double test2 =  WRChain.umrechnen("EUR2YEN",15);
        double test3 =  WRChain.umrechnen("EUR2RUBEL",15);


        System.out.println(test);
        System.out.println(test2);
        System.out.println(test3);
*/
        double[] betrage = {10,20,30,40,50};
        Adapter adapter = new Adapter(WRChain);
        adapter.sammelumrechnen(betrage,"EUR2YEN");

        /*
        Log log = new Log("EUR2YEN",10,1.2,12);
        LogImplementation logimp = new LogImplementation();
        try{
            logimp.deleteLog(1);
        }
        catch (SQLException se){
            se.getErrorCode();
        }
        */




    }
}
