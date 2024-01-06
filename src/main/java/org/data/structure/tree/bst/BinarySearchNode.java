package org.data.structure.tree.bst;

public class BinarySearchNode<T> {
    private T data;
    private BinarySearchNode<T> leftNode;
    private BinarySearchNode<T> rightNode;

    public BinarySearchNode(T data) {
        this.data = data;
    }
}
