package adapter.interfaceadapter;

public class Test {
    public static void main(String args[]){
        Implement1 i=new Implement1(){
            @Override
            public void m1() {
                System.out.println("接口适配器");
            }
        };
        i.m1();
    }
}
