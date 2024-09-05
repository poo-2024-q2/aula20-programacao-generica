package stack;

import exceptions.StructureFullException;

public class ObjectStackTest {

    public static void testHeterogeneousStack() {
        ObjectStack stack = new ObjectStackImpl(5);
        
        try {
            stack.push(10);
            stack.push(20.0);
            stack.push("Hello");
        } catch (StructureFullException e) {
            e.printStackTrace();
        }
    }

    public static void testCastingOnPop() {
        ObjectStack stack = new ObjectStackImpl(5);
        
        try {
            stack.push(10);
            stack.push(20.0);
            stack.push("Hello");
            
            System.out.println((int) stack.pop());
            System.out.println((double) stack.pop());
            System.out.println((double) stack.pop());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testHeterogeneousStack();
        testCastingOnPop();
        
    }
}
