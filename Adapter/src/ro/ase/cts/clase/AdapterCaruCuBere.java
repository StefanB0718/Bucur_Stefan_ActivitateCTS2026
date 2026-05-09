package ro.ase.cts.clase;

public class AdapterCaruCuBere implements IDiscountBerariaH {
    private ContractCaruCuBere contractCaruCuBere;

    public AdapterCaruCuBere(ContractCaruCuBere contractCaruCuBere) {
        this.contractCaruCuBere = contractCaruCuBere;
    }

    @Override
    public double calculeazaDiscountBerariaH() {
        return contractCaruCuBere.calculeazaReducereCaruCuBere();
    }
}