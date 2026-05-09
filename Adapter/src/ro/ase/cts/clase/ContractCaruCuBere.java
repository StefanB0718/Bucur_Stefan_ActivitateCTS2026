package ro.ase.cts.clase;

public class ContractCaruCuBere {
    private String numeClient;
    private double valoareEvenimenteCaruCuBere;

    public ContractCaruCuBere(String numeClient, double valoareEvenimenteCaruCuBere) {
        this.numeClient = numeClient;
        this.valoareEvenimenteCaruCuBere = valoareEvenimenteCaruCuBere;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public double getValoareEvenimenteCaruCuBere() {
        return valoareEvenimenteCaruCuBere;
    }

    public double calculeazaReducereCaruCuBere() {
        if (valoareEvenimenteCaruCuBere > 8000) {
            return 0.08;
        }
        if (valoareEvenimenteCaruCuBere > 4000) {
            return 0.04;
        }
        return 0;
    }
}