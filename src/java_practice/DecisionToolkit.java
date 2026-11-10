import java.util.Scanner;

public class DecisionToolkit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Part A: Grade
        System.out.print("Enter your Mark: ");
        int marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("Grade : A");
        } else if (marks >= 75) {
            System.out.println("Grade : B");
        } else if (marks >= 60) {
            System.out.println("Grade : C");
        } else if (marks >= 40) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Fail");
        }

        // Part B : Calculator
        System.out.println("Enter two number: ");
        double numberOne = sc.nextDouble();
        double numberTwo = sc.nextDouble();
        System.out.println("Enter you operator");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                double addition = numberOne + numberTwo;
                System.out.printf("%.2f %c %.2f = %.2f", numberOne, operator, numberTwo,
                        addition);
                break;

            case '-':
                double subraction = numberOne - numberTwo;
                System.out.printf("%.2f %c %.2f = %.2f", numberOne, operator, numberTwo,
                        subraction);
                break;

            case '*':
                double multiplication = numberOne * numberTwo;
                System.out.printf("%.2f %c %.2f = %.2f", numberOne, operator, numberTwo,
                        multiplication);
                break;

            case '/':
                if (numberTwo == 0) {
                    System.out.println("Error: cannot divide by zero");
                }
                double division = numberOne / numberTwo;
                System.out.printf("%.2f %c %.2f = %.2f", numberOne, operator, numberTwo,
                        division);
                break;

            case '%':
                if (numberTwo == 0) {
                    System.out.println("Error: cannot divide by zero");
                    break;
                }
                double modulo = numberOne % numberTwo;
                System.out.printf("%.2f %c %.2f = %.2f%n", numberOne, operator, numberTwo,
                        modulo);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }

        // Part C: Leap year
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        String result = ((year % 40 == 0 && year % 100 != 0) || year % 400 == 0) ? year + "is a leap year."
                : year + "not an leap";
        System.out.println(result);

        // Part D: Day type
        System.out.println("Enter your day in number 1-7: ");
        int day = sc.nextInt();

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

    }
}
