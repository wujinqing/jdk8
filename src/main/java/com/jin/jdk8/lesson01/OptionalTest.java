package com.jin.jdk8.lesson01;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by wujq on 2017/1/16.
 */
public class OptionalTest {
    public static void main(String[] args) {
        List<String> datas = Arrays.asList("Hello", "World", "Hello World");

        Optional<List<String>> optional = Optional.ofNullable(datas);

//        optional.map();
//        optional.ifPresent(item -> System.out.println(item));

//        Optional<String> optional = Optional.of("wujq");
//        optional.filter((String s) -> "wujq".equals(s)).ifPresent(System.out::println);
//        optional.map((String s) -> s.toUpperCase()).ifPresent(System.out::println);
    }
}
