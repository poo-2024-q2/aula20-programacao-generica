package stack;

import exceptions.StructureEmptyException;
import exceptions.StructureFullException;

public class StackImpl<T> implements Stack<T> {
    private T[] elements;
    private int top;

    @SuppressWarnings("unchecked")
    public StackImpl(int capacity) {
        elements = (T[]) new Object[capacity];
    }

    @Override
    public void push(T element) throws StructureFullException {
        if (isFull()) {
            throw new StructureFullException(capacity(), size());
        }
        elements[top++] = element;
    }

    @Override
    public T pop() throws StructureEmptyException {
        if (isEmpty()) {
            throw new StructureEmptyException(capacity(), size());
        }
        return elements[--top];
    }

    @Override
    public T top() throws StructureEmptyException {
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
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < top; i++) {
            sb.append(elements[i]);
            if (i < top - 1) {
                sb.append(", ");
            }
        }
        sb.append("] <- top");
        return sb.toString();
    }
}
