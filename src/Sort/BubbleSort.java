package Sort;

/**
 * Created by sujunfei on 2017/8/21.
 */
public class BubbleSort {
    public int[] sort(int[] waitSortArr) {
        int waitSortArrLen = waitSortArr.length;
        if (waitSortArrLen == 0 || waitSortArrLen == 1) {
            return waitSortArr;
        }

        for (int i = 0; i < waitSortArrLen; i++) {
            for (int j = 1; j < waitSortArrLen - i; j++) {
                if (waitSortArr[j - 1] < waitSortArr[j]) {
                    int temp = waitSortArr[j - 1];
                    waitSortArr[j - 1] = waitSortArr[j];
                    waitSortArr[j] = temp;
                }
            }
        }

        return waitSortArr;
    }

    public int[] improvedSort(int[] waitSortArr) {
        int waitSortArrLen = waitSortArr.length;
        if (waitSortArrLen == 0 || waitSortArrLen == 1) {
            return waitSortArr;
        }
        boolean isExchanged = true;

        while (isExchanged) {
            isExchanged = false;
            for (int i = 1; i < waitSortArrLen; i++) {
                if (waitSortArr[i - 1] < waitSortArr[i]) {
                    int temp = waitSortArr[i];
                    waitSortArr[i] = waitSortArr[i - 1];
                    waitSortArr[i - 1] = temp;
                    isExchanged = true;
                }
            }
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
