package com.jin.jdk8.stream2;

import com.jin.jdk8.datas.Student;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * @author wu.jinqing
 * @date 2017年02月27日
 */
public class CollectorsTest {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("wangwu", 70),
                new Student("lisi", 50),
                new Student("zhangsan", 90),
                new Student("lisi", 90),
                new Student("zhangsan", 80),
                new Student("wangwu", 20));

//        Set<String> set = students.stream().collect(Collectors.mapping(Student::getName, Collectors.toSet()));
//        String s = students.stream().collect(Collectors.collectingAndThen(
//                Collectors.mapping(Student::getName, Collectors.toSet()), (Set<String> set) -> {
//                    StringBuilder sb = new StringBuilder();
//
//                    set.forEach(sb::append);
//
//                    return sb.toString();
//                }));
//
//        System.out.println(s);

//       Integer sum = students.stream().collect(Collectors.collectingAndThen(Collectors.mapping(Student::getScore, Collectors.toList()), (List<Integer> list) -> list.stream().reduce(0, Integer::sum)));
//        System.out.println(sum);

//        set.forEach(System.out::println);

//        Long count = students.stream().collect(Collectors.counting());
//
//        System.out.println(count);

//        students.stream().collect(Collectors.groupingBy(Student::getName,
//                Collectors.reducing(BinaryOperator.minBy(Comparator.comparing(
//                        Student::getScore))))).forEach((k, v) -> System.out.println(k + "=" + v.get().getScore()));

//        students.stream().collect(Collectors.maxBy(Comparator.comparing(Student::getScore))).ifPresent(System.out::println);
//        students.stream().collect(Collectors.minBy(Comparator.comparing(Student::getScore))).ifPresent(System.out::println);
//        int sum = students.stream().collect(Collectors.summingInt(Student::getScore));
//
//        System.out.println(sum);

//        Map<String, List<Student>> map = students.stream().collect(
//                Collectors.groupingBy(Student::getName, HashMap::new, Collectors.toList()));



//        System.out.println(map);

//        Map<Boolean, List<Student>> map = students.stream().collect(Collectors.partitioningBy(s -> s.getScore() >= 80, Collectors.toList()));
//
//        System.out.println(map);

//        Map<String, Integer> map = students.stream().collect(Collectors.toMap(Student::getName, Student::getScore));
//
//        System.out.println(map);

        Map<String, Integer> map = students.stream().collect(Collectors.toMap(Student::getName, Student::getScore, (oldValue, newValue) -> newValue));

        System.out.println(map);





















    }
}
