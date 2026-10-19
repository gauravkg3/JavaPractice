package LLD.DecoratorPattern.Toppings;

import LLD.DecoratorPattern.Pizza.BasePizza;

public class ExtraCheese extends BasePizza {

    BasePizza basePizza;

    public ExtraCheese(BasePizza pizza) {
        this.basePizza = pizza;
    }


    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }

}
