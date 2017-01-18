package com.jin.jdk8;

/**
 * Created by wujq on 2017/1/17.
 */
@FunctionalInterface
public interface MyFunctionalInterface {
    void  myMethod();

    default void defaultMethod()
    {
        System.out.println("I am defaultMethod.");
    }

    default  void defaultMethod2()
    {
        System.out.println("I am defaultMethod2.");
    }
}
