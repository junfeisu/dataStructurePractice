package SequenceQueue;

import java.util.Arrays;

/**
 * Created by sujunfei on 2017/8/16.
 */
interface Constant {
    int DEFAULT_SIZE = 5;
    int DEFAULT_INCREMENT = 1;
}

public class SequenceQueue<T> {
    // 队列的大小
    private int size;
    // 队列空间不足时扩充的增量
    private int increment;
    private Object[] eleData;
    // 队首位
    private int front = 0;
    // 队尾位
    private int rear = 0;

    // 按默认的size，increment初始化队列
    public SequenceQueue() {
        size = Constant.DEFAULT_SIZE;
        eleData = new Object[size];
        increment = Constant.DEFAULT_INCREMENT;
    }

    // 按照默认方式初始化队列，并给定一个初值
    public SequenceQueue(T ele) {
        this();
        eleData[0] = ele;
        rear++;
    }

    // 给定一个size去初始化队列，并给定初值
    public SequenceQueue(T ele, int initSize) {
        size = initSize;
        increment = Constant.DEFAULT_INCREMENT;
        eleData = new Object[size];
        eleData[0] = ele;
        rear++;
    }

    // 按给定的size，increment初始化队列，并给定一个初值
    public SequenceQueue(T ele, int initSize, int customIncremet) {
        increment = customIncremet;
        size = initSize;
        eleData = new Object[size];
        eleData[0] = ele;
        rear++;
    }

    // 清空队列
    public void clear() {
        for (int i = front; i < rear; i++) {
            eleData[i] = null;
        }
        front = rear = 0;
    }

    // 判断队列是否为空
    public boolean isEmpty() {
        return front == rear;
    }

    // 获取队列元素的个数
    public int getLength() {
        return rear - front;
    }

    // 入队，判断是否已满，满了就扩充
    public void enQueue(T data) {
        if (rear == size) {
            size += increment;
            eleData = Arrays.copyOf(eleData, size);
        }
        eleData[rear] = data;
        rear++;
    }

    // 出队
    public T deQueue() {
        if (isEmpty()) {
            return null;
        }

        T frontData = (T)eleData[front];
        eleData[front++] = null;

        return frontData;
    }

    // 获取队首
    public T getFront() {
        if (isEmpty()) {
            return null;
        }

        return (T)eleData[front];
    }

    // 打印队列内容
    public void consoleQueue() {
        if (isEmpty()) {
            System.out.print("这是一个空队列");
        } else {
            for (int i = front; i < rear; i++) {
                System.out.print(eleData[i] + " ");
            }
        }
        System.out.println("");
    }
}
