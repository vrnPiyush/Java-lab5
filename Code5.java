import java.util.EmptyStackException;

class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void enqueue(int value) {
        if (rear == maxSize - 1) {
            System.out.println("Queue is full. Cannot enqueue element.");
            return;
        }
        queueArray[++rear] = value;
        nItems++;
    }

    public void dequeue() {
        if (nItems == 0) {
            throw new EmptyStackException();
        }
        int temp = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        System.out.println("Dequeue element is : "+temp);
    }

    public void peek() {
        if (nItems==0) {
            throw new EmptyStackException();
        }
        System.out.println("Queue Front is : "+ queueArray[front]);
    }

    

    
}

public class Code5 {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

       queue.peek();
       queue.dequeue();
       queue.dequeue();
       queue.peek();

    }
}
