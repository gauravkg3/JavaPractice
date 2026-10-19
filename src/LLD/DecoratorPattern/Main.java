package LLD.DecoratorPattern;

import LLD.DecoratorPattern.Pizza.BasePizza;
import LLD.DecoratorPattern.Pizza.FarmHousePizza;
import LLD.DecoratorPattern.Toppings.ExtraCheese;
import LLD.DecoratorPattern.Toppings.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new Mushroom(new ExtraCheese(new FarmHousePizza()));

        System.out.println(basePizza.cost());

    }
}
