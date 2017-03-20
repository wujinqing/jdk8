package com.jin.jdk8.stream3;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**author
 * @author wu.jinqing
 * @date 2017年03月20日
 */
public class ConsumerTest  {
    public void tryAdvance2(IntConsumer action)
    {
        action.accept(80);
    }

    void tryAdvance(Consumer<? super  Integer> action)
    {
        if(action instanceof IntConsumer) {
            System.out.println("IntConsumer");
            tryAdvance2((IntConsumer)action);
        }else
        {
            System.out.println("Consumer");
            tryAdvance2((IntConsumer)action::accept);
        }
    }
    public static void main(String[] args) {
        ConsumerTest consumerTest = new ConsumerTest();

        Consumer<Integer> consumer = i -> System.out.println(i);
        MyConsumer myConsumer = new MyConsumer();

        IntConsumer intConsumer = (int i) -> System.out.println(i);
        consumerTest.tryAdvance(myConsumer);



















    }
}
