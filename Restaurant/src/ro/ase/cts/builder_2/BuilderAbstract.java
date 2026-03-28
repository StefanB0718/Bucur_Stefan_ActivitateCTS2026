package ro.ase.cts.builder_2;

import ro.ase.cts.builder.clase.Rezervare;

public interface BuilderAbstract {
    Rezervare_2 build ();

    BuilderAbstract setGenMuzical(String genMuzical);
    BuilderAbstract setNrPersoane(int nrPersoane);
    BuilderAbstract setCuloareFataMasa(String culoareFataMasa);
    BuilderAbstract setLaGeam(boolean laGeam);
    BuilderAbstract scaunErgonomic(boolean scaunErgonomic);

}
