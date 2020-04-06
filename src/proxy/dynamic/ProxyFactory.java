package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {

        //loader:指定当前目标对象的使用的类加载器，获取类加载器的方法固定
        //interfaces:目标对象的实现的接口类型，使用泛型方法确认类型
        //h:事件处理
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK代理");
                Object returnVal = method.invoke(target, args);
                System.out.println("结束代理");
                return returnVal;
            }
        });
    }
}
