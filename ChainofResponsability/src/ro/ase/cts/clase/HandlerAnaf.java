package ro.ase.cts.clase;
import java.util.ArrayList;
import java.util.List;

public class HandlerAnaf extends AHandler implements IHandler{
    private static List<String> blacklist = new ArrayList<>();

    static {
        blacklist.add("Radu");
        blacklist.add("Vasile");
    }

    @Override
    public boolean procesareCerere(Persoana p, float credit, int nrLuni) {
        if (blacklist.contains(p.getNume())) {
            System.out.println(p.getNume()+ "este in lista neagra ANAF");
            return false;
        }
        if (this.getNextHandler() != null) {
            return this.getNextHandler().procesareCerere(p, credit, nrLuni);
        }
        return true;
    }
}
