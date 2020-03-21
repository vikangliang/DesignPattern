package singleton.type02;

public class SingletonTest02 {
    public static void main(String args[]){
        Sinleton sinleton= Sinleton.getInstance();
        Sinleton sinleton1=Sinleton.getInstance();
        System.out.println(sinleton==sinleton1);
        System.out.println(sinleton);
    }
}

//饿汉式（静态代码块）
class Sinleton {
    //    构造器私有化，防止外部使用
    private Sinleton() {

    }

    //    本类内部创建静态对象
    private final static Sinleton instance;

    static {
        instance = new Sinleton();
    }

    //    提供公有的静态方法，返回实例对象
    public static Sinleton getInstance() {
        return instance;
    }
}
