package com.jin.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author wu.jinqing
 * @date 2017年01月18日
 */
public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s + "!");
        Consumer<String> consumer2 = System.out::println;

        List<String> datas = Arrays.asList("Hello", "World", "Hello World");

        datas.forEach(consumer.andThen(consumer2));
    }
}
