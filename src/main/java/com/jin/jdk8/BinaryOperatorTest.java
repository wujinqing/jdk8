package com.jin.jdk8;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @author wu.jinqing
 * @date 2017年01月18日
 */
public class BinaryOperatorTest {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (a, b) -> a - b;
        Integer result = BinaryOperator.minBy(comparator).apply(1, 12);

        System.out.println(result);
    }
}
