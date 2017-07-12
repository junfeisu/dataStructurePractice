/**
 * Created by sujunfei on 2017/7/11.
 */
public class SingleList {

    public static int getListLength(SingleListNode head) {
        int count = 0;
        if (head == null) {
            count = 0;
        } else if (head.next == null) {
            count = 1;
        } else {
            SingleListNode walkNode = head;
            while (walkNode != null) {
                count++;
                walkNode = walkNode.next;
            }
        }

        return count;
    }
    // 翻转整个单链表
    public static SingleListNode reverse(SingleListNode head) {
        if (head == null) {
            return head;
        }

        SingleListNode pre = head;
        SingleListNode cur = head.next;
        SingleListNode next = null;

        while (cur != null) {
            next = cur.next;
            cur.next = pre;

            pre = cur;
            cur = next;
        }

        head.next = null;
        head = pre;

        return head;
    }

    // 翻转单链表的指定节点
    public static SingleListNode reverseBetween(int m, int n, SingleListNode head) {
        if (head == null) {
            return head;
        }

        int count = 0;
        SingleListNode temp = head;
        SingleListNode pre = null;
        SingleListNode cur = null;
        SingleListNode next = null;
        SingleListNode startPre = null;

        // find the start
        while (temp != null && count < m) {
            count++;
            if (count == m - 1) {
                startPre = temp;
                temp = temp.next;
            } else if (count == m) {
                pre = temp;
                cur = temp.next;
            } else {
                temp = temp.next;
            }
        }

        count = 0;
        while (count < n - m ) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
            count++;
        }

        temp.next = next;
        if (m > 1) {
            startPre.next = pre;
        } else {
            head = pre;
        }

        return head;
    }

    // 初始化单链表
    public static SingleListNode init(int[] vals) {
        int valsSize = vals.length;
        if (valsSize == 0) {
            return null;
        } else {
            SingleListNode node = new SingleListNode(vals[0]);
            SingleListNode cur = null;
            for (int i = 1; i < valsSize; i++) {
                SingleListNode temp = new SingleListNode(vals[i]);
                if (i == 1) {
                    node.next = temp;
                } else {
                    cur.next = temp;
                }
                cur = temp;
            }
            return node;
        }
    }

    // 用插入排序对链表排序
    public static SingleListNode insertSort(SingleListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        SingleListNode walkNode = head.next;
        SingleListNode lastInOderNode = head;
        SingleListNode temp = null;

        while (walkNode != null) {
            if (walkNode.val >= lastInOderNode.val) {
                lastInOderNode = walkNode;
                walkNode = walkNode.next;
                continue;
            } else {
                SingleListNode h = head;
                temp = walkNode;
                if (temp.val < h.val) {
                    lastInOderNode.next = walkNode.next;
                    temp.next = head;
                    head = temp;
                    walkNode = lastInOderNode.next;
                    continue;
                } else {
                    while (h.next != null && h.next != temp) {
                        if (h.next.val > temp.val) {
                            lastInOderNode.next = walkNode.next;
                            temp.next = h.next;
                            h.next = temp;
                            walkNode = lastInOderNode.next;
                            break;
                        }
                        h = h.next;
                    }
                }
            }
        }

        return head;
    }

    // 归并排序(时间复杂度为O(nlogn),空间复杂度为O(n))
    public static SingleListNode mergeSort(SingleListNode head) {


        return head;
    }

    public static SingleListNode quickSort(SingleListNode head) {
        int i = 0;


        return head;
    }
}
