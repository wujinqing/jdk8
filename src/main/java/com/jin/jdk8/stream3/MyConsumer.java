package com.jin.jdk8.stream3;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**
 * @author wu.jinqing
 * @date 2017年03月20日
 */
public class  MyConsumer<T extends Integer> implements IntConsumer, Consumer<T>{


    @Override
    public void accept(int value) {
        System.out.println("IntConsumer");
        System.out.println(value);

    }

    @Override
    public void accept(T t) {
        System.out.println("Consumer");
        System.out.println(t);

    }
}
