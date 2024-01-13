package org.data.structure.tree.bst;

import java.util.Comparator;

import org.data.structure.tree.BasicTreeInterface;

public class BinarySearchTree<T> implements BasicTreeInterface<BinarySearchNode<T>> {
    private Comparator<T> comparator;
    private BinarySearchNode<T> root;

    private BinarySearchTree() {}
    public BinarySearchTree(Comparator<T> comparator) {
        this();
        this.comparator = comparator;
    }
    public BinarySearchTree(Comparator<T> comparator, BinarySearchNode<T> root) {
        this();
        this.comparator = comparator;
        this.root = root;
    }

    @Override
    public Boolean insert(BinarySearchNode<T> node) {
        return null;
    }

    @Override
    public Boolean contains(BinarySearchNode<T> node) {
        return null;
    }

    @Override
    public Boolean delete(BinarySearchNode<T> node) {
        return null;
    }

    @Override
    public Boolean isEmpty(BinarySearchNode<T> node) {
        return null;
    }
}
