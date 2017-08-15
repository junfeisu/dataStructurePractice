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
        SingleList<Integer> test = new SingleList<Integer>();
        Integer[] arr = {1, 3, 5, 2, 6};
        test.init(arr);
        test.consoleList();
        System.out.println("length is " + test.getLength());
        test.add(7);
        test.consoleList();
        System.out.println("length is " + test.getLength());
        test.remove(5);
        test.consoleList();
        System.out.println("length is " + test.getLength());
        test.reverse();
        test.consoleList();
        Node<Integer> walkNode = test.getHead();
        while (walkNode.next != null) {
            walkNode = walkNode.next;
        }
        walkNode.next = test.getHead().next;
        System.out.println("是否有环：" + test.hasLoop());
        System.out.println("环节点是：" + test.locateChainNode().val);
    }
}
