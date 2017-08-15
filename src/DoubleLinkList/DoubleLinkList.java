package DoubleLinkList;

/**
 * Created by sujunfei on 2017/8/15.
 */
public class DoubleLinkList<T> {
    private Node<T> head;

    public DoubleLinkList() {
        head = new Node<T>(null);
    }

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
            head = null;
        }

        head = new Node<T>(arr[0]);
        Node<T> currentNode = null;
        Node<T> prevNode = null;
        for (int i = 1; i < arrSize; i++) {
            Node<T> temp = new Node<T>(arr[i]);
            if (head.next == null) {
                head.next = temp;
                head.prev = prevNode;
            } else {
                currentNode.next = temp;
                currentNode.prev = prevNode;
            }
            prevNode = currentNode;
            currentNode = temp;
        }

        return head;
    }

    public int getLength() {
        int len = 0;
        Node<T> walkNode = getHead();
        while (walkNode != null) {
            len++;
            walkNode = walkNode.next;
        }

        return len;
    }

    public Node<T> insert(int index, T data) throws Exception {
        int listLen = getLength();
        if (index < 1 || index > listLen) {
            return head;
        }

        Node<T> walkNode = getHead();
        Node<T> prevNode = null;
        int count = 0;
        while (walkNode != null) {
            count++;
            if (count == index) {
                break;
            }
            prevNode = walkNode;
            walkNode = walkNode.next;
        }

        Node<T> insertedNode = new Node<T>(data);
        insertedNode.prev = prevNode;
        insertedNode.next = walkNode;
        walkNode.prev = insertedNode;

        if (prevNode == null) {
            head = insertedNode;
        }

        return head;
    }

    public Node<T> remove(T data) throws Exception {
        Node<T> deletedNode;
        int listLen = getLength();

        /**
         * 当链表为空或者只有一个节点并且该节点不是要删除的节点
         * 当链表只有一个节点并且该节点就是要删除的节点
         */
        if (listLen == 0 || (listLen == 1 && head.val != data)) {
            return null;
        } else if (listLen == 1 && head.val == data) {
            deletedNode = head;
            head = null;
            return deletedNode;
        }

        Node<T> walkNode = head;
        Node<T> prevNode = null;
        while (walkNode != null && walkNode.val != data) {
            prevNode = walkNode;
            walkNode = walkNode.next;
        }

        // 链表里面没有数据域为data的节点
        if (walkNode == null) {
            return null;
        } else {
            deletedNode = walkNode;
            /**
             * 要删除的节点是最后一个节点
             * 要删除的节点是头结点
             * 要删除的节点是中间节点
             */
            if (walkNode.next == null) {
                prevNode.next = null;
            } else if (walkNode == head) {
                walkNode.next.prev = null;
                head = walkNode.next;
            } else {
                prevNode.next = walkNode.next;
                walkNode.next.prev = prevNode;
            }
        }

        return deletedNode;
    }


}
