package ro.ase.cts.Program;


import ro.ase.cts.clase.*;

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

            ITransportSuprafata transportSuprafata = new ValidatorSuprafata();
                transportSuprafata.validareBilet("BILET-123");
                transportSuprafata.validareAbonament("ABO-456");

            System.out.println();
            ITransportSuprafata validatorMetrou = new AdapterMetrou(new SistemMetrou());
            validatorMetrou.validareBilet("BILET-123");
            validatorMetrou.validareAbonament("ABO-456");



            System.out.println("a1 == a2: " + (a1 == a2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
