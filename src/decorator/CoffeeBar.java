package decorator;

public class CoffeeBar {
    public static void main(String args[]){
        Drink drink=new LongBlack();
        System.out.println(drink.cost());
        System.out.println(drink.getDes());

        drink=new Milk(drink);
        System.out.println(drink.cost());
        System.out.println(drink.getDes());

        drink=new Chocolate(drink);
        System.out.println(drink.cost());
        System.out.println(drink.getDes());

        drink=new Chocolate(drink);
        System.out.println(drink.cost());
        System.out.println(drink.getDes());
    }
}
