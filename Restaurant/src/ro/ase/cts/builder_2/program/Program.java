package ro.ase.cts.builder_2.program;

import ro.ase.cts.builder_2.Rezervare_2;

public class Program {
    public static void main(String[] args) {
        Rezervare_2 rezervare = new Rezervare_2.Builder().setNrPersoane(3).build();
        System.out.println(rezervare.toString());
    }
}
