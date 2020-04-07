package template;

public class Client {
    public static void main(String args[]) {
        SoyaMilk red=new RedBeanSoyaMilk();
        red.make();
        SoyaMilk pea=new PeanutSoyaMilk();
        pea.make();
    }
}
