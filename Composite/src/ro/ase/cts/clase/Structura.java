package ro.ase.cts.clase;
import java.util.ArrayList;
import java.util.List;

public class Structura extends ANod {
    private List<ANod> structura = new ArrayList<>();
    private String numeStructura;

    public Structura(String numeStructura) {
        this.numeStructura = numeStructura;
    }

    public List<ANod> getStructura() {
        return structura;
    }

    public void setStructura(List<ANod> structura) {
        this.structura = structura;
    }

    @Override
    public String getDenumire() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getPret() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getInfo() {
        String info = "";
        info += this.numeStructura + "\n";
        for (ANod n : structura) {
            info += " " + n.getInfo();
            info += "\n";
        }
        return info;
    }

    @Override
    public void adaugaNod(ANod elemStructura) {
        structura.add(elemStructura);
    }

    @Override
    public void eliminaNod(ANod elemStructura) {
        structura.remove(elemStructura);
    }

    @Override
    public ANod getNod(int i) {
        return structura.get(i);
    }
}