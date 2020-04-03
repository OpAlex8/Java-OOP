package com.company;

public class Departament {
    private String nume;
    private int id;
    private Angajat[] angajati;
    private Ocupatie ocupatie;

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

    public Angajat[] getAngajati() {
        return angajati;
    }

    public void setAngajati(Angajat[] angajati) {
        this.angajati = angajati;
    }

    public Ocupatie getOcupatie() {
        return ocupatie;
    }

    public void setOcupatie(Ocupatie ocupatie) {
        this.ocupatie = ocupatie;
    }

    public Departament(String nume, Ocupatie ocupatie) {
        setNume(nume);
        setId(id);
        setOcupatie(ocupatie);
    }
    public Departament() {
        setNume("inexistent");
    }
}
