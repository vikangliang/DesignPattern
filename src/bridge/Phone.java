package bridge;

public abstract class Phone {
    private Brand brand;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void open(){
        brand.open();
    }

    public void close(){
        brand.close();
    }

    public void call(){
        brand.call();
    }

    public Phone(Brand brand) {
        this.brand = brand;
    }
}
