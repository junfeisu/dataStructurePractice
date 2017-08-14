package SingleList;

/**
 * Created by sujunfei on 2017/8/14.
 */
public class Node<T> {
    public T val;
    public Node next;

    public Node(T val) {
        this.val = val;
        this.next = null;
    }
}
