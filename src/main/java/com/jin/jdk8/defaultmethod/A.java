package com.jin.jdk8.defaultmethod;

/**
 * @author wu.jinqing
 * @date 2018年01月24日
 */
public interface A {
    default public void method()
    {
        System.out.println("A");
    }
}
