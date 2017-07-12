/**
 * Created by sujunfei on 2017/7/12.
 */
public class Main {
    public static void main(String[] args) {
        int[] vals = {4, 19, 14, 5, 3, 1, 5, 8, 15, 11};
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
