package ro.ase.cts.clase;
import java.util.ArrayList;
import java.util.List;

public class MeniuRestaurant {
    private List<OfertaMeniu> listaMeniuri = new ArrayList<>();
    private IAlegeMeniu strategieAlegere;

    public void addOfertaMeniu(OfertaMeniu ofertaMeniu) {
        this.listaMeniuri.add(ofertaMeniu);
    }

    public void setStrategieAlegere(IAlegeMeniu strategieAlegere) {
        this.strategieAlegere = strategieAlegere;
    }

    public OfertaMeniu alegereOferta() {
        if (strategieAlegere != null) {
            return strategieAlegere.alegereMeniu(listaMeniuri);
        } else
            throw new UnsupportedOperationException();
    }
}
