package ro.ase.cts.clase;

public class Troleibuz implements InterfataMijlocTransport{
    @Override
    public void descriere() {
        System.out.println("Mijloc de transport: Troileibuz");
    }

    @Override
    public Troleibuz clone() throws CloneNotSupportedException {
        return (Troleibuz) super.clone();
    }
}
