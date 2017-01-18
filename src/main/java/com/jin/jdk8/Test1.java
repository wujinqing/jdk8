package com.jin.jdk8;

import java.util.Arrays;
import java.util.List;

/**
 * Created by wujq on 2017/1/17.
 */
public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

//        list.forEach(i -> System.out.println(i));

        list.forEach(System.out::println);
    }
}
