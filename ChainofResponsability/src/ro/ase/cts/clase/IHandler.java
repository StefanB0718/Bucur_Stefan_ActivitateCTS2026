package ro.ase.cts.clase;

public interface IHandler {
    boolean procesareCerere(Persoana p, float credit, int nrLuni);

    IHandler getNextHandler();
    void setNextHandler(IHandler nextHandler);
}
