package ro.ase.cts.clase;

public class BiletMesajLaMultiAni extends ABiletAniversar {

    public BiletMesajLaMultiAni(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void printeaza() {
        super.printeaza();
        System.out.println(" La multi ani, Romania");
        System.out.println("Ziua Nationala");
    }
}