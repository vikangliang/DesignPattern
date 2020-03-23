package factory.absfactory.pizzastore.order;

import factory.absfactory.pizzastore.AbsFactory;
import factory.absfactory.pizzastore.pizza.Pizza;

import java.util.Scanner;

public class OrderPizza {
    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory) {
        setAbsFactory(absFactory);
    }

    private void setAbsFactory(AbsFactory absFactory) {
        Pizza p = null;
        this.absFactory = absFactory;
        p = absFactory.createPizza();
        if (p != null) {
            p.prepare();
            p.bake();
            p.cut();
            p.box();
        }
    }
}
