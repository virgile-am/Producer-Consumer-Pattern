package org.ThreadControlandDeadlocks;

import java.util.concurrent.BlockingQueue;

public class ProducerBlockingQueue implements Runnable {
    private final BlockingQueue<Integer> queue;

    public ProducerBlockingQueue(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int value = 0;
        while (true) {
            try {
                queue.put(value++);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            try {
                Thread.sleep(100); // Simulate time taken to produce an item
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

