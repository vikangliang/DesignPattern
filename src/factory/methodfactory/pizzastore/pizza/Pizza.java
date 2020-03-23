package factory.methodfactory.pizzastore.pizza;

public abstract class Pizza {
    protected String name;

    public abstract void prepare();

    public void bake() {
        System.out.println("bake");
    }

    public void cut() {
        System.out.println("cut");
    }

    public void box() {
        System.out.println("box");
    }

    public void setName(String name) {
        this.name = name;
    }
}
