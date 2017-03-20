package com.jin.jdk8.stream3;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**
 * @author wu.jinqing
 * @date 2017年03月20日
 */
public interface DefaultMethodTest {
    void tryAdvance(IntConsumer action);

    default void tryAdvance(Consumer<Integer> action)
    {
        if (action instanceof IntConsumer) {
            System.out.println("IntConsumer");
            tryAdvance((IntConsumer) action);
        }
        else {
            System.out.println("Consumer");
            tryAdvance((IntConsumer) action::accept);
        }
    }
}
