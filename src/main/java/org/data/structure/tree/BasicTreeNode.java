package org.data.structure.tree;

public abstract class BasicTreeNode<T> {
    private T data;
    private BasicTreeNode<T> leftNode;
    private BasicTreeNode<T> rightNode;

    private BasicTreeNode() {}
    protected BasicTreeNode(T data) {
        this();
        this.data = data;
    }

    public void removeData() {
        this.data = null;
    }
    public void removeLeftNode() {
        this.leftNode = null;
    }
    public void removeRightNode() {
        this.rightNode = null;
    }

    public T getData() {
        return this.data;
    }
    public BasicTreeNode<T> getLeftNode() {
        return this.leftNode;
    }
    public  BasicTreeNode<T> getRightNode() {
        return this.rightNode;
    }

    public void setLeftNode(BasicTreeNode<T> leftNode) {
        this.leftNode = leftNode;
    }
    public void setRightNode(BasicTreeNode<T> rightNode) {
        this.rightNode = rightNode;
    }
}
