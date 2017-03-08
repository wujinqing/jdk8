package com.jin.jdk8.stream2;

import com.jin.jdk8.datas.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wu.jinqing
 * @date 2017年02月20日
 */
public class ComparableTest {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("wangwu", 70), new Student("mazi", 90), new Student("zhangsan", 90), new Student("lisi", 90), new Student("zhangsan", 80), new Student("zhaoliu", 70));

//        students.sort(Comparator.comparingInt(Student::getScore));
//        students.sort(Comparator.comparing(Student::getName, String::compareToIgnoreCase));
//        students.sort(Comparator.comparing(Student::getName, String::compareToIgnoreCase).thenComparing(Comparator.comparingInt(Student::getScore).reversed()).thenComparing(Collections.reverseOrder()));

        students.sort(Comparator.comparingInt((Student s) -> s.getName().length()).reversed().thenComparing(Comparator.comparingInt((Student s) -> s.getScore())));


        System.out.println(students);
    }

}
