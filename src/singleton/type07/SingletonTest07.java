package singleton.type07;

public class SingletonTest07 {
    public static void main(String args[]) {
        Sinleton sinleton = Sinleton.getInstance();
        Sinleton sinleton1 = Sinleton.getInstance();
        System.out.println(sinleton == sinleton1);
    }
}

//懒汉式（静态内部类）
class Sinleton {
    //    构造器私有化，防止外部使用
    private Sinleton() {

    }

    private static class SintonInstance {
        private static final Sinleton INSTANCE = new Sinleton();
    }

    //    提供公有的静态方法，返回实例对象
    public static synchronized Sinleton getInstance() {
        return SintonInstance.INSTANCE;
    }
}
