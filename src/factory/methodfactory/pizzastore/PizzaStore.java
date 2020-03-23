package factory.methodfactory.pizzastore;

import factory.methodfactory.pizzastore.order.BJOrderpizza;
import factory.methodfactory.pizzastore.order.LDOrderPizza;
import factory.simplefactory.pizzastore.SimpleFactory;
import factory.simplefactory.pizzastore.order.OrderPizza;

import java.util.Scanner;

public class PizzaStore {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        String type=scanner.next();
        if(type.equals("bj")){
            new BJOrderpizza();
        }else if(type.equals("ld")){
            new LDOrderPizza();
        }
    }
}
