package ro.ase.cts.clase.program;

import ro.ase.cts.clase.Bucatar;
import ro.ase.cts.clase.GestiuneBucatari;
import ro.ase.cts.clase.GestiuneSali;
import ro.ase.cts.clase.Sala;

public class Program {
    private static GestiuneSali gestiuneSali;
    private static GestiuneBucatari gestiuneBucatari;

    static {
        gestiuneSali = new GestiuneSali();
        gestiuneBucatari = new GestiuneBucatari();

        gestiuneSali.addSala(new Sala("sala A", 20, 50));
        gestiuneSali.addSala(new Sala("sala B", 10, 30));

        gestiuneBucatari.addBucatar(new Bucatar("Gigel"));
        gestiuneBucatari.addBucatar(new Bucatar("Ion"));
        gestiuneBucatari.addBucatar(new Bucatar("Maria"));
    }

    public static boolean verificaDisponibilitateBucatari(int nrBucatariNecesari, String data) {
        System.out.println("verficare disponiblitate " + nrBucatariNecesari + " bucatari pentru " + data);
        int ct = 0;
        for (int i = 0; i < gestiuneBucatari.getNrBucatari(); i++) {
            if (gestiuneBucatari.getBucatar(i).verificaDisponibilitatea(data))
                ct++;
        }
        boolean rezultat = ct >= nrBucatariNecesari;
        System.out.println("rezultat: " + rezultat);
        return rezultat;
    }

    public static boolean verificaDisponibilitateSala(int nrParticipanti, String data) {
        System.out.println("verifcare disponiilitate sala pentru " + nrParticipanti + " particianti");
        for (Sala s : gestiuneSali.getListaSali()) {
            if (s.getNrMinParticipanti() <= nrParticipanti && nrParticipanti <= s.getNrMaxParticipanti()) {
                System.out.println("sala " + s.getDenumire() + " dispoibila");
                return true;
            }
        }
        System.out.println("nicio sala dispoibila");
        return false;
    }

    public static boolean rezervaraPetrecere(int nrParticipanti, int nrBucatariNecesari, String data) {
        System.out.println("\n REZERVARE PETRECERE");
        boolean salaDiponibila = verificaDisponibilitateSala(nrParticipanti, data);
        boolean bucatariDisponibili = verificaDisponibilitateBucatari(nrBucatariNecesari, data);

        boolean rezultat = salaDiponibila && bucatariDisponibili;
        System.out.println("Petrecere aprobata: " + rezultat);
        System.out.println("SFARSIT PETRECERE\n");
        return rezultat;
    }
    public static void main(String[] args) {
        rezervaraPetrecere(30, 2, "15/12/2024");
        rezervaraPetrecere(15, 5, "20/12/2024");
    }
}