package com.sda.abstracte;

import com.sda.interfete.ICaroserie;

public class Motocicleta extends AMotor
                         implements ICaroserie {
    @Override
    public String getCilindre() {
        return "1.2";
    }

    @Override
    public String getTip() {
        return "Chopper";
    }
}
