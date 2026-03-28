package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.Prototype;
import ro.ase.cts.prototype.Rezervare;

public class Program {
    public static void main(String[] args) {
        Prototype rezervare = new Rezervare ("Popescu", "0744656565", 3);
        Prototype rezervare2 = rezervare.copiaza();
        ((Rezervare)rezervare2).setNrPersoane(20);
        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());

    }
}
