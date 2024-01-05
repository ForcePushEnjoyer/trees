package org.data.structure.tree.redblack;

public class RedBlackNode<T> {
    private T data;
    private RedBlackNode<T> leftNode;
    private RedBlackNode<T> rightNode;
    private RedBlackNode<T> parentNode;
    private RedBlackEnum nodeColor;
    public RedBlackNode(T data) {
        this.data = data;
        this.nodeColor = RedBlackEnum.RED;
    }
}
