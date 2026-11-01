import java.util.Scanner;

public class PersonalProfile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Objection creation for scanner
        // Read user input
        final int MONTHS = 12;

        System.out.print("Name : ");
        String name = sc.nextLine();

        System.out.print("Age : ");
        int age = sc.nextInt();

        System.out.print("Height : ");
        double height = sc.nextDouble();

        System.out.print("Student (true / false): ");
        boolean student = sc.nextBoolean();

        System.out.print("Grade : ");
        char grade = sc.next().charAt(0);

        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        // Calculation yearly salary
        double totalSalary = salary * MONTHS;
        // print profile
        System.out.println("===== PROFILE =====");
        System.out.printf("Name     : %s%n", name);
        System.out.printf("Age      : %d%n", age);
        System.out.printf("Height   : %.2f m%n", height);
        System.out.printf("Student  : %b%n", student);
        System.out.printf("Grade    : %c%n", grade);
        System.out.printf("Yearly   : %.2f%n", totalSalary);
        System.out.println("===================");

        // Limits section
        System.out.println("===== LIMITS =====");
        System.out.println("int max : " + Integer.MAX_VALUE);
        System.out.println("int max : " + Long.MAX_VALUE);
        // int overflow: MAX_VALUE + 1 wraps around to the minimum value , no error
        System.out.println("int max+1 : " + (Integer.MAX_VALUE + 1));

        sc.close();

    }

}
