package org.ThreadControlandDeadlocks;

import java.util.Queue;

public class Producer implements Runnable {
    private final Queue<Integer> buffer;
    private final int capacity;

    public Producer(Queue<Integer> buffer, int capacity) {
        this.buffer = buffer;
        this.capacity = capacity;
    }

    @Override
    public void run() {
        int value = 0;
        while (true) {
            synchronized (buffer) {
                while (buffer.size() == capacity) {
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                buffer.add(value++);
                buffer.notifyAll();
            }
            try {
                Thread.sleep(100); // Simulate time taken to produce an item
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
