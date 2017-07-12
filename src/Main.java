/**
 * Created by sujunfei on 2017/7/12.
 */
public class Main {
    public static void main(String[] args) {
        int[] vals = {0, 1, 1, 2, 3};
        SingleListNode normalList = SingleList.init(vals);
        SingleListNode deletedList = SingleList.deleteDuplicate(normalList);
        SingleListNode temp = deletedList;
        while (deletedList != null) {
            System.out.println(deletedList.val);
            deletedList = deletedList.next;
        }
    }
}
