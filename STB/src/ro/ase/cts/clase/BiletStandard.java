package ro.ase.cts.clase;

public class BiletStandard implements IBilet {
    private String codBilet;
    private double pret;

    public BiletStandard(String codBilet, double pret) {
        this.codBilet = codBilet;
        this.pret = pret;
    }

    @Override
    public void printeaza() {
        System.out.println("bilet STB");
        System.out.println("cod bilet" + codBilet);
        System.out.println("pret " + pret + " lei");
    }
}