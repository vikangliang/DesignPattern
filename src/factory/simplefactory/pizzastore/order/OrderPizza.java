package factory.simplefactory.pizzastore.order;

import factory.simplefactory.pizzastore.SimpleFactory;
import factory.simplefactory.pizzastore.pizza.CheesePizza;
import factory.simplefactory.pizzastore.pizza.GreekPizza;
import factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza {
    SimpleFactory simpleFactory;
    Pizza p = null;

    public OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String type = "greek";
        this.simpleFactory = simpleFactory;
        p = this.simpleFactory.createPizza(type);
        if(p!=null){
            p.prepare();
            p.bake();
            p.cut();
            p.box();
        }else{
            System.out.println("失败");
        }
    }
}
