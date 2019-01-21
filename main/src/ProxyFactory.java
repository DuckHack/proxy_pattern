import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

class ProxyFactory {
    //proxy for obj creating
    static Object getProxyForObj(Object object) {
        InvocationHandler invocationHandler = new Handler(object);
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                new Class<?>[]{DeduplicationInterface.class},
                invocationHandler);
    }
}