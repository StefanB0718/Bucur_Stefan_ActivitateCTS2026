package ro.ase.cts.Program;

import ro.ase.cts.clase.AutobuzFlota;
import ro.ase.cts.clase.GrupAutobuze;
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
        PanouControlUsi panou = new PanouControlUsi();

        panou.butonModLiber();

        System.out.println();

        panou.butonDeschdiereFortata();

        GrupAutobuze flotaSTB = new GrupAutobuze("Flota STB");

        GrupAutobuze grupMici = new GrupAutobuze("Grupuri mici (10 locuri)");
        grupMici.adaugaElement(new AutobuzFlota("Mercedes", "Sprinter", 10));
        grupMici.adaugaElement(new AutobuzFlota("Ford", "Transit", 10));

        GrupAutobuze grupMedii = new GrupAutobuze("Grupuri medii (30 locuri)");
        grupMedii.adaugaElement(new AutobuzFlota("Isuzu", "Citibus", 30));

        GrupAutobuze grupMari = new GrupAutobuze("Grupuri mari (50 locuri)");
        grupMari.adaugaElement(new AutobuzFlota("MAN", " City", 50));
        grupMari.adaugaElement(new AutobuzFlota("Mercedes", "Citaro", 50));

        flotaSTB.adaugaElement(grupMici);
        flotaSTB.adaugaElement(grupMedii);
        flotaSTB.adaugaElement(grupMari);
        System.out.println(flotaSTB.getDescriere());

        IBilet biletNormal = new BiletStandard("001 STB", 3);
        biletNormal.printeaza();

        System.out.println();

        IBilet biletDeSarbatoare = new BiletMesajLaMultiAni(
                new BiletStandard("002 STB", 3));
        biletDeSarbatoare.printeaza();


    }
}
