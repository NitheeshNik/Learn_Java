package java_practice;

import java.util.Scanner;

class ElectricityBill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Customer: ");
        String name = scan.nextLine();
        System.out.println("Customer: " + name);

        System.out.println("Units consumed: ");
        int unit = scan.nextInt();
        Cal(unit);
        scan.close();
    }

    private static void Cal(int unit) {
        if (unit < 0) {
            System.out.println("Units cannot be negative.");
        }

        else if (unit <= 100) {
            int total = unit * 2;
            System.out.println("Total Bill: ₹" + total);

        }

        else if (unit <= 200) {
            int total = unit * 3;
            System.out.println("Total Bill: ₹" + total);

        }

        else if (unit <= 500) {
            int total = unit * 5;
            System.out.println("Total Bill: ₹" + total);

        }

        else {
            int total = unit * 7;
            System.out.println("Total Bill: ₹" + total);

        }

    }

}