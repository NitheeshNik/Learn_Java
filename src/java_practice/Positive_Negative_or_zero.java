package java_practice;
import java.util.Scanner;
public class Positive_Negative_or_zero {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num > 0) {
			System.out.print("Positive");
		}
		else if(num < 0) {
			System.out.print("Negative");
		}
		else {
			System.out.print("Zero");
		}
		scan.close();
	}

}
