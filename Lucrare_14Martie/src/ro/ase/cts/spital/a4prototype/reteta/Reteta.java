package ro.ase.cts.spital.a4prototype.reteta;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements Cloneable {
    private String denumire;
    private int cantitate;
    private List<String> ingrediente;

    public Reteta(String denumire, int cantitate) {
        this.denumire = denumire;
        this.cantitate = cantitate;
        this.ingrediente = new ArrayList<>();
    }

    public String getDenumire() {
        return denumire;
    }

    public int getCantitate() {
        return cantitate;
    }

    public List<String> getIngrediente() {
        return ingrediente;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }
     public void adaugaIngredient(String ingredient) {
        this.ingrediente.add(ingredient);
     }

    @Override
    public Reteta clone() throws CloneNotSupportedException {
        Reteta clona = (Reteta) super.clone();
        clona.ingrediente = new ArrayList<>(this.ingrediente);
        return clona;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reteta: ").append(denumire).append("\n");
        sb.append("Cantitate: ").append(cantitate).append(" ml\n");
        sb.append("Ingrediente: ");
        for (int i = 0; i < ingrediente.size(); i++) {
            sb.append(ingrediente.get(i));
            if (i < ingrediente.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}