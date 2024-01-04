package org.data.structure.tree.avl;

public class AVLNode<T> {
    private T data;
    private AVLNode<T> leftNode;
    private AVLNode<T> rightNode;
    private Integer balancingFactor;

    public AVLNode(T data) {
        this.data = data;
        this.balancingFactor = 1;
    }
}

