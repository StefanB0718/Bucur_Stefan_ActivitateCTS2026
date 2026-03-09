package ro.ase.cts.spital.a4prototype.program;

import ro.ase.cts.spital.a4prototype.reteta.Reteta;
public class Program {
    public static void main(String[] args) {
        System.out.println("APLICATIE SPITAL - A.4 PROTOTYPE\n");
        try {
            // reteta originala
            Reteta retetaOriginala = new Reteta("Antibiotic", 500);
            retetaOriginala.adaugaIngredient("amoxicilina");
            retetaOriginala.adaugaIngredient("penicilina");
            retetaOriginala.adaugaIngredient("zinat");

            System.out.println("RETETA ORIGINALA");
            System.out.println(retetaOriginala);
            System.out.println();

            // clonare reteta
            Reteta retetaClonata1 = retetaOriginala.clone();

            System.out.println("RETETA CLONATA 1");
            System.out.println(retetaClonata1);
            System.out.println();

            // clonare si modificare
            Reteta retetaClonata2 = retetaOriginala.clone();
            retetaClonata2.setCantitate(1000);

            System.out.println("rETETA CLONATA 2");
            System.out.println(retetaClonata2);
            System.out.println();

            // verificare
            System.out.println("rETETA ORIGINALA");
            System.out.println(retetaOriginala);
            System.out.println();

            // deep copy
            System.out.println("testare deep copy");
            retetaClonata2.adaugaIngredient("vitamina C 100mg");

            System.out.println("clona 2:");
            System.out.println(retetaClonata2);
            System.out.println();

            System.out.println("retata originala fara deep copy");
            System.out.println(retetaOriginala);

        } catch (CloneNotSupportedException e) {
            System.err.println("eroare la clonare: " + e.getMessage());
        }
    }
}
