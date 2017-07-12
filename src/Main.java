/**
 * Created by sujunfei on 2017/7/12.
 */
public class Main {
    public static void main(String[] args) {
        int[] vals = {2, 1, 4, 3, 6, 5};
        SingleListNode normalList = SingleList.init(vals);
//        SingleListNode reverseList = SingleList.reverse(normalList);
        SingleListNode insertSortList = SingleList.insertSort(normalList);
        SingleListNode temp = insertSortList;

        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
