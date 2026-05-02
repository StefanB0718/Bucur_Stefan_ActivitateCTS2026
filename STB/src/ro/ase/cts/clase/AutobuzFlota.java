package ro.ase.cts.clase;

public class AutobuzFlota extends AElementFlota {
    private String producator;
    private String model;
    private int numarLocuri;

    public AutobuzFlota(String producator, String model, int numarLocuri) {
        this.producator = producator;
        this.model = model;
        this.numarLocuri = numarLocuri;
    }

    @Override
    public String getDescriere() {
        return "  Autobuzul " + producator + " " + model + " (" + numarLocuri + " nr locuri)";
    }
}