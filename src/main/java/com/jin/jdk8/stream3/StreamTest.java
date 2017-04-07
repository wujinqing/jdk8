package com.jin.jdk8.stream3;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountedCompleter;
import java.util.function.Function;

/**
 * @author wu.jinqing
 * @date 2017年03月14日
 */
public class StreamTest {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");

        list.stream().map(i -> i).forEach(System.out::println);



    }
}
