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

        public void setNume(String nume) {
            this.nume = nume;
        }

        public void setNrTelefon(String nrTelefon) {
            this.nrTelefon = nrTelefon;
        }

        public void setAdresa(String adresa) {
            this.adresa = adresa;
        }

        public void setPatRabatabil(boolean patRabatabil) {
            this.patRabatabil = patRabatabil;
        }

        public void setMicDejunInclus(boolean micDejunInclus) {
            this.micDejunInclus = micDejunInclus;
        }

        public void setHalatInterior(boolean halatInterior) {
            this.halatInterior = halatInterior;
        }

        public void setPapuciCamera(boolean papuciCamera) {
            this.papuciCamera = papuciCamera;
        }

        @Override
        public Pacient build() {
            return new Pacient(this);
        }
    }

}