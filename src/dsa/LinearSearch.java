public class LinearSearch {
    public static void main(String[] args) {
        int[] marks = { 85, 90, 72, 60, 95 };
        int target = 60;
        int foundAt = -1; // -1 means "not found"

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == target) {
                foundAt = i;
                break;
            }

        }

        if (foundAt == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index " + foundAt);
        }

        // Reverse(Print backwards, and swap in place)
        for (int i = marks.length - 1; i > 0; i--) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}