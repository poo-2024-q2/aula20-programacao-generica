package stack;

import exceptions.StructureEmptyException;
import exceptions.StructureFullException;

public interface DoubleStack {
    void push(double element) throws StructureFullException;
    double pop() throws StructureEmptyException; 
    double top() throws StructureEmptyException;
    int size();
    int capacity();
    boolean isEmpty();
    boolean isFull();
}
