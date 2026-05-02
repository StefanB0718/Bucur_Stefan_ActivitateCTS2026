package ro.ase.cts.clase;

public class Usa {
    private String pozitie;

    public Usa(String pozitie) {
        this.pozitie = pozitie;
    }

    public void modLiber() {
        System.out.println("Usa din " + pozitie + " este in modul liber.");
    }

    public void deschidereFortata() {
        System.out.println("Usa din " + pozitie + " a fost deschisa fortat.");
    }
}