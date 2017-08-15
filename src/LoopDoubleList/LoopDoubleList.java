package LoopDoubleList;

/**
 * Created by sujunfei on 2017/8/15.
 */
public class LoopDoubleList<T> {
    private Node<T> head;

    public LoopDoubleList() {}

    public Node<T> getHead() {
        return head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = null;
    }

    public Node<T> init(T[] arr) {
        int arrSize = arr.length;
        if (arrSize == 0) {
            return null;
        }

        return head;
    }

}
