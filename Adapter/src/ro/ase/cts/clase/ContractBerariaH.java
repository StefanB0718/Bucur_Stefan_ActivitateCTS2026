package ro.ase.cts.clase;

public class ContractBerariaH implements IDiscountBerariaH {
    private String numeClient;
    private double costTotalEvenimente;

    public ContractBerariaH(String numeClient, double costTotalEvenimente) {
        this.numeClient = numeClient;
        this.costTotalEvenimente = costTotalEvenimente;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public double getCostTotalEvenimente() {
        return costTotalEvenimente;
    }

    @Override
    public double calculeazaDiscountBerariaH() {
        if (costTotalEvenimente > 10000) {
            return 0.1;
        }
        if (costTotalEvenimente > 5000) {
            return 0.05;
        }
        return 0;
    }
}