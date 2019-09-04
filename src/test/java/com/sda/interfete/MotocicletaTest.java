package com.sda.interfete;

import org.junit.Test;

import static org.junit.Assert.*;

public class MotocicletaTest {

    private Motocicleta motocicleta=new Motocicleta();

    @Test
    public void getTip() {
        assertEquals("Cruiser", motocicleta.getTip());
    }

    @Test
    public void getCilindre() {
        assertEquals("600 (0.6)", motocicleta.getCilindre());
    }
}