import SequenceList.SequenceList;

/**
 * Created by sujunfei on 2017/8/14.
 */
public class Main {
    public static void main(String[] args) {
        SequenceList<Integer> test = new SequenceList<Integer>();
        test.insert(0, 6);
        test.set(0, 32);
        System.out.println(test.get(0));
        System.out.print(test.locate(32));
    }
}
