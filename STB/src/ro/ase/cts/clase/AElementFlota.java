package ro.ase.cts.clase;

public abstract class AElementFlota {

    public abstract String getDescriere();

    public void adaugaElement(AElementFlota element) {
        throw new UnsupportedOperationException();
    }

    public void eliminaElement(AElementFlota element) {
        throw new UnsupportedOperationException();
    }

    public AElementFlota getElement(int index) {
        throw new UnsupportedOperationException();
    }
}