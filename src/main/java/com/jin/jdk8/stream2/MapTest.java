package com.jin.jdk8.stream2;

import com.jin.jdk8.datas.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wu.jinqing
 * @date 2017年03月01日
 */
public class MapTest {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("wangwu", 70),
                new Student("mazi", 90),
                new Student("wangwu", 90),
                new Student("mazi", 60),
                new Student("zhangsan", 80),
                new Student("zhaoliu", 70));

        Map<Student, String> map = new HashMap<>();

        students.forEach( item -> map.computeIfAbsent(item, Student::getName));

        map.forEach((k, v) -> System.out.println(k + ", " + v));
    }
}
