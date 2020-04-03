package com.company;

public class IntervalOrar implements Comparable<IntervalOrar> {
    private int start;
    private int sfarsit;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {

        this.start = start;
    }

    public int getSfarsit() {

        return sfarsit;
    }

    public void setSfarsit(int sfarsit) {

        this.sfarsit = sfarsit;
    }

    public IntervalOrar(int start, int sfarsit){
        setStart(start);
        setSfarsit(sfarsit);
    }

    public IntervalOrar()
    {
        setStart(0);
        setSfarsit(0);
    }
    public boolean seSuprapune(IntervalOrar other) {
        if(this.sfarsit > other.start && this.start < other.start) {
            return true;
        }
        if(other.sfarsit > this.start && other.start < this.start) {
            return true;
        }
        if(this.start < other.start && this.sfarsit > other.sfarsit) {
            return true;
        }
        if (other.start < this.start && other.sfarsit > this.sfarsit) {
            return true;
        }
        return false;
    }

    public int compareTo(IntervalOrar other) {
        if (this.start != other.start) {
            return this.start - other.start;
        }
        return this.sfarsit - other.sfarsit;
    }
}

