package com.company.Adapter;

import com.company.WR;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdapterTest {

    WR wr;
    @Test
    public void sammelumrechnen() {
        double[] betrage = {10,20,30,40,50};
        double[] betrageNeu = {12.2,24.4,36.6,48.8,51};
        Adapter adapter = new Adapter(wr);
        assertEquals(betrageNeu[1], adapter.sammelumrechnen(betrage,"EUR2DOLLAR"));

    }
}