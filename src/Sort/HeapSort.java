package Sort;

/**
 * Created by sujunfei on 2017/8/23.
 */
public class HeapSort {
    public int[] maxHeapify(int[] arr, int start, int size) {
        int arrLen = arr.length;
        if (arrLen == 1 || start >= arrLen) {
            return arr;
        }

        int leftChildIndex = 2 * start + 1;
        int rightChildIndex = 2 * start + 2;
        int maxIndex;

        if (leftChildIndex < size && arr[leftChildIndex] > arr[start]) {
            maxIndex = leftChildIndex;
        } else {
            maxIndex = start;
        }

        if (rightChildIndex < size && arr[rightChildIndex] > arr[maxIndex]) {
            maxIndex = rightChildIndex;
        }

        if (maxIndex != start) {
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[start];
            arr[start] = temp;
            maxHeapify(arr, maxIndex, size);
        }

        return arr;
    }

    public int[] buildMaxHeap(int[] arr) {
        int arrLen = arr.length;
        if (arrLen == 0 || arrLen == 1) {
            return arr;
        }

        for (int i = arrLen / 2 - 1; i >= 0; i--) {
            arr = maxHeapify(arr, i, arrLen);
        }

        return arr;
    }

    public int[] sort(int[] waitSortArr) {
        int waitSortArrLen = waitSortArr.length;
        if (waitSortArrLen == 0 || waitSortArrLen == 1) {
            return waitSortArr;
        }

        waitSortArr = buildMaxHeap(waitSortArr);
        consoleArr(waitSortArr);

        for (int i = 0; i < waitSortArr.length; i++) {
            int temp = waitSortArr[0];
            waitSortArr[0] = waitSortArr[waitSortArrLen - 1];
            waitSortArr[waitSortArrLen - 1] = temp;
            waitSortArrLen--;
            waitSortArr = maxHeapify(waitSortArr, 0, waitSortArrLen);
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
