package com.jin.jdk8.forkjoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * @author wu.jinqing
 * @date 2017年03月07日
 */
public class FibonacciRecursiveTask extends RecursiveTask<Integer> {
    private Integer n;

    public FibonacciRecursiveTask(Integer n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {
        if(n == 1 || n == 2) {
            return 1;
        }else {
            FibonacciRecursiveTask task1 = new FibonacciRecursiveTask(n - 1);
            FibonacciRecursiveTask task2 = new FibonacciRecursiveTask(n - 2);

            task1.fork();
            task2.fork();

            return task1.join() + task2.join();
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        for (int i = 1; i <= 20; i++) {
            FibonacciRecursiveTask task = new FibonacciRecursiveTask(i);

            ForkJoinPool pool = new ForkJoinPool();

            ForkJoinTask<Integer> result = pool.submit(task);

            System.out.println(result.get());
        }

    }
}
