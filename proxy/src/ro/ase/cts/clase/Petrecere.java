package ro.ase.cts.clase;
import java.util.ArrayList;
import java.util.List;

public class Petrecere implements IPetrecere{
    private String data;
    private List<String> listaInvitati;
    private List<String> listaParticipanti;

    public Petrecere(String data, List<String> listaInvitati) {
        super();
        this.data = data;
        this.listaInvitati = listaInvitati;
        listaParticipanti = new ArrayList<>();
    }

    @Override
    public void adaugaParticipat(Client cl) {
        System.out.println("clientul " + cl + " a fost adaugat la petrecere");

    }

    @Override
    public void afisareProgram() {
        System.out.println("program petrecere pe data: " + data);
        System.out.println("invitati: " + listaInvitati);

    }
}
