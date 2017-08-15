package DoubleLinkList;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created by sujunfei on 2017/8/15.
 */
public class DoubleLinkList<T> {
    private Node<T> head;

    public DoubleLinkList() {}

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
        if (head == null) {
            head = new Node<T>(data);
            return head;
        } else if (index < 1 || index > listLen) {
            return head;
        }

        Node<T> walkNode = head;
        Node<T> prevNode = null;
        int count = 1;
        while (walkNode != null && count != index) {
            count++;
            prevNode = walkNode;
            walkNode = walkNode.next;
        }

        Node<T> insertedNode = new Node<T>(data);
        insertedNode.prev = prevNode;
        insertedNode.next = walkNode;
        if (prevNode != null) {
            prevNode.next = insertedNode;
        }
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

    public Node<T> reverse() {
        if (head == null || head.next == null) {
            return head;
        }

        Node<T> prevNode = head;
        Node<T> currentNode = head.next;
        Node<T> nextNode = null;

        while (currentNode != null) {
            nextNode = currentNode.next;
            prevNode.prev = currentNode;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode.prev = nextNode;
            currentNode = nextNode;
        }

        prevNode.prev = null;
        head.next = null;
        head = prevNode;

        return head;
    }

    public Node<T> get(int index) {
        int listSize = getLength();
        if (index < 1 || index > listSize) {
            return null;
        }

        Node<T> searchedNode;
        Node<T> walkNode = head;

        int count = 1;
        while (walkNode != null && count != index) {
            count++;
            walkNode = walkNode.next;
        }

        if (walkNode != null) {
            searchedNode = walkNode;
        } else {
            searchedNode = null;
        }

        return searchedNode;
    }

    public void consoleList() {
        if (head == null) {
            System.out.print("该链表为空表");
        }
        Node<T> walkNode = head;
        while (walkNode != null) {
            if (walkNode.next == null) {
                System.out.print(walkNode.val + "->null");
            } else {
                System.out.print(walkNode.val + "->");
            }
            walkNode = walkNode.next;
        }

        System.out.println("");
    }
}
