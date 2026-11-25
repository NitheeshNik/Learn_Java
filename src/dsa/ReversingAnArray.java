public class ReversingAnArray {
    public static void main(String[] args) {
        int[] arr = { 800, 9, 87, 99, 111 };
        System.out.println("Before reversing");
        for (int i = 0; i < arr.length; i++) { // before reverseing
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Two pointer approch
        System.out.println("After reversing");
        reverse(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}