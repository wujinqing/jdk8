package com.jin.jdk8.lesson01;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * Created by wujq on 2017/1/16.
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello";

        System.out.println(supplier.get());
    }
}
