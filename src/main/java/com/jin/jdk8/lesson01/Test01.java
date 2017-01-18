package com.jin.jdk8.lesson01;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by wujq on 2017/1/11.
 */
public class Test01 {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("A", "B", "C", "D", "E");
//
//        list.forEach(i -> System.out.println(i));
//        list.stream().map(String::toLowerCase).forEach(i -> System.out.println(i));
        Function<Integer, Integer> function1 = i ->  i * 3;


        int r = compute(2, v -> v * 3, v -> v * v);
        System.out.println(r);

        int r2 = compute2(2, v -> v * 3, v -> v * v);
        System.out.println(r2);

        int r3 = compute3(2, 1, (v, k) -> v * k, v -> v * v);
        System.out.println(r3);

        int r4 = compute4(2, 1, (v, k) -> v - k);
        System.out.println(r4);
    }

    public static int compute(int i, Function<Integer, Integer> function1, Function<Integer, Integer> function2)
    {
        return function1.compose(function2).apply(i);
    }

    public static int compute2(int i, Function<Integer, Integer> function1, Function<Integer, Integer> function2)
    {
        return function1.andThen(function2).apply(i);
    }

    public static int compute3(int i, int k, BiFunction<Integer, Integer, Integer> function1, Function<Integer, Integer> function2)
    {
        return function1.andThen(function2).apply(i, k);
    }

    public static int compute4(int i, int k, BiFunction<Integer, Integer, Integer> function1)
    {
        return function1.apply(i, k);
    }
}
