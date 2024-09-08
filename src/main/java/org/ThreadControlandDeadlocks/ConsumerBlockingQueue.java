package org.ThreadControlandDeadlocks;

import java.util.concurrent.BlockingQueue;

public class ConsumerBlockingQueue implements Runnable {
    private final BlockingQueue<Integer> queue;

    public ConsumerBlockingQueue(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int value = queue.take();
                System.out.println("Consumed: " + value);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            try {
                Thread.sleep(150); // Simulate time taken to consume an item
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

