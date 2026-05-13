package ro.ase.cts.clase;

public class MesajPrintare implements IPrintare{
    private String tipPrintare;
    private String mesaj;

    public MesajPrintare(String tipPrintare) {
        this.tipPrintare = tipPrintare;
        this.mesaj = "mesaj" + tipPrintare;
    }

    @Override
    public void printareBon(Bon bon) {
        System.out.println("s-a printat bonul cu totalul " + bon.getCostTotal() + "folosind mesajul" + mesaj);
    }
}
