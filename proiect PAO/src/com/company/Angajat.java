package com.company;

public class Angajat {
    private String nume;
    private static int id_static=0;
    private int id;
    Program program;
    private Departament departament;

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    private static int getId_static() {
        return id_static;
    }

    private static void setId_static(int id_static) {
        Angajat.id_static = id_static;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public Angajat(String nume, Departament departament){
        setNume(nume);
        id = id_static;
        id_static++;
        program = new Program();
        setDepartament(departament);
    }

    public Angajat(){
        setNume("inexistent");
        program = new Program();
    }

    public void AdaugaActivitate(Activitate activitate) {
        program.AdaugaActivitate(activitate);
    }

}
