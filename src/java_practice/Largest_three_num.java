package java_practice;
import java.util.Scanner;
public class Largest_three_num {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if (num1 > num2 && num1 > num3){
			System.out.print(num1);
		}
		else if (num2 > num3) {
			System.out.print(num2);
			
		}
		else {
			System.out.print(num3);
		}
		scan.close();
		}

}
