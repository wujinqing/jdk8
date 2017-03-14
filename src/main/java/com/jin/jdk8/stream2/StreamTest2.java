package com.jin.jdk8.stream2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wujinqing on 17/3/13.
 */
public class StreamTest2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");

        list.stream().forEach(System.out::println);
    }
}
