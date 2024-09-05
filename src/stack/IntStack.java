package stack;

import exceptions.StructureEmptyException;
import exceptions.StructureFullException;

public interface IntStack {    
    void push(int element) throws StructureFullException;
    int pop() throws StructureEmptyException;    
    int top() throws StructureEmptyException;
    int size();
    int capacity();
    boolean isEmpty();
    boolean isFull();
}
