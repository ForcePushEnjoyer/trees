package org.data.structure.tree;

import org.data.structure.ComparisonResults;

import java.util.Comparator;

public class TreeService<T> {
    public ComparisonResults compareNodeData(T newData, T existingData, Comparator<T> comparator) {
        if (comparator.compare(newData, existingData) < 0) {
            return ComparisonResults.LESS;
        }
        if (comparator.compare(newData, existingData) > 0) {
            return ComparisonResults.MORE;
        }
        return ComparisonResults.EQUAL;
    }

}
