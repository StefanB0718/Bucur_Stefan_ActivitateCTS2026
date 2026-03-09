package ro.ase.cts.spital.a01builder.program;

import ro.ase.cts.spital.a01builder.pacient.Pacient;

public class Program {
    public static void main(String[] args) {
        System.out.println("APLICATIE SPITAL - A.1 BUILDER \n");

        // Pacient 1 fara facilitati
        Pacient pacient1 = Pacient.builder()
                .setNume("Popescu Ion")
                .setNrTelefon("0721123456")
                .setAdresa("Str. Victoriei nr. 10, Bucuresti")
                .build();

        System.out.println("PACIENT 1");
        System.out.println(pacient1);
        System.out.println();

        // Pacient 2 (unele facilități)
        Pacient pacient2 = Pacient.builder()
                .setNume("Ionescu Maria")
                .setNrTelefon("0733987654")
                .setAdresa("Bd. Unirii nr. 25, Bucuresti")
                .setPatRabatabil(true)
                .setMicDejunInclus(true)
                .build();

        System.out.println("PACIENT 2 - unele facilitati");
        System.out.println(pacient2);
        System.out.println();

        // Pacient 3 cu toate facilitatile
        Pacient pacient3 = Pacient.builder()
                .setNume("Vasilescu George")
                .setNrTelefon("0745321098")
                .setAdresa("Str. Aviatorilor nr. 5, Bucuresti")
                .setPatRabatabil(true)
                .setMicDejunInclus(true)
                .setPapuciCamera(true)
                .setHalatInterior(true)
                .build();

        System.out.println("PACIENT 3 cu toate facilitatile");
        System.out.println(pacient3);
    }
}