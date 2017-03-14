package com.jin.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by wujinqing on 17/2/7.
 */
public class StreamTest10 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");

//        list.stream().filter(s -> s.length() == 5).limit(1).findFirst().ifPresent(s -> System.out.print(s.length()));

        list.stream().collect(Collectors.toList());
    }
}
