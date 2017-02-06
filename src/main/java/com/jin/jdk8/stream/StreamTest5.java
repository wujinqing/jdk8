package com.jin.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wu.jinqing
 * @date 2017年02月06日
 */
public class StreamTest5 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "helloworld", "test");

        list.stream().map(String::toUpperCase).forEach(System.out::println);

        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5, 6));

        stream.flatMap(theList -> theList.stream()).map(it -> it * it).forEach(System.out::println);

    }
}
