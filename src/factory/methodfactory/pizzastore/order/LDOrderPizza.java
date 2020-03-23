package factory.methodfactory.pizzastore.order;

import factory.methodfactory.pizzastore.pizza.LondonGreekPizza;
import factory.methodfactory.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza() {
        Pizza p=new LondonGreekPizza();
        return p;
    }
}
