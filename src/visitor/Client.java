package visitor;

public class Client {
    public static void main(String args[]){
        ObjectStructs objectStructs=new ObjectStructs();
        objectStructs.attach(new Man());
        objectStructs.attach(new Woman());
        objectStructs.attach(new Man());

        Success success=new Success();
        objectStructs.display(success);

        System.out.println("===========");
        Fail fail=new Fail();
        objectStructs.display(fail);
    }
}
