package factory.simplefactory.pizzastore;

import factory.simplefactory.pizzastore.pizza.CheesePizza;
import factory.simplefactory.pizzastore.pizza.GreekPizza;
import factory.simplefactory.pizzastore.pizza.Pizza;

public class SimpleFactory {
    public Pizza createPizza(String type){
        Pizza p=null;
        if (type.equals("greek")) {
            p = new GreekPizza();
        } else if (type.equals("cheese")) {
            p = new CheesePizza();
        }
        return p;
    }
}
