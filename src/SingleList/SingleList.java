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
        int listLen = getLength();

        if (listLen == 0 || (listLen == 1 && head.val != data)) {
            return head;
        } else if (listLen == 1 && head.val == data) {
            head = null;
            return head;
        }

        Node<T> currentNode = head;
        Node<T> beforeNode = null;
        while (currentNode != null && currentNode.val != data) {
            beforeNode = currentNode;
            currentNode = currentNode.next;
        }
        if (beforeNode == null) {
            head = currentNode.next;
        } else {
            beforeNode.next = currentNode.next;
        }

        return head;
    }

    // 获取链表长度
    public int getLength() {
        int len = 0;
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

    // 判断是否有环
    public boolean hasLoop() {
        boolean result = false;

        Node<T> fast = head;
        Node<T> slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                result = true;
                break;
            }
        }

        return result;
    }

    /**
     碰撞节点到环节点的距离和头结点到环节点的距离是相等的
     */
    public Node<T> locateChainNode() {
        Node<T> fast = head;
        Node<T> slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public void consoleList() {
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
