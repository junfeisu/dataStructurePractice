import DoubleLinkList.DoubleLinkList;
import LinkQueue.LinkQueue;
import LinkStack.LinkStack;
import LoopDoubleList.LoopDoubleList;
import LoopLinkQueue.LoopLinkQueue;
import LoopSingleList.LoopSingleList;
import SequenceList.SequenceList;
import SequenceQueue.SequenceQueue;
import SequenceStack.SequenceStack;
import SingleList.SingleList;
import Sort.*;
import Tree.Node;
import Tree.BinaryTree;

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
//        LoopDoubleList<Integer> test = new LoopDoubleList<Integer>();
//        Integer[] arr = {1, 2, 3, 4};
//        System.out.println("链表是否为空：" + test.isEmpty());
//        test.init(arr);
//        test.consoleList();
//        System.out.println("链表的长度是：" + test.getLength());
//
//        test.remove(1);
//        test.consoleList();
//        System.out.println("链表的长度是：" + test.getLength());
//
//        test.insert(4, 6);
//        test.consoleList();
//
//        test.insert(3, 7);
//        test.consoleList();
//
//        System.out.println("第1个节点的值是：" + test.get(1).val);
//        System.out.println("第2个节点的值是：" + test.get(2).val);
//
//        System.out.println("链表是否为空：" + test.isEmpty());
//        test.clear();
//        System.out.println("链表是否为空：" + test.isEmpty());
        /**
         * 测试顺序栈
         */
//        SequenceStack<Integer> test = new SequenceStack<Integer>();
//        System.out.println("是否为空栈：" + test.isEmpty());
//        test.consoleStack();
//        test.push(4);
//        test.push(3);
//        test.consoleStack();
//        test.pop();
//        test.push(2);
//        test.consoleStack();
//        System.out.println("栈的长度为：" + test.getLength());
//        System.out.println("栈顶元素为：" + test.getPeek());
        /**
         * 测试链栈
         */
//        LinkStack<Integer> test = new LinkStack<Integer>();
//        System.out.println("是否为空栈：" + test.isEmpty());
//        test.consoleStack();
//
//        test.push(3);
//        test.push(1);
//        test.push(5);
//        test.consoleStack();
//        System.out.println("栈内的元素个数是：" + test.getLength());
//
//        System.out.println("出栈的元素是：" + test.pop().val);
//        test.consoleStack();
//        System.out.println("栈顶元素是：" + test.getPeek().val);
//
//        test.clear();
//        test.consoleStack();
//        System.out.println("栈内的元素个数是：" + test.getLength());
        /**
         * 测试顺序队列
         */
//        SequenceQueue<Integer> test = new SequenceQueue<Integer>(5);
//        test.consoleQueue();
//        test.enQueue(2);
//        test.enQueue(1);
//        test.enQueue(3);
//        test.enQueue(4);
//        test.consoleQueue();
//
//        test.enQueue(6);
//        test.consoleQueue();
//
//        System.out.println("队列中元素个数是：" + test.getLength());
//        System.out.println("出队元素是：" + test.deQueue());
//        test.consoleQueue();
//        System.out.println("队首元素是：" + test.getFront());
//
//        test.clear();
//        System.out.println("队列中元素个数是：" + test.getLength());
//        test.consoleQueue();
        /**
         * 测试非循环链队
         */
//        LinkQueue<Integer> test = new LinkQueue<Integer>(6);
//        test.consoleQueue();
//        System.out.println("是否是空队列:" + test.isEmpty());
//
//        test.enQueue(4);
//        test.enQueue(9);
//        test.consoleQueue();
//
//        System.out.println("出队的元素是：" + test.deQueue().val);
//        test.consoleQueue();
//        System.out.println("队列中元素的个数是：" + test.getLength());
//        System.out.println("队首元素是：" + test.getFront());
//
//        test.clear();
//        test.consoleQueue();
//        System.out.println("是否是空队列:" + test.isEmpty());
        /**
         * 测试循环链队
         */
//        LoopLinkQueue<Integer> test = new LoopLinkQueue<Integer>(2);
//        test.consoleQueue();
//        System.out.println("是否是空队列:" + test.isEmpty());
//
//        test.enQueue(4);
//        test.enQueue(9);
//        test.consoleQueue();
//
//        System.out.println("出队的元素是：" + test.deQueue().val);
//        test.consoleQueue();
//        System.out.println("队列中元素的个数是：" + test.getLength());
//        System.out.println("队首元素是：" + test.getFront().val);
//
//        test.clear();
//        test.consoleQueue();
//        System.out.println("是否是空队列:" + test.isEmpty());
        /**
         * 测试二叉树
         */
//        BinaryTree<Integer> test = new BinaryTree<>();
//        Integer[] arr = {1, 2, 3, 4, 5, null, 7, 0, 8, 9, 6, null, null, 11, 12};
//        test.init(arr);
//        System.out.println("二叉树的深度为：" + test.getDepth(test.getRoot()));
//        int nodeNums = test.getNodesNum(test.getRoot()) - 1;
//        System.out.println("二叉树的节点数为：" + nodeNums);
//        test.consoleBinaryTree();
//        System.out.println("二叉树种最大节点是：" + test.getMaxNode(test.getRoot()).val);

        /**
         * 测试桶排序
         */
//        BarrelSort test = new BarrelSort();
//        int[] arr = {5, 2, 4, 1, 7, 9, 6, 7, 2};
//        test.consoleArr(test.sort(arr));

        /**
         * 测试冒泡排序
         */
//        BubbleSort test = new BubbleSort();
//        int[] arr = {5, 2, 4, 1, 7, 9, 6, 7, 2};
//        test.consoleArr(test.sort(arr));
//        test.consoleArr(test.improvedSort(arr));

        /**
         * 测试选择排序
         */
//        SelectSort test = new SelectSort();
//        int[] arr = {5, 2, 4, 1, 7, 9, 6, 7, 2};
//        test.consoleArr(test.sort(arr));

        /**
         * 测试插入排序
         */
//        InsertSort test = new InsertSort();
//        int[] arr = {5, 2, 4, 1, 7, 9, 6, 7, 2};
//        test.consoleArr(test.sort(arr));

        /**
         * 测试快速排序
         */
//        QuickSort test = new QuickSort();
//        int[] arr = {5, 2, 4, 1, 7, 9, 6, 7, 2};
//        int[] arr = {7, 6, 5, 4, 3, 2, 1};
//        test.consoleArr(test.sort(arr, 0, arr.length - 1));

        /**
         * 测试堆排序
         */
        HeapSort test = new HeapSort();
        int[] arr = {5, 2, 4, 1, 7, 9, 6, 7, 2};
        test.consoleArr(test.sort(arr));
    }
}
