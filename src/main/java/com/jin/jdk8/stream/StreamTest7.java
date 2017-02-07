package com.jin.jdk8.stream;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wu.jinqing
 * @date 2017年02月07日
 */
public class StreamTest7 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 2, 4);
        Stream<List<String>> stream2 = Stream.of(Arrays.asList("1", "2"), Arrays.asList("3"), Arrays.asList("4", "5"));
        Stream<List<Integer>> stream3 = Stream.of(Arrays.asList(1, 2), Arrays.asList(3), Arrays.asList(4, 5));

//        stream.filter(i -> i > 2).forEach(System.out::println);

//        stream.map(i -> i * 2).forEach(System.out::println);

//        stream.mapToInt(i -> i + 1).max().ifPresent(System.out::println);
//        stream.mapToLong(i -> i + 2).min().ifPresent(System.out::println);
//        stream.mapToDouble(i -> i + 3).boxed().findFirst().ifPresent(System.out::println);
//        stream2.flatMap(list -> list.stream()).mapToInt(i -> Integer.valueOf(i)).max().ifPresent(System.out::println);
//        System.out.println(stream2.flatMapToInt(list -> list.stream().mapToInt(i -> Integer.valueOf(i))).sum());
//        stream.distinct().forEach(System.out::println);

//        stream.sorted().forEach(System.out::println);
//        stream.sorted((i, k) -> k -i).forEach(System.out::println);
//        stream.limit(2).forEach(System.out::println);
//        stream.skip(3).forEach(System.out::println);
//        stream.sorted((i, k) -> k -i).forEachOrdered(System.out::println);
//        System.out.println(stream.toArray(lenth -> new Integer[lenth]).length);

//        System.out.println(stream.reduce(0, Integer::sum));


//        stream.reduce(Integer::sum).ifPresent(System.out::println);

        // 类似分组求和，第一个参数初始值，第二个参数每个小组的求和方式，第三个参数对小组求和之后的结果再进行求和
//        System.out.println(stream.reduce(0, Integer::sum, Integer::sum));


//        System.out.println(stream.allMatch(i -> i > -10));
//        System.out.println(stream.anyMatch(i -> i > 4));
//        System.out.println(stream.noneMatch(i -> i > 4));
//        stream.collect(Collectors.toSet()).forEach(System.out::println);
        LinkedList<Integer> linkedList = stream.collect(LinkedList::new, (theList, item) -> theList.add(item), (theList1, theList2)-> theList1.addAll(theList2));
        linkedList.forEach(System.out::println);













    }
}
