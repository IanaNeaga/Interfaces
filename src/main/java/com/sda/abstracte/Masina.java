package com.sda.abstracte;

import com.sda.interfete.IMotor;

import java.util.HashMap;

public class Masina extends ACaroserie
                    implements IMotor {

    @Override
    public String getTip() {
        return "Cabrio";
    }

    @Override
    public String getCilindre() {
        return "4.7 Hemi";
    }
}
