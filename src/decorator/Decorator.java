package decorator;

public class Decorator extends Drink {
    private Drink drink;
    @Override
    public float cost() {
        return super.getPrice()+drink.cost();
    }

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDes() {
        return super.getDes()+super.getPrice()+"&&"+drink.getDes();
    }
}
