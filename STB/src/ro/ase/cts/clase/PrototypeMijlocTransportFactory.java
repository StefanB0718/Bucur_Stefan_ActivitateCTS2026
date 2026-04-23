package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class PrototypeMijlocTransportFactory {

    private static Map<EnumTipMijlocTransport, InterfataMijlocTransport> prototipuri;

    static {
        prototipuri = new HashMap<>();
        prototipuri.put(EnumTipMijlocTransport.AUTOBUZ, new Autobuz());
        prototipuri.put(EnumTipMijlocTransport.TRAMVAI, new Tramvai());
        prototipuri.put(EnumTipMijlocTransport.TROLEIBUZ, new Troleibuz());
    }

    public static InterfataMijlocTransport getPrototip(EnumTipMijlocTransport tip)
            throws CloneNotSupportedException {
        InterfataMijlocTransport prototip = prototipuri.get(tip);
        if (prototip != null) {
            return prototip.clone();
        }
        return null;
    }
}