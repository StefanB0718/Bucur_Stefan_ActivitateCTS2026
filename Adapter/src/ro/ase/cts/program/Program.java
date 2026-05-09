package ro.ase.cts.program;

import ro.ase.cts.clase.AdapterCaruCuBere;
import ro.ase.cts.clase.ContractBerariaH;
import ro.ase.cts.clase.ContractCaruCuBere;
import ro.ase.cts.clase.IDiscountBerariaH;
import ro.ase.cts.clase.ProcesatorContracteBerariaH;

public class Program {
    public static void main(String[] args) {
        ProcesatorContracteBerariaH procesator = new ProcesatorContracteBerariaH();

        IDiscountBerariaH contractBerariaH = new ContractBerariaH("Ion", 12000);
        procesator.afiseazaDiscount(contractBerariaH);

        ContractCaruCuBere contractCaruCuBere = new ContractCaruCuBere("Maria", 9000);
        IDiscountBerariaH adapterCaruCuBere = new AdapterCaruCuBere(contractCaruCuBere);
        procesator.afiseazaDiscount(adapterCaruCuBere);
    }
}