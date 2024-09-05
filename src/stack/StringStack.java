package stack;

import exceptions.StructureEmptyException;
import exceptions.StructureFullException;

public interface StringStack {
    void push(String element) throws StructureFullException;
    String pop() throws StructureEmptyException;
    String top() throws StructureEmptyException;
    int size();
    int capacity();
    boolean isEmpty();
    boolean isFull();
}
