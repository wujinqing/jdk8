package com.jin.jdk8.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wu.jinqing
 * @date 2017年02月06日
 */
public class StreamTest4 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello1", "world", "helloworld");

//        String[] strings = stream.toArray(len -> new String[len]);

//        Arrays.asList(strings).forEach(System.out::println);

//        String[] strings = stream.toArray(String[]::new);
//
//        Arrays.asList(strings).forEach(System.out::println);

//        List<String> list = stream.collect(Collectors.toList());
//        List<String> list = stream.collect(ArrayList::new, (theList, item) -> theList.add(item), (theList1, theList2) -> theList2.addAll(theList1));
//        list.forEach(System.out::println);
//        List<String> asList = stream.collect(ArrayList::new, ArrayList::add,
//                ArrayList::addAll);
//        asList.forEach(System.out::println);


//        List<String> list = stream.collect(Collectors.toCollection(LinkedList::new));
//
//        list.forEach(System.out::println);

//        Set<String> set = stream.collect(Collectors.toSet());
//
//        set.forEach(System.out::println);

        Set<String> set = stream.collect(Collectors.toCollection(TreeSet::new));

        set.forEach(System.out::println);

    }
}
