package ro.ase.cts.Program;


import ro.ase.cts.clase.EnumTipMijlocTransport;
import ro.ase.cts.clase.InterfataMijlocTransport;
import ro.ase.cts.clase.MijlocTransportFactory;

public class Program {
    public static void main(String[] args) {
        MijlocTransportFactory factory = new MijlocTransportFactory();
        try {
            InterfataMijlocTransport a1 = factory.creare(EnumTipMijlocTransport.AUTOBUZ);
            InterfataMijlocTransport a2 = factory.creare(EnumTipMijlocTransport.AUTOBUZ);
            InterfataMijlocTransport t1 = factory.creare(EnumTipMijlocTransport.TROLEIBUZ);

            a1.descriere();
            a2.descriere();
            t1.descriere();


            System.out.println("a1 == a2: " + (a1 == a2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
