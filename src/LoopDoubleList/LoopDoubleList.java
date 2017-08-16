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
            head = null;
            return head;
        } else if (arrSize == 1) {
            head = new Node<T>(arr[0]);
            head.next = head;
            head.prev = head;
            return head;
        }

        head = new Node<T>(arr[0]);
        Node<T> curNode = null;
        for (int i = 1; i < arrSize; i++) {
            Node<T> temp = new Node<T>(arr[i]);
            if (i == 1) {
                head.next = temp;
                temp.prev = head;
            } else {
                curNode.next = temp;
                temp.prev = curNode;
            }
            curNode = temp;
            if (i == arrSize - 1) {
                curNode.next = head;
                head.prev = curNode;
            }
        }

        return head;
    }

    public int getLength() {
        if (head == null) {
            return 0;
        } else if (head.next == head) {
            return 1;
        }

        int len = 1;
        Node<T> walkNode = head;
        while (walkNode.next != head) {
            len++;
            walkNode = walkNode.next;
        }

        return len;
    }

    public Node<T> get(int index) {
        if (head == null || index < 1) {
            return null;
        }

        int count = 1;
        index = index % getLength();
        Node<T> walkNode = head;
        while (count != index && walkNode.next != head) {
            count++;
            walkNode = walkNode.next;
        }
        if (count != index) {
            return null;
        } else {
            return walkNode;
        }
    }

    public Node<T> insert(int index, T data) throws Exception {
        if (head == null) {
            head = new Node<T>(data);
            head.next = head;
            head.prev = head;
        } else {
            Node<T> walkNode = head;
            Node<T> insertNode = new Node<T>(data);
            int count = 1;
            index = index % getLength();

            while (count != index) {
                count++;
                walkNode = walkNode.next;
            }

            walkNode.prev.next = insertNode;
            insertNode.next = walkNode;
            insertNode.prev = walkNode.prev;
            walkNode.prev = insertNode;
            // 如果插在头结点的位置
            if (walkNode == head) {
                head = insertNode;
            }
        }

        return head;
    }

    public Node<T> remove(T data) {
        Node<T> deletedNode = null;
        if (head == null || (head.next == head && head.val != data)) {
            return deletedNode;
        } else if (head.next == head && head.val == data) {
            deletedNode = head;
            head = null;
        } else {
            Node<T> walkNode = head;
            while (walkNode.val != data && walkNode.next != head) {
                walkNode = walkNode.next;
            }

            if (walkNode.val == data) {
                deletedNode = walkNode;
                walkNode.prev.next = walkNode.next;
                walkNode.next.prev = walkNode.prev;
                if (walkNode == head) {
                    head = walkNode.next;
                }
            }
        }

        return deletedNode;
    }

    public void consoleList() {
        if (head == null) {
            System.out.print("该表是一个空表");
        } else {
            System.out.print(head.prev.val + "<-");
            Node<T> walkNode = head;
            while (walkNode.next != head) {
                System.out.print(walkNode.val + "<->");
                walkNode = walkNode.next;
            }
            System.out.print(walkNode.val + "->" + head.val);
        }
        System.out.println("");
    }
}
