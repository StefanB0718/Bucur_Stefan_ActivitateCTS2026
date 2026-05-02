package ro.ase.cts.clase;

public abstract class ABiletAniversar implements IBilet {
    protected IBilet bilet;

    public ABiletAniversar(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeaza() {
        bilet.printeaza();
    }
}