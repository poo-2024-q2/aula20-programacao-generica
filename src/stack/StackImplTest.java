package stack;

public class StackImplTest {
    public static void testStackDouble() {
        Stack<Double> stack = new StackImpl<Double>(5);

        try {
            stack.push(10.0);
            stack.push(20.0);
            stack.push(30.0);
            stack.push(40.0);
            stack.push(50.0);

            System.out.println(stack);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testStackString() {
        Stack<String> stack = new StackImpl<String>(5);

        try {
            stack.push("Hello");
            stack.push("World");
            stack.push("Java");
            stack.push("Programming");
            stack.push("Language");

            System.out.println(stack);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testStackDouble();
        testStackString();
    }
}
