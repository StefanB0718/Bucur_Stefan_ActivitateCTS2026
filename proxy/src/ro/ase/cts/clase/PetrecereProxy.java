package ro.ase.cts.clase;

public class PetrecereProxy implements IPetrecere{
    private IPetrecere petrecere;

    public PetrecereProxy(IPetrecere petrecere) {
        super();
        this.petrecere = petrecere;
    }

    @Override
    public void adaugaParticipat(Client cl) {
        if (cl.getVarsta() >= 18) {
            petrecere.adaugaParticipat(cl);
        } else {
            System.out.println("clientul " + cl.getNume()
                    + " nu are varsta minima de 18 ani");
        }
    }

    @Override
    public void afisareProgram() {
        this.petrecere.afisareProgram();

    }
}
