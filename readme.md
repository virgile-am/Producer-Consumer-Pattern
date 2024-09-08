# Producer-Consumer Problem Implementation

## Overview

This project provides two implementations of the producer-consumer problem using Java:
1. Basic implementation with manual synchronization.
2. Implementation using Java's `BlockingQueue` for more efficient communication.

The producer-consumer problem is a classic synchronization problem that illustrates how processes (producers and consumers) can interact with a shared resource (buffer) without causing race conditions or deadlocks.

## Objectives

- Understand the producer-consumer problem.
- Implement the producer-consumer pattern using Java.
- Explore different synchronization mechanisms for producer-consumer scenarios.
- Evaluate the performance and scalability of different implementations.

## Implementation

### Basic Implementation

- **Producer.java**: Defines the producer thread that adds items to a shared buffer.
- **Consumer.java**: Defines the consumer thread that removes items from the shared buffer.
- **Main.java**: Entry point for the basic producer-consumer implementation, creating and starting the producer and consumer threads.

### BlockingQueue Implementation

- **ProducerBlockingQueue.java**: Defines the producer thread that adds items to a `BlockingQueue`.
- **ConsumerBlockingQueue.java**: Defines the consumer thread that removes items from the `BlockingQueue`.
- **MainBlockingQueue.java**: Entry point for the `BlockingQueue` implementation, creating and starting the producer and consumer threads.

## Running the Code

1. **Compile the Code:**

   ```bash
   javac *.java
