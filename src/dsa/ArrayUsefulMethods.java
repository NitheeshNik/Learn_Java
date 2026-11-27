import java.util.Arrays;

public class ArrayUsefulMethods {
    public static void main(String[] args) {
        int[] nums = { 5, 2, 9, 1 };

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.binarySearch(nums, 5));
        System.out.println(Arrays.toString(Arrays.copyOf(nums, 6)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 1, 3)));

        int[] zeros = new int[3];
        Arrays.fill(zeros, 7);
        System.out.println(Arrays.toString(zeros));

        System.out.println(Arrays.equals(new int[] { 1, 2 }, new int[] { 1, 2 }));
        System.out.println(new int[] { 1, 2 } == new int[] { 1, 2 });

    }

}
