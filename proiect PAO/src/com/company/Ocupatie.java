package com.company;

public class Ocupatie {
    private String nume;
    private IntervalOrar interval;
    private int id;

    public IntervalOrar getInterval() {
        return interval;
    }

    public void setInterval(IntervalOrar interval) {
        this.interval = interval;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ocupatie(String nume) {
        setNume(nume);
        IntervalOrar intv = new IntervalOrar(9,17);
        interval = new IntervalOrar(9,17);
        setInterval(intv);
    }

    public Ocupatie(String nume, int id, IntervalOrar interval){
        setNume(nume);
        setId(id);
        setInterval(interval);
    }
}
