package facade;

public class Stereo {
    private Stereo(){

    }

    private static final Stereo instance=new Stereo();

    public static Stereo getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Stereo  on");
    }

    public void off(){
        System.out.println("Stereo  off");
    }

}
