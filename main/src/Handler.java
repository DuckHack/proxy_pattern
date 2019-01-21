import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Handler implements InvocationHandler {

    private final DeduplicationInterface deduplicationInterfaceImpl;

    Handler(Object deduplication) {
        this.deduplicationInterfaceImpl = (DeduplicationInterface) deduplication;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] arguments) throws Throwable {
        System.out.println(String.format("Inside the proxy.\n Called method name is: %s", method.getName()));
        method.invoke(deduplicationInterfaceImpl, arguments);
        return null;
    }

}
