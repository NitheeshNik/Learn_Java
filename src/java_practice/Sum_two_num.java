package java_practice;
import java.util.Scanner;
public class Sum_two_num {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int number1 = scan.nextInt();
			int number2 = scan.nextInt();
			int total =  number1 + number2;
			System.out.printf("total: "+ total );
			scan.close();
			}
		

}
