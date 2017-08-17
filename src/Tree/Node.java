package Tree;

/**
 * Created by sujunfei on 2017/8/17.
 */
public class Node<T> {
    public T val;
    public Node leftChild;
    public Node rightChild;

    public Node(T data) {
        this.val = data;
        this.leftChild = null;
        this.rightChild = null;
    }
}
