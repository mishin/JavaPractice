package com.example.aop.pointcut.performace;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

/**
 * Created by krishna_hotha on 4/24/15.
 */
public class SimplePointCut extends StaticMethodMatcherPointcut {
    @Override
    public boolean matches(Method method, Class<?> aClass) {
        return method.getName().equals("advised");
    }
}
