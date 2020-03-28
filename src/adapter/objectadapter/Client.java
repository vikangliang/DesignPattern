package adapter.objectadapter;

public class Client {
    public static void main(String args[]){
        Phone p=new Phone();
        p.changing(new VAdapter(new V220()));
    }
}
