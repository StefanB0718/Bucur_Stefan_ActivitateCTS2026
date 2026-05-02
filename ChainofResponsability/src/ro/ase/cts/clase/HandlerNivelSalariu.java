package ro.ase.cts.clase;

public class HandlerNivelSalariu extends AHandler implements IHandler{
    @Override
    public boolean procesareCerere(Persoana p, float credit, int nrLuni) {
        if (p.getSalariu() * 0.4 < credit/nrLuni) {
            System.out.println(p.getNume() + "salariul este prea mic");
            return false;
        }
        if (this.getNextHandler() != null) {
            return this.getNextHandler().procesareCerere(p, credit, nrLuni);
        }
        return true;
    }
}
