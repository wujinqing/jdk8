package com.jin.jdk8.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wu.jinqing
 * @date 2017年02月06日
 */
public class StreamTest3 {
    public static void main(String[] args) {
        Stream<Integer> list = Stream.of(1, 2, 3, 4, 5);

        int sum = list.reduce(0, Integer::sum);

        System.out.println(sum);

    }
}
