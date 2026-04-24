package ro.ase.cts.clase;

public class AdapterMetrou implements ITransportSuprafata{
    private SistemMetrou sistemMetrou;

    public AdapterMetrou(SistemMetrou sistemMetrou) {
        this.sistemMetrou = sistemMetrou;
    }

    @Override
    public void validareBilet(String codBilet) {
        // traducem apelul terestru -> apel metrou
        sistemMetrou.verificareAccesCalator(codBilet, "bilet");
    }

    @Override
    public void validareAbonament(String codAbonament) {
        sistemMetrou.verificareAccesCalator(codAbonament, "abonament");
    }
}
