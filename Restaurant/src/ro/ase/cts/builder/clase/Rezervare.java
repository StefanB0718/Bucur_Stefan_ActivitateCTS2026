package ro.ase.cts.builder.clase;

public class Rezervare {
    private boolean laGeam;
    private boolean scaunErgonomic;
    private String culoareFataMasa;
    private String genMuzical;
    private int nrPersoane;

    public Rezervare(boolean laGeam, boolean scaunErgonomic, String culoareFataMasa, String genMuzical, int nrPersoane) {
        this.laGeam = laGeam;
        this.scaunErgonomic = scaunErgonomic;
        this.culoareFataMasa = culoareFataMasa;
        this.genMuzical = genMuzical;
        this.nrPersoane = nrPersoane;
    }

    public Rezervare() {
        this.laGeam = false;
        this.scaunErgonomic = false;
        this.culoareFataMasa = "alb";
        this.genMuzical = "jazz";
        this.nrPersoane = 2;
    }

    public void setLaGeam(boolean laGeam) {
        this.laGeam = laGeam;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public void setCuloareFataMasa(String culoareFataMasa) {
        this.culoareFataMasa = culoareFataMasa;
    }

    public void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "laGeam=" + laGeam +
                ", scaunErgonomic=" + scaunErgonomic +
                ", culoareFataMasa='" + culoareFataMasa + '\'' +
                ", genMuzical='" + genMuzical + '\'' +
                ", nrPersoane=" + nrPersoane +
                '}';
    }

}
