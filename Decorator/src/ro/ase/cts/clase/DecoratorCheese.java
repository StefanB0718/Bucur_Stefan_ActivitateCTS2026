package ro.ase.cts.clase;

public class DecoratorCheese extends ADecoratorPizza{
    public DecoratorCheese(APizza pizza) {
        super(pizza);
    }

    @Override
    public String getComponente() {
        return super.getComponente() + " margine umpluta cu branza";
    }

    @Override
    public int getPret() {
        return super.getPret() + 10;
    }
}
