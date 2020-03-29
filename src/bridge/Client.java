package bridge;

public class Client {
    public static void main(String args[]){
        Phone phone=new FoldedPhone(new Vivo());
        phone.open();
        phone.call();
        phone.close();

        System.out.println("-------------------");
        Phone phone1=new UprightPhone(new Huawei());
        phone1.open();
        phone1.call();
        phone1.close();
    }
}
