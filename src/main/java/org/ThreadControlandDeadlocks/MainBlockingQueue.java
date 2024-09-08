package org.ThreadControlandDeadlocks;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainBlockingQueue {
    public static void main(String[] args) {
        // Create a BlockingQueue with a capacity of 10
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

        // Create producer and consumer threads
        Thread producer = new Thread(new ProducerBlockingQueue(queue));
        Thread consumer = new Thread(new ConsumerBlockingQueue(queue));

        // Start the threads
        producer.start();
        consumer.start();
    }
}

