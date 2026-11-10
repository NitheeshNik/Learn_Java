import java.util.Scanner;

public class DecisionToolkit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Header
        System.out.print("Enter your Mark: "); // Part:A
        int marks = sc.nextInt();

        System.out.println("Enter first number: ");// Part:B
        double numberOne = sc.nextDouble();
        System.out.println("Enter your operator (+ - * / %):");
        char operator = sc.next().charAt(0);
        System.out.println("Enter Second number: ");
        double numberTwo = sc.nextDouble();

        System.out.println("Enter year: ");// Part:C
        int year = sc.nextInt();

        System.out.println("Enter your day in number 1-7: ");// Part:D
        int day = sc.nextInt();

        // Part A: Grade
        System.out.println("===== A: GRADE =====");
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        } else if (marks >= 90) {
            System.out.println("Grade : A");
        } else if (marks >= 75) {
            System.out.println("Grade : B");
        } else if (marks >= 60) {
            System.out.println("Grade : C");
        } else if (marks >= 40) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Grade : Fail");
        }

        // Part B : Calculator
        System.out.println("===== B: CALCULATOR =====");
        double result = 0;
        boolean isValid = true;

        switch (operator) {
            case '+' -> result = numberOne + numberTwo;
            case '-' -> result = numberOne - numberTwo;
            case '*' -> result = numberOne * numberTwo;
            case '/' -> {
                if (numberTwo == 0) {
                    System.out.println("Error: cannot divide by zero");
                    isValid = false;
                } else {
                    result = numberOne / numberTwo;
                }
            }
            case '%' -> {
                if (numberTwo == 0) {
                    System.out.println("Error: cannot divide by zero");
                    isValid = false;
                } else {
                    result = numberOne % numberTwo;
                }
            }
            default -> {
                System.out.println("Unknown operator");
                isValid = false;
            }
        }
        if (isValid) {
            System.out.printf("%.2f %c %.2f = %.2f%n", numberOne, operator, numberTwo, result);
        }

        // Part C: Leap year
        System.out.println("===== C: LEAP YEAR =====");
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        String message = isLeapYear ? year + " is a leap year" : year + " is not a leap year";
        System.out.println(message);

        // Part D: Day type
        System.out.println("===== D: DAY =====");
        if (day < 1 || day > 7) {
            System.out.println("Invalid day");
        } else {
            String dayName = switch (day) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                default -> "Invalid day";
            };
            String decision = (day == 6 || day == 7) ? "Weekend" : "Weekday";
            System.out.println(dayName + " : " + decision);
        }

        sc.close();

    }
}
