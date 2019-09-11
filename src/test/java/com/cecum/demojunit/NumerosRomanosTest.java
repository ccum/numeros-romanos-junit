package com.cecum.demojunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumerosRomanosTest {


    private NumerosRomanos numeroRomanos = new NumerosRomanos();

    @Test
    public void pasar1Aromanos() {
        String romano = numeroRomanos.convertirAromanos(1);
        assertEquals(romano, "I");
    }

}