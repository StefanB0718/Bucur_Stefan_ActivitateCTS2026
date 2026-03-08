package ro.ase.cts.spital.a01builder.pacient;
import ro.ase.cts.spital.a01builder.builder.Builder;

public class Pacient {
    private String nume;
    private String nrTelefon;
    private String adresa;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halatInterior;

    private Pacient(PacientBuilder builder) {
        this.nume = builder.nume;
        this.nrTelefon = builder.nrTelefon;
        this.adresa = builder.adresa;
        this.patRabatabil = builder.patRabatabil;
        this.micDejunInclus = builder.micDejunInclus;
        this.papuciCamera = builder.papuciCamera;
        this.halatInterior = builder.halatInterior;
    }

    public String getNume() {
        return nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public boolean isPatRabatabil() {
        return patRabatabil;
    }

    public boolean isMicDejunInclus() {
        return micDejunInclus;
    }

    public boolean isPapuciCamera() {
        return papuciCamera;
    }

    public boolean isHalatInterior() {
        return halatInterior;
    }

    public static PacientBuilder builder() {
        return new PacientBuilder();
    }

    public static class PacientBuilder implements Builder {
        private String nume;
        private String nrTelefon;
        private String adresa;
        private boolean patRabatabil;
        private boolean micDejunInclus;
        private boolean papuciCamera;
        private boolean halatInterior;

        public PacientBuilder() {
            this.patRabatabil = false;
            this.micDejunInclus = false;
            this.papuciCamera = false;
            this.halatInterior = false;
        }

        public PacientBuilder setNume(String nume) {
            this.nume = nume;
            return this;
        }

        public PacientBuilder setNrTelefon(String nrTelefon) {
            this.nrTelefon = nrTelefon;
            return this;
        }

        public PacientBuilder setAdresa(String adresa) {
            this.adresa = adresa;
            return this;
        }

        public PacientBuilder setPatRabatabil(boolean patRabatabil) {
            this.patRabatabil = patRabatabil;
            return this;
        }

        public PacientBuilder setMicDejunInclus(boolean micDejunInclus) {
            this.micDejunInclus = micDejunInclus;
            return this;
        }

        public PacientBuilder setHalatInterior(boolean halatInterior) {
            this.halatInterior = halatInterior;
            return this;
        }

        public PacientBuilder setPapuciCamera(boolean papuciCamera) {
            this.papuciCamera = papuciCamera;
            return this;
        }

        @Override
        public Pacient build() {
            return new Pacient(this);
        }
    }

}