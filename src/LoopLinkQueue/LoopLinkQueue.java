package LoopLinkQueue;

/**
 * Created by sujunfei on 2017/8/16.
 */
public class LoopLinkQueue<T> {
    private Node<T> front;
    private Node<T> rear;

    public LoopLinkQueue() {
        front = rear = null;
    }

    public LoopLinkQueue(T data) {
        front = rear = new Node<T>(data);
        rear.next = front;
    }

    public void clear() {
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int getLength() {
        if (isEmpty()) {
            return 0;
        }

        int len = 1;
        Node<T> walkNode = front;
        while (walkNode.next != front) {
            len++;
            walkNode = walkNode.next;
        }

        return len;
    }

    public void enQueue(T data) {
        if (isEmpty()) {
            front = rear = new Node<T>(data);
            rear.next = front;
            return;
        }
        Node<T> insertNode = new Node<T>(data);
        rear.next = insertNode;
        insertNode.next = front;
        rear = insertNode;
    }

    public Node<T> deQueue() {
        if (isEmpty()) {
            return null;
        }
        Node<T> frontNode = front;
        front = front.next;
        rear.next = front;

        return frontNode;
    }

    public Node<T> getFront() {
        if (isEmpty()) {
            return null;
        }

        return front;
    }

    public void consoleQueue() {
        if (isEmpty()) {
            System.out.print("这是一个空队列");
        } else {
            Node<T> walkNode = front;
            while (walkNode.next != front) {
                System.out.print(walkNode.val + "->");
                walkNode = walkNode.next;
            }
            System.out.print(walkNode.val);
        }
        System.out.println("");
    }
}
