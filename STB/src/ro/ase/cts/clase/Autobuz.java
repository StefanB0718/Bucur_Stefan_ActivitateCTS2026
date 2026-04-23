package ro.ase.cts.clase;

public class Autobuz implements InterfataMijlocTransport{
    @Override
    public void descriere() {
        System.out.println("Mijloc de transport: Autobuz");
    }

    @Override
    public Autobuz clone () throws CloneNotSupportedException {
        return (Autobuz) super.clone();
    }
}
