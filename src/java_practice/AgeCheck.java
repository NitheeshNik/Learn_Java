package java_practice;

import java.util.Scanner;

class AgeCheck {
    static boolean isEven(int age) {
        return age % 2 == 0;
    }

    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        if (age < 18) {
            System.out.println("Minor");
        } else if (age >= 18 && age <= 59) {
            System.out.println("Adult");

        } else {
            System.out.println("Senior");
        }
        if (isEven(age)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        scan.close();

    }
}