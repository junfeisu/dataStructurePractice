package Sort;

/**
 * Created by sujunfei on 2017/8/21.
 */
public class BarrelSort {
    private int minNum = 0;
    private int maxNum = 10;

    public void setMinNum(int minVal) {
        minNum = minVal;
    }

    public void setMaxNum(int maxVal) {
        maxNum = maxVal;
    }

    // 桶排序
    public int[] sort(int[] waitSortArr) {
        int waitSortArrLen = waitSortArr.length;
        if (waitSortArrLen == 0 || waitSortArrLen == 1) {
            return waitSortArr;
        }

        int[] barrels = new int[maxNum - minNum + 1];
        for (int i = minNum; i <= maxNum; i++) {
            barrels[i] = 0;
        }

        for (int j = 0; j < waitSortArrLen; j++) {
            barrels[waitSortArr[j]]++;
        }

        return barrels;
    }

    // 有重复的就不打印
    public void consoleArr(int[] arr) {
        for (int m = minNum; m <= maxNum; m++) {
            if (arr[m] == 1) {
                System.out.print(m + " ");
            }
        }
    }
}
