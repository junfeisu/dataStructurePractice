package LoopDoubleList;

/**
 * Created by sujunfei on 2017/8/15.
 */
public class Node<T> {
    public T val;
    public Node next;
    public Node prev;

    public Node(T data) {
        this.val = data;
        this.next = null;
        this.prev = null;
    }
}
