package ro.ase.cts.clase;
import java.util.HashMap;
import  java.util.Map;

public class MesajPrintareFactory {
    public static Map<String, MesajPrintare> colectieMesaje = new HashMap<>();

    static {
        colectieMesaje.put("TIP1", new MesajPrintare("TIP1"));
        colectieMesaje.put("TIP2", new MesajPrintare("TIP2"));
        colectieMesaje.put("TIP3", new MesajPrintare("TIP3"));
    }
    public static MesajPrintare getMesaj(String tipMesaj) {
        MesajPrintare mesaj = colectieMesaje.get(tipMesaj);
        if (mesaj == null) {
            mesaj = new MesajPrintare(tipMesaj);
            colectieMesaje.put(tipMesaj, mesaj);
        }
        return mesaj;
    }
}
