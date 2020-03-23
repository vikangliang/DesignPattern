package factory.simplefactory.pizzastore.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("greekpizza在准备");
    }
}
