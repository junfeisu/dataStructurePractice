package Sort;

/**
 * Created by sujunfei on 2017/8/23.
 */
public class QuickSort {
    public int[] sort(int[] waitSortArr, int start, int end) {
        int waitSortArrLen = waitSortArr.length;
        if (waitSortArrLen == 1) {
            return waitSortArr;
        }

        if (start < end) {
            int i = start, j = end, pivot = waitSortArr[start];
            while (i < j) {
                while (i < j && waitSortArr[j] <= pivot) {
                    j--;
                }

                while (i < j && waitSortArr[i] >= pivot) {
                    i++;
                }

                if (i < j) {
                    int temp = waitSortArr[i];
                    waitSortArr[i] = waitSortArr[j];
                    waitSortArr[j] = temp;
                }
            }
            waitSortArr[start] = waitSortArr[i];
            waitSortArr[i] = pivot;
            sort(waitSortArr, start, i - 1);
            sort(waitSortArr, i + 1, end);
        }

        return waitSortArr;
    }

    public void consoleArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
