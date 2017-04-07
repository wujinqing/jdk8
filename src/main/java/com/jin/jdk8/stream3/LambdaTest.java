package com.jin.jdk8.stream3;

/**
 * @author wu.jinqing
 * @date 2017年04月07日
 */
public class LambdaTest {
    private String name = "zhang san";

    Runnable r1 = () -> System.out.println(this);

    Runnable r2 = new Runnable() {
        @Override
        public void run() {
            System.out.println(this);
        }
    };

    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();

        Thread t1 = new Thread(lambdaTest.r1);

        t1.start();

        Thread t2 = new Thread(lambdaTest.r2);

        t2.start();

    }
}
