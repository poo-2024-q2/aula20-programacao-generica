package util;

public class ArraysUtilTest {

    public static void testEquals() {
        Integer[] v1 = {1, 2, 3, 4};
        String[] v2 = {"hello", "wonderful", "world"};

        System.out.println(ArraysUtil.equals(v1, new Integer[]{1, 2, 3, 4, 4}));
        System.out.println(ArraysUtil.equals(v1, new Integer[]{1, 2, 3, 4}));
        System.out.println(ArraysUtil.equals(v2, new String[]{"hello", "wonderful", "world"}));
        System.out.println(ArraysUtil.equals(v2, new String[]{"hello", "wondErful", "world"}));
    }

    public static void testSort() {
        Integer[] v4 = {5, 4, 8, 1};
        String[] v5 = {"abc", "adf", "1re"};

        System.out.println(ArraysUtil.toString(v4));
        System.out.println(ArraysUtil.toString(v5));
        ArraysUtil.sort(v4);
        ArraysUtil.sort(v5);
        System.out.println(ArraysUtil.toString(v4));
        System.out.println(ArraysUtil.toString(v5));
    }

    public static void testToString() {
        Integer[] v1 = {1, 2, 3, 4};
        Double[] v2 = {1.0, 2.0, 3.0, 4.0};
        String[] v3 = {"hello", "wonderful", "world"};

        System.out.println(ArraysUtil.toString(v1));
        System.out.println(ArraysUtil.toString(v2));
        System.out.println(ArraysUtil.toString(v3));
    }
    
    public static void main(String[] args) {
        // testEquals();
        testSort();
        // testToString();
    }
}
