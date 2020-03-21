package singleton.type08;

public class SingletonTest08 {
    public static void main(String args[]) {
        Sinleton sinleton = Sinleton.INSTANCE;
        Sinleton sinleton1 = Sinleton.INSTANCE;
        System.out.println(sinleton == sinleton1);
    }
}

//懒汉式（枚举方式）
enum  Sinleton {
    INSTANCE;
    private void method(){
        System.out.println("ok");
    }
}
