package LinkStack;

/**
 * Created by sujunfei on 2017/8/16.
 */
public class LinkStack<T> {
    // 链栈中节点数量
    private int size = 0;
    private Node<T> top;

    public LinkStack() {
        top = null;
    }

    public LinkStack(T data) {
        top = new Node<T>(data);
    }

    public void clear() {
        top = null;
        size = 0;
    }

    public int getLength() {
        return size;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T data) {
        Node<T> newTop = new Node<T>(data);
        newTop.next = top;
        top = newTop;
        size++;
    }

    public Node<T> pop() {
        if (isEmpty()) {
            return null;
        }

        Node<T> popedNode = top;
        top = top.next;
        size--;

        return popedNode;
    }

    public Node<T> getPeek() {
        if (isEmpty()) {
            return null;
        }

        return top;
    }

    public void consoleStack() {
        if (isEmpty()) {
            System.out.println("这是一个空栈");
        } else {
            Node<T> walkNode = top;
            while (walkNode != null) {
                if (walkNode.next == null) {
                    System.out.print(walkNode.val);
                } else {
                    System.out.print(walkNode.val + "->");
                }
                walkNode = walkNode.next;
            }
        }
        System.out.println("");
    }
}
