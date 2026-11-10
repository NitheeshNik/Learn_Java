import java.util.Scanner;

public class DecisionToolkit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Header
        // Part:A
        System.out.print("Enter your Mark: ");
        int marks = sc.nextInt();

        // Part:B
        System.out.println("Enter two number for calculation: ");
        double numberOne = sc.nextDouble();
        double numberTwo = sc.nextDouble();
        System.out.println("Enter you operator");
        char operator = sc.next().charAt(0);

        // Part:C
        System.out.println("Enter year: ");
        int year = sc.nextInt();

        // Part:D
        System.out.println("Enter your day in number 1-7: ");
        int day = sc.nextInt();

        // Part A: Grade

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
                System.out.println("Invalid Operator");
                isValid = false;
            }
        }

        if (isValid) {
            System.out.printf("%.2f %c %.2f = %.2f%n", numberOne, operator, numberTwo, result);
        }

        // Part C: Leap year

        String result1 = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? year + " is a leap year."
                : year + " not an leap";
        System.out.println(result1);

        // Part D: Day type

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
        String decision = (day >= 0 && day <= 5) ? "Weekend" : "Weekday";

        System.out.println(dayName + ":" + decision);
        sc.close();

    }
}
