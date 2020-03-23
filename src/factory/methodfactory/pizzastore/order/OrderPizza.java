package factory.methodfactory.pizzastore.order;

import factory.methodfactory.pizzastore.pizza.Pizza;

public abstract class OrderPizza {
    public OrderPizza() {
        Pizza p = null;
        String type = null;
        p = createPizza();
        p.prepare();
        p.bake();
        p.cut();
        p.box();
    }

    abstract Pizza createPizza();
}
