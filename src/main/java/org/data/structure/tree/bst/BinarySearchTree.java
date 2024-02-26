package org.data.structure.tree.bst;

import org.data.structure.ComparisonResults;
import org.data.structure.tree.BasicTreeNode;
import org.data.structure.tree.BasicTreeStructure;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.Consumer;

public class BinarySearchTree<T> extends BasicTreeStructure<T> {
    public BinarySearchTree(Comparator<T> comparator) {
        super(comparator);
    }

    @Override
    public Boolean insert(BasicTreeNode<T> node) {
        return null;
    }

    @Override
    public Boolean contains(BasicTreeNode<T> node) {
        T dataOfNodeToBeChecked = node.getData();
        BasicTreeNode<T> nodeToBeCompared = getRoot();

        while (!Objects.isNull(nodeToBeCompared)) {
            ComparisonResults comparisonResults = treeService.compareNodeData(
                    dataOfNodeToBeChecked,
                    nodeToBeCompared.getData(),
                    comparator
            );
            switch (comparisonResults) {
                case LESS -> nodeToBeCompared = nodeToBeCompared.getLeftNode();
                case MORE -> nodeToBeCompared = nodeToBeCompared.getRightNode();
                case EQUAL -> {
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.FALSE;
    }

    @Override
    public Boolean delete(BasicTreeNode<T> node) {
        return null;
    }

    @Override
    public Integer getHeight() {
        return null;
    }

    @Override
    public void traverseInOrderAndPerformAction(Consumer<T> actionToPerform) {

    }

    @Override
    public void traverseInPreOrderAndPerformAction(Consumer<T> actionToPerform) {

    }

    @Override
    public void traverseInPostOrderAndPerformAction(Consumer<T> actionToPerform) {

    }

    @Override
    public void traverseInLevelOrderAndPerformAction(Consumer<T> actionToPerform) {

    }

    @Override
    public String toString() {
        return null;
    }
}
