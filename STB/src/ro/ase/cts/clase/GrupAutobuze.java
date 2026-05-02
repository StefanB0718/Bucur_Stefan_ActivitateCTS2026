package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class GrupAutobuze extends AElementFlota {
    private String numeGrup;
    private List<AElementFlota> elemente;

    public GrupAutobuze(String numeGrup) {
        this.numeGrup = numeGrup;
        this.elemente = new ArrayList<>();
    }

    @Override
    public String getDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Grup: ").append(numeGrup).append("\n");
        for (AElementFlota element : elemente) {
            sb.append(element.getDescriere()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public void adaugaElement(AElementFlota element) {
        elemente.add(element);
    }

    @Override
    public void eliminaElement(AElementFlota element) {
        elemente.remove(element);
    }

    @Override
    public AElementFlota getElement(int index) {
        return elemente.get(index);
    }
}