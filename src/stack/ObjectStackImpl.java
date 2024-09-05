package stack;

import exceptions.StructureEmptyException;
import exceptions.StructureFullException;

public class ObjectStackImpl implements ObjectStack {
    private Object[] elements;
    private int top;

    public ObjectStackImpl(int capacity) {
        elements = new Object[capacity];
    }

    @Override
    public void push(Object element) throws StructureFullException {
        if (isFull()) {
            throw new StructureFullException(capacity(), size());
        }
        elements[top++] = element;
    }

    @Override
    public Object pop() throws StructureEmptyException {
        if (isEmpty()) {
            throw new StructureEmptyException(capacity(), size());
        }
        return elements[--top];
    }

    @Override
    public Object top() throws StructureEmptyException {
        if (isEmpty()) {
            throw new StructureEmptyException(capacity(), size());
        }
        return elements[top - 1];
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public int capacity() {
        return elements.length;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public boolean isFull() {
        return top == elements.length;
    }
    
}
