import java.util.EmptyStackException;

class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }
        stackArray[++top] = value;
    }

    public void pop() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        System.out.println("Popped Element is: " + stackArray[top--]);
        maxSize--;
    }

    public void peek() {
        if (top == -1) {
            throw new EmptyStackException();
        }
        System.out.println("Stack Top is: " + stackArray[top]);
    }
}

public class Code4 {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(50);
        stack.push(40);
        stack.push(30);
        stack.push(20);
        stack.push(10);

        stack.peek();
        stack.pop();
        stack.pop();
        stack.peek();
    }
}
