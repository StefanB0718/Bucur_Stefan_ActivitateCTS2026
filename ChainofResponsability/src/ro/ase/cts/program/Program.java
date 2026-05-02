package ro.ase.cts.program;

import ro.ase.cts.clase.*;

public class Program {
    public static void main(String[] args) {

        Persoana p1 = new Persoana("Gigel", 8000, 2, 40);
        Persoana p2 = new Persoana("Costel", 8000, 2, 40);
        Persoana p3 = new Persoana("Adi", 8000, 2, 8);
        Persoana p4 = new Persoana("Maria", 400, 2, 20);

        // creare lant responsabil creditare
        IHandler handler1 = new HandlerAnaf();
        handler1.setNextHandler(new HandlerVechime());
        handler1.getNextHandler().setNextHandler(new HandlerNivelSalariu());

        System.out.println(handler1.procesareCerere(p1, 20, 14));
        System.out.println(handler1.procesareCerere(p2, 20, 14));
        System.out.println(handler1.procesareCerere(p3, 20, 14));
        System.out.println(handler1.procesareCerere(p4, 20000, 14));
    }
}
