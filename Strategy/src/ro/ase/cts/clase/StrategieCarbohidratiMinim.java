package ro.ase.cts.clase;

import java.util.List;

public class StrategieCarbohidratiMinim implements IAlegeMeniu{
    @Override
    public OfertaMeniu alegereMeniu(List<OfertaMeniu> listaMeniuri) {
        OfertaMeniu ofertaMeniuCarbohidratiMinim = listaMeniuri.get(0);
        for (OfertaMeniu oferta : listaMeniuri) {
            if (oferta.getNrCarbohodrati() < ofertaMeniuCarbohidratiMinim.getNrCarbohodrati())
                ofertaMeniuCarbohidratiMinim = oferta;
        }
        return ofertaMeniuCarbohidratiMinim;
    }
}
