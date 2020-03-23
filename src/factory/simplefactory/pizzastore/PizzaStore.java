package factory.simplefactory.pizzastore;

import factory.simplefactory.pizzastore.order.OrderPizza;

public class PizzaStore {
    public static void main(String args[]){
        new OrderPizza(new SimpleFactory());
    }
}
