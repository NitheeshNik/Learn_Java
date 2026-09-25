package java_practice;

import java.util.Scanner;

class Word {

    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String word = scan.nextLine();
        char[] charArray = word.toCharArray();
        int n = word.length();
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
        scan.close();

    }
}