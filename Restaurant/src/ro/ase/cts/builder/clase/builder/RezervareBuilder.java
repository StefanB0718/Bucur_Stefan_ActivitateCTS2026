package ro.ase.cts.builder.clase.builder;
import ro.ase.cts.builder.clase.Rezervare;

public class RezervareBuilder implements BuilderAbstract{
    //versiunea 1 cu instanta
    private Rezervare rezervare=null;
    public RezervareBuilder () {
        rezervare = new Rezervare();
    }
    public BuilderAbstract setGenMuzical(String genMuzical) {
        rezervare.setGenMuzical(genMuzical);
        return this;
    }
    public BuilderAbstract setNrPersoane(int nrPersoane) {
        rezervare.setNrPersoane(nrPersoane);
        return this;
    }
    public BuilderAbstract setCuloareFataMasa(String culoareFataMasa) {
        rezervare.setCuloareFataMasa(culoareFataMasa);
        return this;
    }
    public BuilderAbstract setScaunErgonomic(boolean ScaunErgonomic) {
        rezervare.setScaunErgonomic(ScaunErgonomic);
        return this;
    }
    public BuilderAbstract setLaGeam(boolean laGeam) {
        rezervare.setLaGeam(laGeam);
        return this;
    }

    @Override
    public BuilderAbstract scaunErgonomic(boolean scaunErgonomic) {
        return null;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}

