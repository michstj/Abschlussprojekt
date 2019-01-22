package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class WRTest {

    WR wr;
    WR eur2dollar = new EUR2DOLLAR(WR.DOLLAR);
    WR eur2yen = new EUR2YEN(WR.YEN);
    WR eur2rubel = new EUR2RUBEL(WR.RUBEL);



    @Test
    public void setNextWR() {
        eur2dollar.setNextWR(eur2yen);
        eur2yen.setNextWR(eur2rubel);
        assertEquals("EUR2DOLLAR",eur2dollar.variante);

    }

    @Test
    public void umrechnen() {

        eur2dollar.setNextWR(eur2yen);
        eur2yen.setNextWR(eur2rubel);
        assertEquals(12.2,eur2dollar.umrechnen("EUR2DOLLAR",10),0.01);
        assertEquals(1241.0,eur2dollar.umrechnen("EUR2YEN",10),0.01);
        assertEquals(754.09,eur2dollar.umrechnen("EUR2RUBEL",10),0.01);
    }

    @Test
    public void rechner() {
    }

}