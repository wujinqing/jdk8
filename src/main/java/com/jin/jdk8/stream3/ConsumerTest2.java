package com.jin.jdk8.stream3;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**
 * @author wu.jinqing
 * @date 2017年03月20日
 */
public class ConsumerTest2 implements DefaultMethodTest{

    public static void main(String[] args) {

        ConsumerTest2 consumerTest2 = new ConsumerTest2();

        Consumer myConsumer = new MyConsumer();

        Consumer<Integer> consumer = i -> System.out.println(i);
        IntConsumer intConsumer = i -> System.out.println(i);

        consumerTest2.tryAdvance(myConsumer);
//        consumerTest2.tryAdvance(intConsumer);
    }

    @Override
    public void tryAdvance(IntConsumer action) {
        System.out.println("tryAdvance");
        action.accept(2);
    }
}
