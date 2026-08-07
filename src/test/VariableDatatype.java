package test;

import java.util.Scanner;

public class VariableDatatype {
	
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter number of item you own: ");
	int item = sc.nextInt();
	
	System.out.println("Enter the price of the one item: ");
	double price = sc.nextDouble();
	
	System.out.print("Enter the first letter of the item: ");
	char letter = sc.next().charAt(0);
	
	System.out.print("Enter a number 1 on sale 0 not sale: ");
	boolean sale = (sc.nextInt() == 1);
	
	double total = price * item;
	
	System.out.printf("You own %d books at %.2f each, starting with %s, on sale: %b, total cost: %f%n ", item,price,letter,sale,total);
	sc.close();

	

	


}
}
