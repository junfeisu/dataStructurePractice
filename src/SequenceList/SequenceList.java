package SequenceList;

/**
 * Created by sujunfei on 2017/8/14.
 */
interface Constant {
    int DEFAULT_SIZE = 100;
}

public class SequenceList<T> {
    private int length;
    private int listsize;
    private Object[] listArray;

    public SequenceList() {
        this.listsize = Constant.DEFAULT_SIZE;
        this.length = 0;
        this.listArray = new Object[Constant.DEFAULT_SIZE];
    }

    public void clear() {
        this.length = 0;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public int getLength() {
        return this.length;
    }

    public T get(int index) {
        if (index > this.length - 1) {
            return (T)this.listArray[this.length];
        } else if (index < 0) {
            return (T)this.listArray[0];
        }

        return (T)this.listArray[index];
    }

    public T set(int index, T data) {
        T old;
        if (index < 0) {
            old = (T)this.listArray[0];
            this.listArray[0] = data;
        } else if (index > this.length) {
            old = (T)this.listArray[this.length];
            this.listArray[this.length] = data;
        } else {
            old = (T)this.listArray[index];
            this.listArray[index] = data;
        }

        return old;
    }

    public boolean insert(int index, T data) {
        boolean insertStatus = true;
        int len = this.getLength();

        if (index < 0 || index > len || len == this.listsize) {
            return false;
        }

        for (int i = len; i > index; i--) {
            this.listArray[i] = this.listArray[i - 1];
        }

        System.out.println(this.listArray);

        this.listArray[index] = data;
        this.length++;

        return insertStatus;
    }

    public T remove(int index) {
        T removedItem;
        int len = this.getLength();
        if (index < 0) {
            removedItem = (T)this.listArray[0];
            for (int i = 1; i < len; i++) {
                this.listArray[i - 1] = this.listArray[i];
            }
            this.length--;
        } else if (index > len) {
            removedItem = (T)this.listArray[len];
            this.length--;
        } else {
            removedItem = (T)this.listArray[index];
            for (int i = index; i < len; i++) {

            }
        }

        return removedItem;
    }

    public int locate(T data) {
        int index = -1;
        int len = this.getLength();
        for (int i = 0; i < len; i++) {
            if (this.listArray[i] == data) {
                index = i;
                break;
            }
        }

        return index;
    }
}
