package com.jin.jdk8.lesson01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by wujq on 2017/1/12.
 */
public class PredicateTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        conditionFilter(list, i -> i > 5);
//        conditionFilter(list, i -> i < 5);

//        conditionFilter(list, i -> i < 5, i -> i % 2 == 0);

//        conditionFilter2(list, i -> i < 5);

        conditionFilter3(list, 6);
    }

    public static void conditionFilter(List<Integer> list, Predicate<Integer> predicate)
    {
        list.stream().filter(predicate).forEach( i -> System.out.println(i));
    }

    public static void conditionFilter2(List<Integer> list, Predicate<Integer> predicate)
    {
        list.stream().filter(predicate.negate()).forEach( i -> System.out.println(i));
    }

    public static void conditionFilter3(List<Integer> list, int target)
    {
        list.stream().filter(Predicate.isEqual(target)).forEach(i -> System.out.println(i));
    }

    public static void conditionFilter(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> predicate2)
    {
        list.stream().filter(predicate.or(predicate2)).forEach( i -> System.out.println(i));
    }
}
