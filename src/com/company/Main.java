package com.company;

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
        double test = WRChain.umrechnen("EUR2DOLLAR",10);
        double test2 =  WRChain.umrechnen("EUR2YEN",15);
        double test3 =  WRChain.umrechnen("EUR2RUBEL",15);

        System.out.println(test);
        System.out.println(test2);
        System.out.println(test3);

    }
}
