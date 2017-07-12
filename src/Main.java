/**
 * Created by sujunfei on 2017/7/12.
 */
public class Main {
    public static void main(String[] args) {
        int[] vals = {1, 2};
        SingleListNode normalList = SingleList.init(vals);

        System.out.println("normalList length is " + SingleList.getListLength(normalList));
    }
}
