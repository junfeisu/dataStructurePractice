import java.util.ArrayList;

public class Solution {

    public static int countBitDiff(int m, int n) {
        ArrayList<Integer> mResult = translate(m);
        ArrayList<Integer> nResult = translate(n);
        int count = 0;
        int minLen = mResult.size() > nResult.size() ? nResult.size() : mResult.size();

        for (int i = 0; i < minLen; i++) {
            if (mResult.get(i) != nResult.get(i)) {
                count++;
            }
        }
        count += Math.abs(mResult.size() - nResult.size());

        return count;
    }

    public static ArrayList translate(int num) {
        ArrayList<Integer> result = new ArrayList<>();
        while (num > 1) {
            int remainder = num % 2;
            num = (int)num / 2;
            result.add(remainder);
        }
        result.add(num);

        return result;
    }

    public static void main(String[] args) {
        System.out.print("count is " + countBitDiff(12,16));
    }
}
