package com.jin.jdk8.stream2;

/**
 * @author wu.jinqing
 * @date 2017年03月03日
 */
public class AutoCloseableTest implements AutoCloseable{
    public void doSomething()
    {
        System.out.println("doSomething invoked!");
    }
    @Override
    public void close() throws Exception {
        System.out.println("close invoked!");
    }

    public static void main(String[] args) {
        try (AutoCloseableTest autoCloseableTest = new AutoCloseableTest()){
            autoCloseableTest.doSomething();
            System.out.println("ss");
            throw new Exception();
        }catch (Exception e)
        {
            System.out.println("exception invoked!");
        }finally {
            System.out.println("finally invoked!");
        }
    }
}
