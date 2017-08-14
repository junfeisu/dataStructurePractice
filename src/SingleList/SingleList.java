package SingleList;

/**
 * Created by sujunfei on 2017/8/14.
 */
public class SingleList<T> {
    private Node<T> head;

    public SingleList() {
        head = new Node<T>(null);
    }

    public Node<T> getHead() {
        return head;
    }

    public void clear(Node head) {
        head = null;
    }

    public boolean isEmpty(Node head) {
        return head == null;
    }

    // 在链表末尾插入节点
    public Node<T> add(T data) throws Exception {
        Node<T> head = getHead();
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> currentNode = head;
            Node<T> toInsertingNode = new Node<T>(data);
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = toInsertingNode;
            toInsertingNode.next = null;
        }

        return head;
    }

    // 删除节点
    public Node<T> remove(T data) throws Exception {
        Node<T> head = getHead();

        if (head == null) {
            return head;
        }

        Node<T> currentNode = head;
        Node<T> beforeNode = null;
        while (currentNode != null) {
            if (currentNode.val == data) {
                break;
            }
            beforeNode = currentNode;
            currentNode = currentNode.next;
        }
        if (beforeNode == null) {
            head = null;
        } else {
            beforeNode.next = currentNode.next;
        }

        return head;
    }

    // 获取链表长度
    public int getLength() {
        int len = 0;
        Node<T> head = getHead();
        Node<T> currentNode = head;

        while (currentNode != null) {
            len++;
            currentNode = currentNode.next;
        }

        return len;
    }

    // 初始化单链表
    public Node<T> init(T[] arr) {
        int arrSize = arr.length;
        if (arrSize == 0) {
            return null;
        }

        Node<T> head = getHead();
        head.val = arr[0];
        Node<T> currentNode = null;

        for (int i = 1; i < arrSize; i++) {
            Node<T> temp = new Node<T>(arr[i]);
            if (head.next == null) {
                head.next = temp;
            } else {
                currentNode.next = temp;
            }
            currentNode = temp;
        }

        return head;
    }

    // 翻转单链表
    public Node<T> reverse() {
        Node<T> head = getHead();

        if (head == null || head.next == null) {
            return head;
        }

        Node<T> prevNode = head;
        Node<T> curNode = head.next;
        Node<T> nextNode = null;

        while (curNode != null) {
            nextNode = curNode.next;
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;
        }

        head.next = null;
        head = prevNode;

        return head;
    }
}
