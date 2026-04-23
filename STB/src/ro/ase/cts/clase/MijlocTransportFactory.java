package ro.ase.cts.clase;

import static ro.ase.cts.clase.EnumTipMijlocTransport.*;

public class MijlocTransportFactory {

    public InterfataMijlocTransport creare(EnumTipMijlocTransport tip) throws Exception {
        switch (tip) {
            case AUTOBUZ:
                return new Autobuz();
            case TRAMVAI:
                return new Tramvai();
            case TROLEIBUZ:
                return new Troleibuz();
            default:
                throw new Exception("Tip mijloc transport invalid!");
        }
    }
}
