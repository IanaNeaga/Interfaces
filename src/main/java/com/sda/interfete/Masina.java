package com.sda.interfete;

public class Masina implements ICaroserie, IMotor {
    /*keyword-ul implements poate implementa mai mult interfete*/
    @Override
    public String getTip() {
        return "Berlina";
    }

    @Override
    public String getCilindre() {
        return "1.2";
    }
}
