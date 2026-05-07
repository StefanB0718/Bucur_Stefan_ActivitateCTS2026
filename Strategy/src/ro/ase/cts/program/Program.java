package ro.ase.cts.program;

import ro.ase.cts.clase.MeniuRestaurant;
import ro.ase.cts.clase.OfertaMeniu;
import ro.ase.cts.clase.StrategieCaloriiMinim;
import ro.ase.cts.clase.StrategieCarbohidratiMinim;

public class Program {
    public static void main(String[] args) {
        MeniuRestaurant meniuRestaurant = new MeniuRestaurant();
        OfertaMeniu meniu1 = new OfertaMeniu("meniu1", 200, 70);
        OfertaMeniu meniu2 = new OfertaMeniu("meniu2", 346, 80);
        OfertaMeniu meniu3 = new OfertaMeniu("meniu3", 456, 20);
        OfertaMeniu meniu4 = new OfertaMeniu("meniu4", 127, 90);

        meniuRestaurant.addOfertaMeniu(meniu1);
        meniuRestaurant.addOfertaMeniu(meniu2);
        meniuRestaurant.addOfertaMeniu(meniu3);
        meniuRestaurant.addOfertaMeniu(meniu4);


        meniuRestaurant.setStrategieAlegere(new StrategieCaloriiMinim());
        System.out.println("meniul are un nr minim de calorii " + meniuRestaurant.alegereOferta());


        meniuRestaurant.setStrategieAlegere(new StrategieCarbohidratiMinim());
        System.out.println("meniul are un nr minim de carbohidrati " + meniuRestaurant.alegereOferta());


    }
}
