package org.ThreadControlandDeadlocks;

import java.util.Queue;

public class Consumer implements Runnable {
    private final Queue<Integer> buffer;

    public Consumer(Queue<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (buffer) {
                while (buffer.isEmpty()) {
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                int value = buffer.poll();
                System.out.println("Consumed: " + value);
                buffer.notifyAll();
            }
            try {
                Thread.sleep(150); // Simulate time taken to consume an item
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
