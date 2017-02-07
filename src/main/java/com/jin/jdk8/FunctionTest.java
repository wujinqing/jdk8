package com.jin.jdk8;

import com.jin.jdk8.datas.Data;

import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.IntFunction;

/**
 * @author wu.jinqing
 * @date 2017年01月18日
 */
public class FunctionTest {
    public static void main(String[] args) {
//        Function<Integer, Integer> function = i -> i * 2;
//        Function<Integer, Integer> function2 = i -> i + 3;
//        Function<Integer, Integer> function3 = Function.identity();
//
//        System.out.println(function.apply(1));
//        System.out.println(function.compose(function2).apply(1));
//        System.out.println(function.andThen(function2).apply(1));
//        System.out.println(function3.apply(2));

        IntFunction<String> intFunction = i -> i + "hello";

        System.out.println(intFunction.apply(1));

        DoubleToIntFunction doubleToIntFunction = i -> Double.valueOf(i).intValue();

        System.out.println(doubleToIntFunction.applyAsInt(12.00D));

        DoubleToLongFunction doubleToLongFunction = d -> Double.valueOf(d).longValue();

        System.out.println(doubleToLongFunction.applyAsLong(13.00D));

        Data.intDatas.stream().map(i -> i * 2).forEach(System.out::println);
    }
}
