package ro.ase.cts.program;

import ro.ase.cts.clase.Bon;
import ro.ase.cts.clase.MesajPrintareFactory;

public class Program {
    public static void main(String[] args) {
        Bon bon1 = new Bon(1, 100);
        Bon bon2 = new Bon(2, 200);
        Bon bon3 = new Bon(2, 250);
        Bon bon4 = new Bon(4, 230);
        MesajPrintareFactory.getMesaj("TIP1").printareBon(bon1);
        MesajPrintareFactory.getMesaj("TIP2").printareBon(bon2);
        MesajPrintareFactory.getMesaj("TIP1").printareBon(bon3);
        MesajPrintareFactory.getMesaj("TIP1").printareBon(bon4);
    }
}
