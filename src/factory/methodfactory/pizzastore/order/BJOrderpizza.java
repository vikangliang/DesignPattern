package factory.methodfactory.pizzastore.order;

import factory.methodfactory.pizzastore.pizza.BeijingCheesePizza;
import factory.methodfactory.pizzastore.pizza.Pizza;

public class BJOrderpizza extends OrderPizza {
    @Override
    Pizza createPizza() {
        Pizza p=new BeijingCheesePizza();
        return p;
    }
}
