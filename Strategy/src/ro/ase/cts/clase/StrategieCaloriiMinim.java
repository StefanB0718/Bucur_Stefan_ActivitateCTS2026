package ro.ase.cts.clase;
import java.util.List;

public class StrategieCaloriiMinim implements IAlegeMeniu {
    @Override
    public OfertaMeniu alegereMeniu(List<OfertaMeniu> listaMeniuri) {
        OfertaMeniu ofertaMeniuCaloriiMinime = listaMeniuri.get(0);
        for (OfertaMeniu oferta : listaMeniuri) {
            if (oferta.getNrCalorii() < ofertaMeniuCaloriiMinime.getNrCalorii())
                ofertaMeniuCaloriiMinime = oferta;
        }
        return ofertaMeniuCaloriiMinime;
    }
}
