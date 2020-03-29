package bridge;

public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("Vivo手机开机");
    }

    @Override
    public void close() {
        System.out.println("Vivo华为手机开机");
    }

    @Override
    public void call() {
        System.out.println("Vivo华为手机开机");
    }
}
