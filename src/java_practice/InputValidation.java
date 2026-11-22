import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;

        while (true) {
            System.out.println("Enter age (1-120:");
            age = sc.nextInt();
            if (age >= 1 && age <= 120) {
                break;
            }
            System.out.println("Invalid, try again");
        }
        System.out.println("Age saved: " + age);
        sc.close();
    }

}