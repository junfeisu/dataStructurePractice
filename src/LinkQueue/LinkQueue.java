package LinkQueue;

/**
 * Created by sujunfei on 2017/8/16.
 */
public class LinkQueue<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size = 0;

    // 初始化一个空链队
    public LinkQueue() {
        front = rear = null;
        size = 0;
    }

    // 给一个初始值初始化链队
    public LinkQueue(T data) {
        front = rear = new Node<T>(data);
        size++;
    }

    // 判断队列是否为空
    public boolean isEmpty() {
        return front == null;
    }

    // 请空队列
    public void clear() {
        front = rear = null;
        size = 0;
    }

    // 获取队列元素个数
    public int getLength() {
        return size;
    }

    // 进队
    public void enQueue(T data) {
        if (isEmpty()) {
            front = rear = new Node<T>(data);
            size++;
        } else {
            Node<T> insertNode = new Node<T>(data);
            rear.next = insertNode;
            rear = insertNode;
            size++;
        }
    }

    // 出队
    public Node<T> deQueue() {
        if (isEmpty()) {
            return null;
        }

        Node<T> frontNode = front;
        front = front.next;
        size--;

        return frontNode;
    }

    // 获取队首节点
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
            while (walkNode != rear) {
                System.out.print(walkNode.val + "->");
                walkNode = walkNode.next;
            }
            System.out.print(rear.val);
        }

        System.out.println("");
    }
}
