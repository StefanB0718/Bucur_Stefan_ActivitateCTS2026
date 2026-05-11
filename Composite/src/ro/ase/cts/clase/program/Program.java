package ro.ase.cts.clase.program;

import ro.ase.cts.clase.ANod;
import ro.ase.cts.clase.Meniu;
import ro.ase.cts.clase.Produs;
import ro.ase.cts.clase.Structura;

public class Program {
    public static void main(String[] args) {
        ANod structuraMeniu = new Structura("meniu restaurant");
        Meniu meniu = new Meniu(structuraMeniu, "pizzeria ASE");
        ANod structuraBauturi = new Structura("bauturi");
        ANod structuraMancare = new Structura("mancare");
        structuraMeniu.adaugaNod(structuraBauturi);
        structuraMeniu.adaugaNod(structuraMancare);

        structuraBauturi.adaugaNod(new Produs("CocaCola", 10));
        structuraBauturi.adaugaNod(new Produs("Pepsi", 9));

        ANod structuraMancarePizza = new Structura("Pizza");
        ANod structuraMancarePaste = new Structura("Paste");
        structuraMancare.adaugaNod(structuraMancarePizza);
        structuraMancare.adaugaNod(structuraMancarePaste);

        structuraMancarePizza.adaugaNod(new Produs("Pizza Margherita", 25));
        structuraMancarePizza.adaugaNod(new Produs("Pizza Capriciosa", 29));

        structuraMancarePaste.adaugaNod(new Produs("Paste carbonara", 27));
        structuraMancarePaste.adaugaNod(new Produs("Paste branza", 32));

        System.out.println(meniu.getNumeRestaurant());
        System.out.println(structuraMeniu.getInfo());
    }
}
