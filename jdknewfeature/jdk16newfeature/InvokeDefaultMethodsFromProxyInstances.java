package jdknewfeature.jdk16newfeature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static java.lang.ClassLoader.getSystemClassLoader;

public class InvokeDefaultMethodsFromProxyInstances {

    interface HelloWorld {
        default String hello() {
            return "world";
        }
    }

    @Test void test() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object proxy = Proxy.newProxyInstance(getSystemClassLoader(), new Class<?>[] { HelloWorld.class },
                (prox, method, args) -> {
                    if (method.isDefault()) {
                        return InvocationHandler.invokeDefault(prox, method, args);
                    }
                    return null;
                }
        );
        Method method = proxy.getClass().getMethod("hello");
        Assertions.assertEquals(method.invoke(proxy), "world");
    }
}
