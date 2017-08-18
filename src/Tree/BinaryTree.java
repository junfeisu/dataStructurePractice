package Tree;

import SequenceStack.SequenceStack;

/**
 * Created by sujunfei on 2017/8/17.
 */
public class BinaryTree<T> {
    // 二叉树的根节点
    private Node<T> root;

    public Node<T> getRoot() {
        return root;
    }

    // 初始化一颗空树
    public BinaryTree() {
        root = null;
    }

    // 初始化只有一个节点的二叉树
    public BinaryTree(T data) {
        root = new Node<>(data);
    }

    // 判断二叉树是否为空
    public boolean isEmpty() {
        return root == null;
    }

    // 清空二叉树
    public void clear() {
        root = null;
    }

    /**
     * 按层级方式初始化
     * 左子节点的index为2(i+1)-1，右子节点的index为2(i+1)，i为父节点的index
     * 没有的节点就补充null
     */
    public Node<T> initTree(T[] arr, int index) {
        int arrSize = arr.length;
        if (index >= arrSize) {
            return root;
        } else {
            if (arr[index] == null) {
                return null;
            }
            Node<T> currentNode = new Node<>(arr[index]);
            if (index == 0) {
                root = currentNode;
            }
            currentNode.leftChild = 2 * index + 1 >= arrSize ? null : initTree(arr, 2 * index + 1);
            currentNode.rightChild = 2 * index + 2 >= arrSize ? null : initTree(arr, 2 * index + 2);
            return currentNode;
        }
    }

    // 初始化二叉树
    public void init(T[] arr) {
        int arrSize = arr.length;
        if (arrSize == 0) {
            root = null;
        } else if (arrSize == 1) {
            root = new Node<>(arr[0]);
        } else {
            root = initTree(arr, 0);
        }
    }

    // 递归实现中序遍历二叉树
    public void inOrderTraverse(Node<T> parentNode) {
        if (parentNode != null) {
            inOrderTraverse(parentNode.leftChild);
            System.out.println(parentNode.val + " ");
            inOrderTraverse(parentNode.rightChild);
        }
    }

    // 递归实现前序遍历二叉树
    public void preOrderTraverse(Node<T> parentNode) {
        if (parentNode != null) {
            System.out.println(parentNode.val + " ");
            preOrderTraverse(parentNode.leftChild);
            preOrderTraverse(parentNode.rightChild);
        }
    }

    // 递归实现后序遍历二叉树
    public void postOrderTraverse(Node<T> parentNode) {
        if (parentNode != null) {
            postOrderTraverse(parentNode.leftChild);
            postOrderTraverse(parentNode.rightChild);
            System.out.println(parentNode.val + " ");
        }
    }

    // 非递归实现前序遍历
    public void preOrder() {
        SequenceStack<Node> parentStack = new SequenceStack<Node>();
        Node<T> walkNode = root;
        while (walkNode != null) {
            System.out.println(walkNode.val + " ");
            if (walkNode.leftChild != null) {
                parentStack.push(walkNode);
                walkNode = walkNode.leftChild;
            } else {
                if (parentStack.isEmpty()) {
                    if (walkNode.rightChild == null) {
                        return;
                    }
                    walkNode = walkNode.rightChild;
                } else {
                    Node<T> lastParentNode = parentStack.pop();
                    while (!parentStack.isEmpty() && lastParentNode.rightChild == null) {
                        lastParentNode = parentStack.pop();
                    }
                    if (lastParentNode == null) {
                        return;
                    }
                    walkNode = lastParentNode.rightChild;
                }
            }
        }
    }

    // 非递归实现中序遍历
    public void inOrder() {
        SequenceStack<Node> parentStack = new SequenceStack<Node>();
        Node<T> walkNode = root;
        while (walkNode != null) {
            if (walkNode.leftChild != null) {
                parentStack.push(walkNode);
                walkNode = walkNode.leftChild;
            } else {
                System.out.println(walkNode.val + " ");
                if (parentStack.isEmpty()) {
                    if (walkNode.rightChild == null) {
                        return;
                    }
                    walkNode = walkNode.rightChild;
                } else {
                    Node<T> lastParentNode = parentStack.pop();
                    System.out.println(lastParentNode.val + " ");
                    while (!parentStack.isEmpty() && lastParentNode.rightChild == null) {
                        lastParentNode = parentStack.pop();
                        System.out.println(lastParentNode.val + " ");
                    }
                    if (lastParentNode == null) {
                        return;
                    }
                    walkNode = lastParentNode.rightChild;
                }
            }
        }
    }

    // 非递归实现后序遍历
    public void postOrder() {
        SequenceStack<Node> parentStack = new SequenceStack<Node>();
        Node<T> walkNode = root;
        int count = 0;
        while (walkNode != null) {
            if (walkNode.leftChild != null) {
                parentStack.push(walkNode);
                walkNode = walkNode.leftChild;
            } else {
//                Node<T> lastParentNode = parentStack.getPeek();
//                count++;
//                if (lastParentNode.rightChild != null && lastParentNode.rightChild.leftChild == null && lastParentNode.rightChild.rightChild == null) {
//                    System.out.println(lastParentNode.rightChild.val + " ");
//                    for (int i = 0; i < count; i++) {
//                        lastParentNode = parentStack.pop();
//                        System.out.println(lastParentNode.val + " ");
//                    }
//                    count = 0;
//                    walkNode = parentStack.pop();
//                    if (walkNode == null) {
//                        return;
//                    }
//                    if (walkNode.rightChild != null) {
//                        walkNode = walkNode.rightChild;
//                    }
//                }

            }
        }
    }

    // 获取二叉树的深度
    public int getDepth(Node<T> parentNode) {
        if (parentNode == null) {
            return 0;
        }
        int leftDepth = getDepth(parentNode.leftChild);
        int rightDepth = getDepth(parentNode.rightChild);

        return Math.max(leftDepth, rightDepth) + 1;
    }

    /**
     * 通过递归左子树和右子树的，分别得到左子树和右子树的节点数，当然他们同时包括了根节点
     * 所以最终的结果减去计算过俩次的根节点的多余一次就是二叉树的节点数
     */
    public int getNodesNum(Node<T> parentNode) {
        if (parentNode == null) {
            return 1;
        }

        int leftNums = getNodesNum(parentNode.leftChild);
        int rightNums = getNodesNum(parentNode.rightChild);

        return leftNums + rightNums;
    }

    // 判断二叉树是不是完全二叉树
//    public boolean isCompletedBinaryTree() {
//
//    }

    public void consoleBinaryTree() {
        if (isEmpty()) {
            System.out.println("这是一颗空树");
        } else {
            inOrder();
//            inOrderTraverse(root);
//            postOrderTraverse(root);
//            inOrderTraverse(root);
        }
        System.out.println("");
    }
}
