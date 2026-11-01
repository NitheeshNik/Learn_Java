import java.util.Scanner;

public class PersonalProfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name : ");
        String name = sc.nextLine();

        System.out.println("Age : ");
        int age = sc.nextInt();

        System.out.println("Height : ");
        double height = sc.nextDouble();

        System.out.println("Student : ");
        boolean student = sc.nextBoolean();

        System.out.println("Grade : ");
        char grade = sc.next().charAt(0);

        System.out.println("Yearly : ");
        double year = sc.nextDouble();

        System.out.println("===== PROFILE =====");
        System.out.printf("Name : %s%n", name);
        System.out.printf("Age : %d%n", age);
        System.out.printf("Height : %d%n", height);
        System.out.printf("Student : %b%n", student);
        System.out.printf("Grade : %c%n", grade);
        System.out.printf("Yearly : %.2lf%n", year);
        System.out.println("===================");

    }

}
