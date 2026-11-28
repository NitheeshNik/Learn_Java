import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // Snippet 3: should say "same marks" when both arrays have the same contents
        int[] first = { 1, 2, 3 };
        int[] second = { 1, 2, 3 };
        if (Arrays.equals(first, second)) {
            System.out.println("same marks");
        } else {
            System.out.println("different marks");
        }
    }
}