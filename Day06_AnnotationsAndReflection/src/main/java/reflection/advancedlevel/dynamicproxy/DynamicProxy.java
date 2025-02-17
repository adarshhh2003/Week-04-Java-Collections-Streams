package reflection.advancedlevel.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Greeting {
    void sayHello();
}

class LoggingInvocationHandler implements InvocationHandler {

    private final Object target;

    // Constructor to initialize the actual object to be proxied
    public LoggingInvocationHandler(Object target) {
        this.target = target;
    }

    // Method that intercepts all method calls
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Log the method name
        System.out.println("Calling method: " + method.getName());

        // Call the actual method on the target object
        return method.invoke(target, args);
    }
}

public class DynamicProxy {
    public static void main(String[] args) {
        // Create the real object
        Greeting greeting = new GreetingImpl();

        // Create the logging proxy
        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class<?>[]{Greeting.class},
                new LoggingInvocationHandler(greeting)
        );

        // Call method on the proxy object
        proxy.sayHello();
    }
}

class GreetingImpl implements Greeting {

    @Override
    public void sayHello() {
        System.out.println("Hello, world!");
    }
}
