package java_practice;
import java.util.Scanner;
public class Even_or_Odd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int number = scan.nextInt(); 
		if (number % 2 == 0){
			System.out.println("Even"); 
		} 
		else{ 
			System.out.println("Odd"); 
		} 
		scan.close();
	}

}
