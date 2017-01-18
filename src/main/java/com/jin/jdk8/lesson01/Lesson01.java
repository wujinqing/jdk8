package com.jin.jdk8.lesson01;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wujq on 2017/1/12.
 */
public class Lesson01 {
    public static final List<String> data = Arrays.asList("A", "B", "C", "D", "E");

    public static void main(String[] args) {
        data.forEach(i -> System.out.println(i));
        System.out.println("==========================");
        data.parallelStream().map(i -> i.toLowerCase()).forEach(k -> System.out.println(k));
        System.out.println("==========================");
        data.parallelStream().filter(i -> i.equals("C")).forEach(k -> System.out.println(k));
    }
}
