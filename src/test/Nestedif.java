package test;

public class Nestedif {

	public static void main(String[] args) {
		int num = 120;
		
		if (num < 100) {
			System.out.println("The entered number is less then 100");
			if (num > 50) {
				System.out.println("The entered number is greater than 50");
			}
		}
		else {
			System.out.println("The entered number is greater than 100");
		}
	}
}
