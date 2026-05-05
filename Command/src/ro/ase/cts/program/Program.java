package ro.ase.cts.program;
import ro.ase.cts.clase.*;

public class Program {
    public static void main(String[] args) {

        Bucatar bucatar = new Bucatar("Radu");
        IComanda c1 = new ComandaPaste(" carbonara", bucatar);
        IComanda c2 = new ComandaPizza(" diavola", "subtire", bucatar);
        Ospatar ospatar = new Ospatar();
        ospatar.preiaComanda(c1);
        ospatar.preiaComanda(c2);
        ospatar.transmiteComenzile();
    }
}
