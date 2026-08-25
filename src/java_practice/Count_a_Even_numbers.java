package java_practice;
import java.util.Scanner;

public class Count_a_Even_numbers {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			int number = scan.nextInt();
			if(number % 2 ==0) {
				count ++;
			}
		}
		System.out.println(count);
		scan.close();
	}
}
