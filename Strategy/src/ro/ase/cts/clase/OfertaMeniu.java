package ro.ase.cts.clase;

public class OfertaMeniu {
    private String denumireMeniu;
    private int nrCalorii;
    private int nrCarbohodrati;

    public OfertaMeniu(String denumireMeniu, int nrCalorii, int nrCarbohodrati) {
        this.denumireMeniu = denumireMeniu;
        this.nrCalorii = nrCalorii;
        this.nrCarbohodrati = nrCarbohodrati;
    }
    public String getDenumireMeniu() {
        return denumireMeniu;
    }
    public int getNrCalorii() {
        return nrCalorii;
    }
    public int getNrCarbohodrati() {
        return nrCarbohodrati;
    }

    @Override
    public String toString() {
        return  "OfertaMeniu" + denumireMeniu + ", nrCalorii="
                + nrCalorii + ", nrCarbohidrati=" + nrCarbohodrati + "]";
    }
}
