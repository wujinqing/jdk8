package com.jin.jdk8;

import java.util.function.BiFunction;

/**
 * @author wu.jinqing
 * @date 2017年01月18日
 */
public class BiFunctionTest {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;

        System.out.println(compute(1, 2, (a, b) -> a + b));
        System.out.println(compute(1, 2, (a, b) -> a - b));
        System.out.println(compute(1, 2, (a, b) -> a * b));
        System.out.println(compute(1, 2, (a, b) -> a / b));
    }

    public static int compute(Integer a, Integer b, BiFunction<Integer, Integer, Integer> biFunction)
    {
        return biFunction.apply(a, b);
    }
}
