package com.jin.jdk8;

/**
 * @author wu.jinqing
 * @date 2017年01月18日
 */
public class StreamTest {
    public static void main(String[] args) {
//        System.out.println(Data.intDatas.stream().reduce(0, (a, b) -> a + b));
//        System.out.println(Data.intDatas.stream().map(i -> i * 2).reduce(0, (a, b) -> a + b));
//
//        Data.intDatas.stream().sorted((a, b) -> -a + b).forEach(System.out::println);
        Data.intDatas.stream().max((a, b) -> a- b).ifPresent(System.out::println);
    }
}
