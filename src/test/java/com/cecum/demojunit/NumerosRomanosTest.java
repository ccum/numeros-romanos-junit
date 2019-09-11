package com.cecum.demojunit;

import static org.junit.Assert.assertEquals;

public class NumerosRomanosTest {


    private NumerosRomanos numeroRomanos = new NumerosRomanos();

    public void pasar1Aromanos() {
        String romano = numeroRomanos.convertirAromanos(1);
        assertEquals(romano, "I");
    }

}