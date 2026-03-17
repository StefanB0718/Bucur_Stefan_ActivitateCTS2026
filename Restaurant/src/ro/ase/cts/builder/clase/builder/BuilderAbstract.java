package ro.ase.cts.builder.clase.builder;

import ro.ase.cts.builder.clase.Rezervare;

public interface BuilderAbstract {
    Rezervare build ();

    BuilderAbstract setGenMuzical(String genMuzical);
    BuilderAbstract setNrPersoane(int nrPersoane);
    BuilderAbstract setCuloareFataMasa(String culoareFataMasa);
    BuilderAbstract setLaGeam(boolean laGeam);
    BuilderAbstract scaunErgonomic(boolean scaunErgonomic);

}
