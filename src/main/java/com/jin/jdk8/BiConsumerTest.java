package com.jin.jdk8;

import java.util.function.BiConsumer;

/**
 * @author wu.jinqing
 * @date 2017年01月18日
 */
public class BiConsumerTest {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println(a + b);

        biConsumer.accept("hello", "world");
    }
}
