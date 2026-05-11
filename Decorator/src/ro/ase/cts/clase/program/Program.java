package ro.ase.cts.clase.program;

import ro.ase.cts.clase.APizza;
import ro.ase.cts.clase.DecoratorCheese;
import ro.ase.cts.clase.PizzaVegetariana;
import ro.ase.cts.clase.Sosuri;

public class Program {
    public static void main(String[] args) {

        APizza pizza = new PizzaVegetariana();
        System.out.println(pizza.getComponente());
        System.out.println(pizza.getPret());
        System.out.println();

        APizza pizzaDecorata = new DecoratorCheese(pizza);
        System.out.println(pizzaDecorata.getComponente());
        System.out.println(pizzaDecorata.getPret());
        System.out.println();


        APizza pizzaDecorataMultiplu = new Sosuri(
                new DecoratorCheese(new PizzaVegetariana()), 10);
        System.out.println(pizzaDecorataMultiplu.getComponente());
        System.out.println(pizzaDecorataMultiplu.getPret());
    }
}
