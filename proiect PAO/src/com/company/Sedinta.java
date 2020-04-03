package com.company;

import java.util.Date;

public class Sedinta extends Activitate{

    private String nume_departament;

    public Sedinta(int id, int prioritate, Date data, IntervalOrar interval, String NumeDepartament){
        super("Sedinta", prioritate, data, interval );
        nume_departament = NumeDepartament;
    }
}
