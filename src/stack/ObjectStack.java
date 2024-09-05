package stack;

import exceptions.StructureEmptyException;
import exceptions.StructureFullException;

public interface ObjectStack {
    void push(Object element) throws StructureFullException;
    Object pop() throws StructureEmptyException;
    Object top() throws StructureEmptyException;
    int size();
    int capacity();
    boolean isEmpty();
    boolean isFull();
}
