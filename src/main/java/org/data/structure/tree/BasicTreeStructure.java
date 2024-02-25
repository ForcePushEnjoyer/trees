package org.data.structure.tree;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.Consumer;

public abstract class BasicTreeStructure<T> {
    protected Comparator<T> comparator;
    protected BasicTreeNode<T> root;
    protected Integer size = 0;

    private BasicTreeStructure() {}
    protected BasicTreeStructure(Comparator<T> comparator) {
        this();
        this.comparator = comparator;
    }

    public abstract Boolean insert(BasicTreeNode<T> node);
    public abstract Boolean contains(BasicTreeNode<T> node);
    public abstract Boolean delete(BasicTreeNode<T> node);
    public Boolean isEmpty() {
       return Objects.isNull(this.root);
    }
    public Integer getSize() {
        return this.size;
    }
    public BasicTreeNode<T> getRoot() {
        return this.root;
    }
    public abstract Integer getHeight();
    public BasicTreeNode<T> getMinimalElement() {
        BasicTreeNode<T> lesserNode = this.root;
        while (!Objects.isNull(lesserNode.getLeftNode())) {
            lesserNode = lesserNode.getLeftNode();
        }
        return lesserNode;
    }
    public BasicTreeNode<T> getMaximalElement() {
        BasicTreeNode<T> greaterNode = this.root;
        while (!Objects.isNull(greaterNode.getRightNode())) {
            greaterNode = greaterNode.getRightNode();
        }
        return greaterNode;
    }
    public abstract void traverseInOrderAndPerformAction(Consumer<T> actionToPerform);
    public abstract void traverseInPreOrderAndPerformAction(Consumer<T> actionToPerform);
    public abstract void traverseInPostOrderAndPerformAction(Consumer<T> actionToPerform);
    public abstract void traverseInLevelOrderAndPerformAction(Consumer<T> actionToPerform);
    public abstract String toString();
}
