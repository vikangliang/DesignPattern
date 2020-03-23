package factory.absfactory.pizzastore.pizza;

public class BeijingCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪");
        System.out.println("北京奶酪pizza正在准备");
    }
}
