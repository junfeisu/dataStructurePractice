/**
 * Created by sujunfei on 2017/7/11.
 */
public class reverseSingleList {
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

        System.out.println("temp.val is " + temp.val);

        temp.next = next;
        if (m > 1) {
            startPre.next = pre;
        } else {
            head = pre;
        }

        return head;
    }

    // 初始化单链表
    public static SingleListNode init(int num) {
        SingleListNode node = new SingleListNode(0);
        SingleListNode cur = null;
        SingleListNode temp = null;
        for (int i = 1; i < num; i++) {
            temp = new SingleListNode(i);
            if (i == 1) {
                node.next = temp;
            } else {
                cur.next = temp;
            }
            cur = temp;
        }

        return node;
    }

    public static void main(String[] args) {
        SingleListNode normalList = init(5);
//        SingleListNode reverseList = reverse(normalList);
        SingleListNode reverseBetweenList = reverseBetween(1, 2, normalList);
        SingleListNode temp = reverseBetweenList;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
