package SequenceStack;
import java.util.Arrays;

/**
 * Created by sujunfei on 2017/8/16.
 */
interface Constant {
    int DEFAULT_SIZE = 10;
    int DEFAULT_INCREMENT = 1;
}

public class SequenceStack<T> {
    // 栈的大小
    private int size;
    // 栈空间不足每次增加的增量
    private int increment;
    // 存放栈内的数据
    private Object[] elementData;
    // 栈内数据的数目
    private int length = 0;

    // 按默认的size，increment初始化栈
    public SequenceStack() {
        this.size = Constant.DEFAULT_SIZE;
        this.elementData = new Object[size];
        this.increment = Constant.DEFAULT_INCREMENT;
    }

    // 按默认初始化栈，并给定一个初值
    public SequenceStack(T ele) {
        this();
        this.elementData[0] = ele;
        this.length++;
    }

    // 按照给定的size初识化栈，并给定初值
    public SequenceStack(T ele, int initSize) {
        this.size = initSize;
        this.elementData = new Object[size];
        this.elementData[0] = ele;
        this.length++;
    }

    // 按照给定的size，increment初始化栈，并给定一个初值
    public SequenceStack(T ele, int initSize, int customIncrement) {
        this.increment = customIncrement;
        this.size = initSize;
        this.elementData = new Object[size];
        this.elementData[0] = ele;
        this.length++;
    }

    // 清空栈内数据
    public void clear() {
        for (int i = 0; i < length; i++) {
            elementData[i] = null;
        }
        length = 0;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    // 如果栈已满就扩充栈
    public void push(T data) {
        if (length == size) {
            size += increment;
            elementData = Arrays.copyOf(elementData, size);
        }
        elementData[length] = data;
        length++;
    }

    public T pop() {
        if (length == 0) {
            return null;
        }
        T data = (T)elementData[length - 1];
        elementData[--length] = null;
        return data;
    }

    public T getPeek() {
        if (length == 0) {
            return null;
        }
        T data = (T)elementData[length - 1];
        return data;
    }

    public void consoleStack() {
        if (length == 0) {
            System.out.print("这是一个空栈");
        } else {
            System.out.print("从栈顶到栈底的顺序：");
            for (int i = length - 1; i >= 0; i--) {
                System.out.print(elementData[i] + " ");
            }
        }
        System.out.println("");
    }
}
