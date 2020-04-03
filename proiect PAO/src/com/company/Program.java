package com.company;

import java.util.ArrayList;
import java.util.TreeSet;

public class Program {
    TreeSet<Activitate> activitati;
    Ocupatie ocupatie;

    public Ocupatie getOcupatie() {
        return ocupatie;
    }

    public void setOcupatie(Ocupatie ocupatie) {
        this.ocupatie = ocupatie;
    }

    public Program(Ocupatie ocupatie) {
        setOcupatie(ocupatie);
    }

    public void AdaugaActivitate(Activitate activitate) {
        activitati.add(activitate);
    }
/*
    public void AdaugaOcupatie(Ocupatie ocupatie) {
        ocupatie.add(ocupatie);
    }
*/
    public Program() {
        activitati = new TreeSet<Activitate>();
        ocupatie = new Ocupatie("inexistent");
    }

    public int verificaDisponibilitatea(IntervalOrar interval) {
        return 1;
    }

    public void AfiseazaActivitati() {
        for(Activitate act: activitati) {
            System.out.println(act.getNume() + " " + act.getPrioritate() + " " + act.getData() + " " + act.getInterval().getStart() + " " + act.getInterval().getSfarsit());
        }
    }

}
