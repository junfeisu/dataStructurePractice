package LoopSingleList;

/**
 * Created by sujunfei on 2017/8/15.
 */
public class LoopSingleList<T> {
    private Node<T> head;

    public LoopSingleList() {}

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
        } else if (arrSize == 1) {
            head = new Node<T>(arr[0]);
            head.next = head;
            return head;
        }

        head = new Node<T>(arr[0]);
        Node<T> currentNode = null;
        for (int i = 1; i < arrSize; i++) {
            Node<T> temp = new Node<T>(arr[i]);
            if (head.next == null) {
                head.next = temp;
            } else {
                currentNode.next = temp;
            }
            currentNode = temp;
            if (i == arrSize - 1) {
                currentNode.next = head;
            }
        }

        return head;
    }

    public int getLength() {
        int len = 0;
        Node<T> walkNode = head;
        if (head == null) {
            return len;
        } else if (head.next == head) {
            len = 1;
            return len;
        }
        while (walkNode.next != head) {
            len++;
            walkNode = walkNode.next;
        }

        return len;
    }

    // 在第index的位置上插入节点(index从1开始)
    public Node<T> insert(int index, T data) throws Exception {
        if (head == null) {
            head = new Node<T>(data);
            head.next = head;
            return head;
        } else if (index < 1) {
            return head;
        }

        Node<T> walkNode = head;
        Node<T> prevNode = null;
        int count = 1;
        index = index % getLength();
        while (index != count && walkNode.next != head) {
            prevNode = walkNode;
            walkNode = walkNode.next;
            count++;
        }

        if (index == count) {
            Node<T> insertNode = new Node<T>(data);
            insertNode.next = walkNode;
            if (prevNode == null) {
                Node<T> temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = insertNode;
                head = insertNode;
            } else {
                prevNode.next = insertNode;
            }
        }

        return head;
    }

    public Node<T> remove(T data) throws Exception {
        if (head == null || (head.next == head && head.val != data)) {
            return head;
        } else if (head.next == head && head.val == data) {
            head = null;
            return head;
        }

        Node<T> walkNode = head;
        Node<T> prevNode = null;
        while (walkNode.next != head && walkNode.val != data) {
            prevNode = walkNode;
            walkNode = walkNode.next;
        }

        if (walkNode.val == data) {
            Node<T> temp = head.next;
            if (prevNode == null) {
                while (temp.next != head) {
                    temp = temp.next;
                }

                temp.next = walkNode.next;
            } else {
                prevNode.next = walkNode.next;
            }
        }

        return head;
    }

    public Node<T> get(int index) {
        if (head == null || index < 1) {
            return null;
        }

        Node<T> walkNode = head;
        int count = 1;
        index = index % getLength();
        while (index != count && walkNode.next != head) {
            walkNode = walkNode.next;
            count++;
        }
        if (index != count) {
            return null;
        } else {
            return walkNode;
        }

    }

    public void consoleList() {
        if (head == null) {
            System.out.print("该链表是一个空表");
        } else {
            Node<T> walkNode = head;
            if (walkNode.next == head) {
                System.out.println(walkNode.val + "->" + walkNode.val);
                return;
            }
            while (walkNode.next != head) {
                System.out.print(walkNode.val + "->");
                walkNode = walkNode.next;
            }
            System.out.println(walkNode.val + "->" + head.val);
        }
        System.out.println("");
    }
}
