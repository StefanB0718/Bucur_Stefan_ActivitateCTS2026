package ro.ase.cts.clase;

public class AutobuzLinie {
    private final String modelAutobuz;
    private final String sofer;
    private final boolean opririCapatLinie;
    private final boolean deschideUsiAutomat;
    private final String textEcran;
    private final int numarLinie;


    public String getModelAutobuz() {
        return modelAutobuz;
    }

    public String getSofer () {
        return sofer;
    }

    public boolean isOpririCapatLinie () {
        return opririCapatLinie;
    }

    public boolean isDeschideUsiAutomat() {
        return deschideUsiAutomat;
    }

    public String getTextEcran() {
        return textEcran;
    }

    public int getNumarLinie() {
        return numarLinie;
    }

    @Override
    public String toString() {
        return "AutobuzLinie model=" + modelAutobuz + ", sofer=" + sofer
                + ", opririCapatLinie=" + opririCapatLinie
                + ", deschideUsiAutomat=" + deschideUsiAutomat
                + ", textEcran=" + textEcran
                + ", numarLinie=" + numarLinie ;
    }

    public static AutobuzLinieBuilder builder(String modelAutobuz, String sofer, int numarLinie) {
        return new AutobuzLinieBuilder(modelAutobuz, sofer, numarLinie);
    }

    public static class AutobuzLinieBuilder implements IBuilder {
        private String modelAutobuz;
        private String sofer;
        private int numarLinie;
        private boolean opririCapatLinie = true;
        private boolean deschideUsiAutomat = false;
        private String textEcran = "STB - Societatea de Transport Bucuresti";

        public AutobuzLinieBuilder(String modelAutobuz, String sofer, int numarLinie) {
            this.modelAutobuz = modelAutobuz;
            this.sofer = sofer;
            this.numarLinie = numarLinie;
    }
        public AutobuzLinieBuilder setOpririCapatLinie(boolean opririCapatLinie) {
            this.opririCapatLinie = opririCapatLinie;
            return this;
        }

        public AutobuzLinieBuilder setDeschideUsiAutomat(boolean deschideUsiAutomat) {
            this.deschideUsiAutomat = deschideUsiAutomat;
            return this;
        }

        public AutobuzLinieBuilder setTextEcran(String textEcran) {
            this.textEcran = textEcran;
            return this;
        }

        @Override
        public AutobuzLinie build() {
            return new AutobuzLinie(this);
        }
    }

    private AutobuzLinie(AutobuzLinieBuilder builder) {
        this.modelAutobuz = builder.modelAutobuz;
        this.sofer = builder.sofer;
        this.numarLinie = builder.numarLinie;
        this.opririCapatLinie = builder.opririCapatLinie;
        this.deschideUsiAutomat = builder.deschideUsiAutomat;
        this.textEcran = builder.textEcran;
    }
}
