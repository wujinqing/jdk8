package com.jin.jdk8;

import java.util.function.Supplier;

/**
 * @author wu.jinqing
 * @date 2017年01月18日
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "hello";

        System.out.println(supplier.get());
    }
}
