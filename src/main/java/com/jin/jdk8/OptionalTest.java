package com.jin.jdk8;

import java.util.Optional;

/**
 * @author wu.jinqing
 * @date 2017年01月18日
 */
public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("helwlo");
        Optional<String> optional2 = Optional.ofNullable(null);

//        optional.ifPresent(System.out::println);
//        System.out.println(optional2.orElse("world"));
//        optional.map(s -> s + " world").ifPresent(System.out::println);
        optional.filter(s -> "hello".equals(s)).ifPresent(System.out::println);
    }
}
