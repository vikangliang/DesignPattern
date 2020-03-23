package factory.simplefactory.pizzastore.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("奶酪pizza正在准备");
    }
}
