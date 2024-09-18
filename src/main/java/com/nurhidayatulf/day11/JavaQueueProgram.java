package com.nurhidayatulf.day11;

public class JavaQueueProgram {
    private Node front;
    private Node rear;

    public JavaQueueProgram() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.err.println("Queue is empty. U can't dequeue.");
            return -1;
        }
        int dequeuedData = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return dequeuedData;
    }

    public int peek() {
        if (isEmpty()) {
            System.err.println("Queue is empty. U can't peek.");
            return -1;
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
        JavaQueueProgram queue = new JavaQueueProgram();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element is: " + queue.peek());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Front element after dequeues: " + queue.peek());

        queue.dequeue();
        queue.dequeue();
    }
}