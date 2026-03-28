package ro.ase.cts.prototype;

public class Rezervare implements Prototype{
   private String nume;
   private String nrTelefon;
   private int nrPersoane;

    public Rezervare(String nume, String nrTelefon, int nrPersoane) {
        if(nume.length()>3) {
            this.nume = nume;
        }
        else{
            this.nume="NaN";
        }
        if(nrTelefon.length()==10){
            this.nrTelefon = nrTelefon;
        }
        else{
            this.nrTelefon ="00000000000";
        }
        if(nrPersoane>0){
            this.nrPersoane = nrPersoane;
        }
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.nrPersoane = nrPersoane;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    private Rezervare(){
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "nume='" + nume + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", nrPersoane=" + nrPersoane +
                '}';
    }

    @Override
    public Prototype copiaza() {
        Rezervare rezervare = new Rezervare();
        rezervare.nume = this.nume;
        rezervare.nrTelefon = this.nrTelefon;
        rezervare.nrPersoane = this.nrPersoane;
        return rezervare;
    }
}
