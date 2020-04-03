package com.company;
import com.company.Serviciu;

import java.util.Scanner;

public class Main {
    public static void AfiseazaMeniu() {
        System.out.println("1. Afisati toate departamentele.");
        System.out.println("2. Adaugati un departament nou.");
        System.out.println("3. Afisati toti angajatii.");
        System.out.println("4. Adaugati un angajat nou.");
        System.out.println("5. Concediaza angajat.");
        System.out.println("6. Afiseaza programele tuturor angajatilor.");
        System.out.println("7. Programeaza activitate noua.");
        System.out.println("8. Verifica disponibilitatea unui angajat la un anumit moment.");
        System.out.println("9. Afiseaza sedintele departamentelor.");
        System.out.println("11. Exit");
        System.out.println();
        System.out.println("Optiunea dumneavoastra:");

    }

    public static void main(String[] args) {
        System.out.println("Bine ati venit!\n");
        System.out.println("Aveti urmatoarele optiuni:\n");
        Scanner in = new Scanner(System.in);
        int optiune;
        Serviciu serviciu = new Serviciu();
        while (true) {
            AfiseazaMeniu();
            optiune = in.nextInt();
            if (optiune==1) {
                serviciu.AfiseazaDepartamente();
            } else if (optiune==2) {
                serviciu.CitesteDepartamentDeLaTastatura();
                System.out.print("Departamentul a fost adaugat!");
            }else if(optiune==3){
                serviciu.AfiseazaAngajati();
            }else if(optiune==4){
                serviciu.CitesteAngajatDeLaTastatura();
                System.out.print("Angajatul a fost adaugat!");
            }else if(optiune==5){
                serviciu.StergeAngajat();
            }else if(optiune==6) {
                serviciu.AfiseazaProgrameleAngajatilor();
            }else if(optiune==7) {
                System.out.println("Ce fel de activitate doriti sa programati? (1=activitate individuala/2=sedinta departament)");
                int tip;
                tip = in.nextInt();
                if (tip == 1) {
                    serviciu.ProgrameazaActivitateNoua();
                } else if (tip == 2) {
                    System.out.println("Nu am mai avut timp sa implementez aceasta optiune");
                    // serviciu.ProgrameazaSedintaNoua();
                }
            }else if(optiune==8) {
                System.out.println("Nu am mai avut timp sa implementez aceasta optiune");
            }else if(optiune==9) {
                System.out.println("Nu am mai avut timp sa implementez aceasta optiune");
            }else if(optiune==10) {
                System.out.println("Nu am mai avut timp sa implementez aceasta optiune");
            }else if(optiune==11) {
                System.out.print("O zi buna!");
                return;
            }
            else {
                System.out.print("Va rugam sa selectati o optiune valida!");
            }
            /*
            System.out.print("Daca doriti incheierea sesiunii, introduceti 0\n");
            optiune = in.nextInt();
            if (optiune == 0) {
                System.out.print("O zi buna!");
                return;
            }
             */
            System.out.print("\n\n");
        }
    }
}
