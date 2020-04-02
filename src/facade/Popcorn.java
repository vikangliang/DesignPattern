package facade;

public class Popcorn {
    private Popcorn(){

    }

    private static final Popcorn instance=new Popcorn();

    public static Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Popcorn  on");
    }

    public void off(){
        System.out.println("Popcorn  off");
    }

    public void pop(){
        System.out.println("Popcorn is pop");
    }
}
