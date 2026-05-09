package ro.ase.cts.clase;

public class ProcesatorContracteBerariaH {
    public void afiseazaDiscount(IDiscountBerariaH contract) {
        double discount = contract.calculeazaDiscountBerariaH();
        System.out.println("Discount acordat in BerariaH: " + discount * 100 + "%");
    }
}