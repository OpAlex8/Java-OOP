package com.company;

import java.util.Date;

public class Activitate implements Comparable<Activitate>{
    private String nume;
    private static int id;
    static int prioritate;
    private Date data;
    private IntervalOrar interval;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Activitate.id = id;
    }

    public static int getPrioritate() {
        return prioritate;
    }

    public static void setPrioritate(int prioritate) {
        Activitate.prioritate = prioritate;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public IntervalOrar getInterval() {
        return interval;
    }

    public void setInterval(IntervalOrar interval) {
        this.interval = interval;
    }

    public Activitate(String nume, int prioritate, Date dat, IntervalOrar intv) {
        setNume(nume);
        setPrioritate(prioritate);
        data = new Date();
        setData(dat);
        interval = new IntervalOrar(intv.getStart(), intv.getSfarsit());
        setInterval(intv);
    }

    public  Activitate() {
        setNume("inexistent");
    }

    public int compareTo(Activitate other) {
        if (this.interval.getStart() != other.interval.getStart()) {
            return this.interval.getStart() - other.interval.getStart();
        }
        return this.interval.getSfarsit() - other.interval.getSfarsit();
    }
}
