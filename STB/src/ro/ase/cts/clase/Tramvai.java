package ro.ase.cts.clase;

public class Tramvai implements InterfataMijlocTransport {
    @Override
    public void descriere() {
        System.out.println("Mijloc de transport: Tramvai");
    }

    @Override
    public  Tramvai clone() throws CloneNotSupportedException {
        return (Tramvai) super.clone();
    }
}
