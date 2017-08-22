package Sort;

/**
 * Created by sujunfei on 2017/8/22.
 */
public class SelectSort {
    public int[] sort(int[] waitSortArr) {
        int waitSortArrLen = waitSortArr.length;
        if (waitSortArrLen == 0 || waitSortArrLen == 1) {
            return waitSortArr;
        }

        for (int i = 0; i < waitSortArrLen - 1; i++) {
            int max = waitSortArr[i];
            int maxIndex = i;
            for (int j = i + 1; j < waitSortArrLen; j++) {
                if (waitSortArr[j] > max) {
                    max = waitSortArr[j];
                    maxIndex = j;
                }
            }
            waitSortArr[maxIndex] = waitSortArr[i];
            waitSortArr[i] = max;
        }

        return waitSortArr;
    }

    public void consoleArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
