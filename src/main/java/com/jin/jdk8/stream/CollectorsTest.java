package com.jin.jdk8.stream;

import com.jin.jdk8.datas.Data;
import com.jin.jdk8.datas.Student;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author wu.jinqing
 * @date 2017年02月07日
 */
public class CollectorsTest {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(8, 9, 1, 2, 3, 4, 5, 6, 7);
        Stream<String> stream2 = Stream.of("1", "2", "3", "4", "5");

        Student student1 = new Student("zhang san", 10, 80);
        Student student2 = new Student("li si", 20, 60);
        Student student3 = new Student("wang wu", 40, 70);
        Student student4 = new Student("li si", 30, 80);

        Stream<Student> students =Stream.of(student1, student2, student3, student4);

//        stream.collect(Collectors.toCollection(TreeSet::new)).forEach(System.out::println);

//        System.out.println(stream2.collect(Collectors.joining()));
//        System.out.println(stream2.collect(Collectors.joining(",")));
//        System.out.println(stream2.collect(Collectors.joining(",", "[", "]")));

//        System.out.println(stream.collect(Collectors.mapping(i -> i + "", Collectors.joining())));
//        stream.collect(Collectors.mapping(i -> i+"-", Collectors.toList())).forEach(System.out::println);
//        stream.collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList)).forEach(System.out::println);
//        System.out.println(stream.collect(Collectors.counting()));
//        stream.collect(Collectors.minBy((i, k) ->  k - i)).ifPresent(System.out::println);
//        stream.collect(Collectors.maxBy((i, k) -> i - k)).ifPresent(System.out::println);

//        System.out.println(stream.collect(Collectors.summingInt(i -> i)));
//        System.out.println(stream.collect(Collectors.averagingInt(i -> i)));
//        System.out.println(stream.reduce(0, Integer::sum));
//        stream.reduce(Integer::sum).ifPresent(System.out::println);
//        stream.collect(Collectors.reducing(Integer::sum)).ifPresent(System.out::println);
//        System.out.println(stream.collect(Collectors.reducing(0, Integer::sum)));
//        System.out.println(stream.collect(Collectors.reducing(0, i -> i * 2, Integer::sum)));

//       Map<Integer, List<Student>> map = students.collect(Collectors.groupingBy(s -> s.getScore()));
//
//        map.forEach((score, student) -> System.out.println(score + "-" +  student.size()));

//        Map<Integer, Set<Student>> map = students.collect(Collectors.groupingBy(Student::getScore, Collectors.toSet()));
//
//        map.forEach((score, student) -> System.out.println(score + "-" +  student.size()));


//        Map<String, Integer> map = students.collect(Collectors.toMap(s -> s.getName(), s -> s.getScore()));
//
//
//
//
//        map.forEach((score, student) -> System.out.println(score + "-" +  student));


//        Map<String, Integer> map = students.collect(Collectors.toMap(s -> s.getName(), s -> s.getScore(), (s1, s2) -> s1 + s2));
//
//        map.forEach((score, student) -> System.out.println(score + "-" +  student));


        System.out.println(students.collect(Collectors.summarizingInt(Student::getScore)).getSum());





    }
}
