package test;

import java.util.Scanner;

public class ifstrm {

	public static void main(String[] args) {
		Scanner hold = new Scanner(System.in);
		System.out.print("Enter you mark: ");
		int mark = hold.nextInt();
		if(mark <= 40) {
			System.out.println("Fail");
		}
		else if (mark >= 41 && mark <=50) {
			System.out.println("thrid class");
		}
		else if (mark >=51 && mark <=70) {
			System.out.println("Second class");
		}
		else {
			System.out.println("First class");
		}

	}

}
