package factory.absfactory.pizzastore;

import factory.absfactory.pizzastore.order.OrderPizza;
import factory.methodfactory.pizzastore.order.BJOrderpizza;
import factory.methodfactory.pizzastore.order.LDOrderPizza;

import java.util.Scanner;

public class PizzaStore {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        String type=scanner.next();
        if(type.equals("bj")){
            new OrderPizza(new BJFactory());
        }else if(type.equals("ld")){
            new OrderPizza(new LDFactory());
        }
    }
}
