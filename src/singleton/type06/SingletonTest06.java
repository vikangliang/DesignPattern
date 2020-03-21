package singleton.type06;

public class SingletonTest06 {
    public static void main(String args[]) {
        Sinleton sinleton = Sinleton.getInstance();
        Sinleton sinleton1 = Sinleton.getInstance();
        System.out.println(sinleton == sinleton1);
    }
}

//懒汉式（双重检查）
class Sinleton {
    //    构造器私有化，防止外部使用
    private Sinleton() {

    }

    //    本类内部创建静态对象
    private static volatile Sinleton instance;

    //    提供公有的静态方法，返回实例对象
    public static synchronized Sinleton getInstance() {
        if (instance == null) {
            synchronized (Sinleton.class) {
                if (instance == null) {
                    instance = new Sinleton();
                }
            }
        }
        return instance;
    }
}
