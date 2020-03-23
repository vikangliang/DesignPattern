package factory.absfactory.pizzastore;

import factory.absfactory.pizzastore.pizza.BeijingCheesePizza;
import factory.absfactory.pizzastore.pizza.Pizza;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza() {
        Pizza p=new BeijingCheesePizza();
        return p;
    }
}
