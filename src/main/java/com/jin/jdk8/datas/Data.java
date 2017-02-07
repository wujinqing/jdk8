package com.jin.jdk8.datas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author wu.jinqing
 * @date 2017年01月18日
 */
public class Data {
    public static final List<String> strDatas = Arrays.asList("Hello", "World", "Hello World");

    public static final List<Integer> intDatas = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    public static final Stream<Student> students;

    static
    {
        Student student1 = new Student("zhang san", 10, 80);
        Student student2 = new Student("li si", 20, 60);
        Student student3 = new Student("wang wu", 40, 70);
        Student student4 = new Student("zhao liu", 30, 80);

        students =Stream.of(student1, student2, student3, student4);
    }

}
