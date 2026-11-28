import java.util.Arrays;
import java.util.Scanner;

public class MarksTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter mark for student " + (i + 1) + ":");
            int input = sc.nextInt();

            while (input < 0 || input > 100) {
                System.out.println("Invalid mark! Enter a mark between 0 to 100 for student"
                        + (i + 1) + ":");
                input = sc.nextInt();
            }
            marks[i] = input;
            total += marks[i];

        }
        int lowest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;
        int top = 0;
        int last = 0;
        int pass = 0;
        for (int i = 0; i < marks.length; i++) {
            if (lowest > marks[i]) {
                lowest = marks[i];
                last = i;
            }
            if (highest < marks[i]) {
                highest = marks[i];
                top = i;
            }

            if (marks[i] >= 40) {
                pass++;

            }

        }
        double average = (double) total / marks.length;
        int aboveAvg = 0;

        for (int mark : marks) {
            if (mark > average) {
                aboveAvg++;
            }
        }

        // part B
        System.out.println("Enter mark to search: ");
        int searchMark = sc.nextInt();
        int foundStudent = -1;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == searchMark) {
                foundStudent = i + 1;
                break;
            }
        }

        System.out.println();
        // part c
        int[][] scores = { { 80, 70, 90 }, { 60, 75, 85 }, { 95, 88, 92 } };

        // part a
        System.out.println("===== A: STATISTICS =====");

        System.out.println("Marks    : " + Arrays.toString(marks));
        System.out.println("Total    : " + total);
        System.out.printf("Average  : %.2f%n", average);
        System.out.printf("Highest  : %d (student %d)%n", highest, top + 1);
        System.out.printf("Lowest   : %d (student %d)%n", lowest, last + 1);
        System.out.println("Passed   : " + pass);
        System.out.println("Above average : " + aboveAvg);

        // part B

        System.out.println("===== B: SEARCH =====");
        if (foundStudent != -1) {
            System.out.println("Found at student " + foundStudent);
        } else {
            System.out.println("Not found");
        }
        System.out.print("Reversed : ");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.print(marks[i] + " ");

        }
        System.out.println(" ");

        // part c
        System.out.println("===== C: SCORES =====");

        for (int row = 0; row < scores.length; row++) {
            int totalMarks = 0;

            for (int col = 0; col < scores[row].length; col++) {
                totalMarks += scores[row][col];
            }
            double avg = (double) totalMarks / scores[row].length;
            System.out.printf("Average   : %.2f%n", average);

            System.out.printf("Student %d: total %d, average %.2f%n", row + 1, totalMarks, avg);

        }

        sc.close();

    }
}