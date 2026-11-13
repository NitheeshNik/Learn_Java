public class ForLoopPatterns {
    public static void main(String[] args) {
        // Countdown
        for (int i = 5; i >= 1; i--) {
            System.out.println(i + " ");
        }
        System.out.println();

        // Step of 2
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i + " ");
        }
        System.out.println();

        // Sum of 1 to 100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);

        System.out.println();

        // Multiplication table
        for (int i = 1; i <= 5; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        // Factorial: 5! = 5 x 4 x 3 x 2 x 1
        long factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("5! = " + factorial);

    }
}