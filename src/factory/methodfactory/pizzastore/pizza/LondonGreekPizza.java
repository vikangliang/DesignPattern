package factory.methodfactory.pizzastore.pizza;

public class LondonGreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦greek");
        System.out.println("伦敦greekpizza在准备");
    }
}
