package com.jin.jdk8;

/**
 *
 */
public class MyFunctionalInterfaceImpl implements MyFunctionalInterface{
   @Override
    public void defaultMethod2()
    {
        System.out.println("I am defaultMethod2 impl.");
    }

    public void  myMethod()
    {

    }


    public static void main(String[] args) {
        MyFunctionalInterface i = () -> System.out.println("11");
//        MyFunctionalInterface myFunctionalInterface2 = MyFunctionalInterface::myMethod;

        i.myMethod();
        i.defaultMethod2();


    }
}
