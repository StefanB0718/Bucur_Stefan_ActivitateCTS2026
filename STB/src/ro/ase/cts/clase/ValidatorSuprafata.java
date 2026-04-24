package ro.ase.cts.clase;

public class ValidatorSuprafata implements ITransportSuprafata{
    @Override
    public void validareBilet(String codBilet) {
        System.out.println("Transport terestru: biletul " + codBilet + " a fost validat.");
    }

    @Override
    public void validareAbonament(String codAbonament) {
        System.out.println("Transport terestru: abonamentul " + codAbonament + " a fost validat.");
    }

}
