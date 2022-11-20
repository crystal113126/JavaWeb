package learn.example.demo2.demo1.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * parameters:
 * 1.ClassLoader loader: class loader to get real class data
 * 2. Class<?>[] interface, need to give interface : JDK need have or implement interface
 * 3. InvocationHandler h when the proxy run the method, it will run.
 */
public class JDKProxy {
    public static Object getProxy(Object target) {
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class[] interfaces = target.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader, interfaces, getInvocationHandle(target));
    }

    private static InvocationHandler getInvocationHandle(Object target) {
        return new InvocationHandler() {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("Start");
            Object result = method.invoke(target,args);
            System.out.println("Submit");
            return result;
        }
        };

    }

}
