package adapter.classadapter;

public class Client {
    public static void main(String args[]){
        Phone p=new Phone();
        p.changing(new VAdapter());
    }
}
