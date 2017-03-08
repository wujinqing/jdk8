package com.jin.jdk8.stream2;

import com.jin.jdk8.datas.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wu.jinqing
 * @date 2017年02月16日
 */
public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("zhangsan", 80), new Student("lisi", 90), new Student("zhangsan", 80), new Student("zhaoliu", 70));

//        students.stream().collect(Collectors.g);


    }
}
