package ro.ase.cts.clase;

public class Sosuri  extends ADecoratorPizza{
    private int nivelIuteala;

    public  Sosuri(APizza pizza, int nivelIuteala) {
        super(pizza);
        this.nivelIuteala= nivelIuteala;
    }

    @Override
    public String getComponente() {
        return super.getComponente() + "sos iute" + this.nivelIuteala;
    }

    @Override
    public int getPret() {
        return super.getPret() + 7;
    }
}
