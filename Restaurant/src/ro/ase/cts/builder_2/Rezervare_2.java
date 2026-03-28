package ro.ase.cts.builder_2;

public class Rezervare_2 {
    private boolean laGeam;
    private boolean scaunErgonomic;
    private String culoareFataMasa;
    private String genMuzical;
    private int nrPersoane;

    public static class Builder implements BuilderAbstract {
        private boolean laGeam;
        private boolean scaunErgonomic;
        private String culoareFataMasa;
        private String genMuzical;
        private int nrPersoane;

        @Override
        public Rezervare_2 build() {
            return new Rezervare_2(laGeam, scaunErgonomic, culoareFataMasa, genMuzical, nrPersoane);
        }

        @Override
        public BuilderAbstract setGenMuzical(String genMuzical) {
           this.genMuzical = genMuzical;
            return this;
        }

        @Override
        public BuilderAbstract setNrPersoane(int nrPersoane) {
            this.nrPersoane = nrPersoane;
            return this;
        }

        @Override
        public BuilderAbstract setCuloareFataMasa(String culoareFataMasa) {
            this.culoareFataMasa = culoareFataMasa;
            return this;
        }

        @Override
        public BuilderAbstract setLaGeam(boolean laGeam) {
            this.laGeam = laGeam;
            return this;
        }

        @Override
        public BuilderAbstract scaunErgonomic(boolean scaunErgonomic) {
            this.scaunErgonomic = scaunErgonomic;
            return this;
        }
    }
    private Rezervare_2(boolean laGeam, boolean scaunErgonomic, String culoareFataMasa, String genMuzical, int nrPersoane) {
        this.laGeam = laGeam;
        this.scaunErgonomic = scaunErgonomic;
        this.culoareFataMasa = culoareFataMasa;
        this.genMuzical = genMuzical;
        this.nrPersoane = nrPersoane;
    }

    private Rezervare_2() {
        this.laGeam = false;
        this.scaunErgonomic = false;
        this.culoareFataMasa = "alb";
        this.genMuzical = "jazz";
        this.nrPersoane = 2;
    }

    private void setLaGeam(boolean laGeam) {
        this.laGeam = laGeam;
    }

    private void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    private void setCuloareFataMasa(String culoareFataMasa) {
        this.culoareFataMasa = culoareFataMasa;
    }

    private void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    private void setNrPersoane(int nrPersoane) {
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
