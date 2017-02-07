package com.jin.jdk8;

import com.jin.jdk8.datas.Data;

import java.util.function.Predicate;

/**
 * @author wu.jinqing
 * @date 2017年01月18日
 */
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> "hello".equals(s);
        Predicate<Integer> predicate2 = i -> i > 5;
        Predicate<Integer> predicate3 = i -> i < 7;
        Predicate<Integer> predicate4 = i -> i < 3;

//        System.out.println(predicate.test("hello"));

//        Data.intDatas.stream().filter(i -> i > 5).forEach(System.out::println);

//        Data.intDatas.stream().filter(predicate2.and(predicate3)).forEach(System.out::println);
//        Data.intDatas.stream().filter(predicate2.or(predicate4)).forEach(System.out::println);
        Data.intDatas.stream().filter(predicate3.negate()).forEach(System.out::println);

    }
}
