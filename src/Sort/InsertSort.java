package Sort;

/**
 * Created by sujunfei on 2017/8/22.
 */
public class InsertSort {
    public int[] sort(int[] waitSortArr) {
        int waitSortArrLen = waitSortArr.length;
        if (waitSortArrLen == 0 || waitSortArrLen == 1) {
            return waitSortArr;
        }

        for (int i = 1; i < waitSortArrLen; i++) {
            int temp = waitSortArr[i];
            int j = i - 1;
            while (j >= 0 && waitSortArr[j] < temp) {
                waitSortArr[j + 1] = waitSortArr[j];
                j--;
            }
            waitSortArr[j + 1] = temp;
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
