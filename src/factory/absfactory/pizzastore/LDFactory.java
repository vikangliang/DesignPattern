package factory.absfactory.pizzastore;

import factory.absfactory.pizzastore.pizza.LondonGreekPizza;
import factory.absfactory.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza() {
        Pizza p=new LondonGreekPizza();
        return p;
    }
}
