package com.jin.jdk8.stream;

import java.util.UUID;
import java.util.stream.Stream;

import static java.lang.System.out;

/**
 * @author wu.jinqing
 * @date 2017年02月06日
 */
public class StreamTest6 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);

        stream.findFirst().ifPresent(System.out::println);

    }
}
