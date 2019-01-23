package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    private static WR getChainOfWR(){

        WR eur2dollar = new EUR2DOLLAR(WR.DOLLAR);
        WR eur2yen = new EUR2YEN(WR.YEN);
        WR eur2rubel = new EUR2RUBEL(WR.RUBEL);

        eur2dollar.setNextWR(eur2yen);
        eur2yen.setNextWR(eur2rubel);

        return eur2dollar;
    }


    @Test
    public void main() {
        WR WRChain = getChainOfWR();
        assertEquals(12.2,WRChain.umrechnen("EUR2DOLLAR",10),0.01);
    }
}