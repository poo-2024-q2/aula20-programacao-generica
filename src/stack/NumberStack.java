package stack;

import exceptions.StructureEmptyException;
import exceptions.StructureFullException;

public interface NumberStack {
    void push(Number element) throws StructureFullException;
    Number pop() throws StructureEmptyException;
    Number top() throws StructureEmptyException;
    int size();
    int capacity();
    boolean isEmpty();
    boolean isFull();
}
