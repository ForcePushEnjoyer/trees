package org.data.structure.tree;

public interface BasicTreeInterface<T> {
    Boolean insert(T node);
    Boolean contains(T node);
    Boolean delete(T node);
    Boolean isEmpty(T node);
}
