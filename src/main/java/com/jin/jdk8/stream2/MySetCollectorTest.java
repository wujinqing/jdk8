package com.jin.jdk8.stream2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * Created by wujinqing on 17/2/26.
 */
public class MySetCollectorTest<T> implements Collector<T, Set<T>, Map<T, T>>{
    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoked!");

        return HashSet::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator invoked!");
        return (set, item) -> {

            System.out.println("accumulator: " + set + ", " + Thread.currentThread().getName());

            set.add(item);
        };
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoked!");

        return (set1, set2) -> {
            set1.addAll(set2);

            return  set1;
        };
    }

    @Override
    public Function<Set<T>, Map<T, T>> finisher() {
        System.out.println("finisher invoked!");

        return set -> {
            Map<T, T> map = new HashMap<>();

            set.stream().forEach(item -> map.put(item, item));

            return map;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED, Characteristics.CONCURRENT));
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            List<String> list = Arrays.asList("hello", "world", "welcome", "hello", "a", "b", "d", "e", "f", "g");

            Set<String> set = new HashSet<>();

            set.addAll(list);

            System.out.println("Set: " + set);

            Map<String, String> map = set.parallelStream().collect(new MySetCollectorTest<>());

            System.out.println("Map: " + map);
        }
    }
}
