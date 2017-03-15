package com.jin.jdk8.stream3;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountedCompleter;

/**
 * @author wu.jinqing
 * @date 2017年03月14日
 */
public class StreamTest {

    static final int BATCH_UNIT = 1 << 10;  // batch array size increment
    static final int MAX_BATCH = 1 << 25;  // max batch array size;
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");

        list.stream().forEach(System.out::println);

        System.out.println(BATCH_UNIT);
        System.out.println(MAX_BATCH);


    }
}
