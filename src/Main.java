import DoubleLinkList.DoubleLinkList;
import LoopDoubleList.LoopDoubleList;
import LoopSingleList.LoopSingleList;
import SequenceList.SequenceList;
import SingleList.SingleList;
import SingleList.Node;

/**
 * Created by sujunfei on 2017/8/14.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        /**
         测试顺序表
         */
//        SequenceList<Integer> test = new SequenceList<Integer>();
//        test.insert(0, 6);
//        test.set(0, 32);
//        System.out.println(test.get(0));
//        System.out.print(test.locate(32));
        /**
         测试单链表
         */
//        SingleList<Integer> test = new SingleList<Integer>();
//        Integer[] arr = {1, 3, 5, 2, 6};
//        test.init(arr);
//        test.consoleList();
//        System.out.println("init length is " + test.getLength());
//        test.add(7);
//        test.consoleList();
//        System.out.println("add length is " + test.getLength());
//        test.remove(1);
//        test.consoleList();
//        System.out.println("remove length is " + test.getLength());
//        test.reverse();
//        test.consoleList();
//        Node<Integer> walkNode = test.getHead();
//        while (walkNode.next != null) {
//            walkNode = walkNode.next;
//        }
//        walkNode.next = test.getHead().next;
//        System.out.println("是否有环：" + test.hasLoop());
//        System.out.println("环节点是：" + test.locateChainNode().val);
        /**
         * 测试双链表
         */
//        DoubleLinkList<Integer> test = new DoubleLinkList<Integer>();
//        System.out.println("是否为空列表：" + test.isEmpty());
//        Integer[] arr = {1};
//        test.init(arr);
//        System.out.println("初始化的链表为:");
//        test.consoleList();
//        System.out.println("初始化链表的长度为：" + test.getLength());
//
//        test.remove(1);
//        System.out.println("删除后的链表为：");
//        test.consoleList();
//        System.out.println("删除后的链表长度为：" + test.getLength());
//
//        test.insert(1, 2);
//        test.insert(1, 3);
//        test.insert(2, 4);
//        System.out.println("插入后的链表是：");
//        test.consoleList();
//
//        System.out.println("第一个节点的值为：" + test.get(1).val);
//
//        test.reverse();
//        System.out.println("翻转后的列表为：");
//        test.consoleList();
//
//        System.out.println("是否为空列表：" +test.isEmpty());
//        test.clear();
//        System.out.print("清空后的列表为：");
//        test.consoleList();

        /**
         * 测试循环单链表
         */
//        LoopSingleList<Integer> test = new LoopSingleList<Integer>();
//        Integer[] arr = {1};
//        test.init(arr);
//        test.consoleList();
//
//        test.insert(1, 2);
//        test.insert(2, 3);
//        test.consoleList();
//
//        test.remove(1);
//        test.consoleList();
//        test.insert(3, 1);
//        test.consoleList();
//
//        test.clear();
//        test.consoleList();
//
//        Integer[] more = {1, 2, 3, 4};
//        test.init(more);
//        test.consoleList();
//
//        System.out.println("第5个节点的值是：" + test.get(5).val);
        /**
         * 测试循环双链表
         */
        LoopDoubleList<Integer> test = new LoopDoubleList<Integer>();
        Integer[] arr = {1, 2, 3, 4};
        System.out.println("链表是否为空：" + test.isEmpty());
        test.init(arr);
        test.consoleList();
        System.out.println("链表的长度是：" + test.getLength());

        test.remove(1);
        test.consoleList();
        System.out.println("链表的长度是：" + test.getLength());

        test.insert(4, 6);
        test.consoleList();

        test.insert(3, 7);
        test.consoleList();

        System.out.println("第1个节点的值是：" + test.get(1).val);
        System.out.println("第2个节点的值是：" + test.get(2).val);

        System.out.println("链表是否为空：" + test.isEmpty());
        test.clear();
        System.out.println("链表是否为空：" + test.isEmpty());
    }
}
