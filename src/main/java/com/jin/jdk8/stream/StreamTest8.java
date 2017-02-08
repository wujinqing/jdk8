package com.jin.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author wu.jinqing
 * 数据 2017年02月08日
 */
public class StreamTest8 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Hi", "Hello");
        List<String> list2 = Arrays.asList("zhangsan", "lisi", "wangwu");

        list1.stream().flatMap(item -> list2.stream().map(i -> item + i)).forEach(System.out::println);
    }
}
