package org.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Reflection implements InvocationHandler {
    /**
     * 代理类中的真实对象
     */
    public final Object target;

    public Reflection(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
