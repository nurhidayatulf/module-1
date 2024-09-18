package com.nurhidayatulf.day11;

public class JavaStackProgram {
    private Node top;

    public JavaStackProgram() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.err.println("Stack is empty. U can't pop.");
            return -1;
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    public int peek() {
        if (isEmpty()) {
            System.err.println("Stack is empty. U can't peek.");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        JavaStackProgram stack = new JavaStackProgram();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pops: " + stack.peek());

        stack.pop();
        stack.pop();
    }
}
