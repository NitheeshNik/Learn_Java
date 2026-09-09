package java_practice;
import java.util.Scanner;
public class Largest_of_two_number {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if (num1 > num2) {
			System.out.print("number1 is bigger: " + num1);
		}
		else if(num2 > num1 ) {
			System.out.print("number2 is bigger: " + num2);
		}
		else {
			System.out.print("Equal");
		}
		scan.close();
	}

}
