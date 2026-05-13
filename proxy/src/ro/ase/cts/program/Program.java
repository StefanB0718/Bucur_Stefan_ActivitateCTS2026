package ro.ase.cts.program;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.IPetrecere;
import ro.ase.cts.clase.Petrecere;
import ro.ase.cts.clase.PetrecereProxy;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<String> listaInvitati = new ArrayList<>();
        listaInvitati.add("Mos Craciun");
        listaInvitati.add("Renul Rudolf");

        // Fără Proxy - nu se face verificare de vârstă
        System.out.println("--- FARA PROXY ---");
        Client cl1 = new Client("Gigel", 20);
        Client cl2 = new Client("Costel", 12);
        IPetrecere petrecere = new Petrecere("24.12.2024", listaInvitati);
        petrecere.adaugaParticipat(cl1); // trece
        petrecere.adaugaParticipat(cl2); // trece (fără verificare!)

        // Cu Proxy - se face verificare de vârstă
        System.out.println("\n--- CU PROXY ---");
        Client cl3 = new Client("Marcel", 20);
        Client cl4 = new Client("Ionela", 12);
        IPetrecere petrecereProxy = new PetrecereProxy(petrecere);
        petrecereProxy.adaugaParticipat(cl3); // trece (20 >= 18)
        petrecereProxy.adaugaParticipat(cl4); // blocat! (12 < 18)
    }
}
