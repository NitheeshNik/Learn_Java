package java_practice;

import java.util.Scanner;

public class NumberAnalyzer {

    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);
        int sum = 0, tm = 0, Even = 0, odd = 0, small = 0;
        System.out.println("How many numbers? ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number" + (i + 1) + ": ");
            int current = scan.nextInt();
            // total sum
            sum = sum + current;
            // Odd or Even
            if (current % 2 == 0) {
                Even++;
            } else {
                odd++;
            }
            if (i == 0) {
                tm = current;
                small = current;
            }
            // largest
            if (current > tm) {
                tm = current;
            }
            // small
            if (current < small) {
                small = current;
            }

        }

        double average = avg(sum, n);
        System.out.println("Sum " + sum);
        System.out.println("Average: " + average);
        System.out.println("Small " + small);
        System.out.println("Largest " + tm);
        System.out.println("Even " + Even);
        System.out.println("Odd " + odd);
        scan.close();
    }

    // Average of the total
    public static double avg(int sum, int n) {
        return (double) sum / n;
    }

}
