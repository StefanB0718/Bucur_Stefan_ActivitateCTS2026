package ro.ase.cts.ro.ase.cts.program;

import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.builder.BuilderAbstract;
import ro.ase.cts.builder.clase.builder.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new Rezervare(true, true, "Rosu cu Alb", "Romantic", 2);
        Rezervare rezervare2 = new Rezervare(true, true, "Rosu cu Alb", "Romantic", 2);

        Rezervare rezervare3 = new Rezervare();
        rezervare3.setLaGeam(true);
        rezervare3.setNrPersoane(4);

        Rezervare rezervare4 = new Rezervare();
        rezervare4.setLaGeam(true);
        rezervare4.setNrPersoane(4);

        System.out.println(rezervare4);


        BuilderAbstract builder = new RezervareBuilder();
        Rezervare rezervare5=builder.setNrPersoane(4).setCuloareFataMasa("Verde").build();
        System.out.println(rezervare5);

        Rezervare rezervare6 = builder.setNrPersoane(1).build();
        System.out.println(rezervare6);



    }
}