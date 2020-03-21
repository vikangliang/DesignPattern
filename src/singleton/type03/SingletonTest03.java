package singleton.type03;

public class SingletonTest03 {
    public static void main(String args[]) {
        Sinleton sinleton = Sinleton.getInstance();
        Sinleton sinleton1=Sinleton.getInstance();
        System.out.println(sinleton==sinleton1);
    }
}

//懒汉式（线程不安全）
class Sinleton {
    //    构造器私有化，防止外部使用
    private Sinleton() {

    }

    //    本类内部创建静态对象
    private static Sinleton instance;

    //    提供公有的静态方法，返回实例对象
    public static Sinleton getInstance() {
        if (instance == null) {
            instance = new Sinleton();
        }
        return instance;
    }
}
