package org.ThreadControlandDeadlocks;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Create a shared buffer with a capacity of 10
        Queue<Integer> buffer = new LinkedList<>();
        int capacity = 10;

        // Create producer and consumer threads
        Thread producer = new Thread(new Producer(buffer, capacity));
        Thread consumer = new Thread(new Consumer(buffer));

        // Start the threads
        producer.start();
        consumer.start();
    }
}
