package ro.ase.cts.clase;

public class PanouControlUsi {
    private Usa usaFata;
    private Usa usaMijloc;
    private Usa usaSpate;

    public PanouControlUsi() {
        this.usaFata = new Usa("fata");
        this.usaMijloc = new Usa("mijloc");
        this.usaSpate = new Usa("spate");
    }

    public void butonModLiber() {
        System.out.println(" Buton mod liber toate usile ");
        usaFata.modLiber();
        usaMijloc.modLiber();
        usaSpate.modLiber();
    }


    public void butonDeschdiereFortata() {
        System.out.println("Buton deschidere fortata toate usile ");
        usaFata.deschidereFortata();
        usaMijloc.deschidereFortata();
        usaSpate.deschidereFortata();
    }
}