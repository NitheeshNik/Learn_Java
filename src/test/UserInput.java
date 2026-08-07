package test;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.next();
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		System.out.printf("Hi %s, you are %d years old.", name, age);
	
		
		
	// Read two integers on separate lines and print their sum
 
System.out.println("\nEnter first number");
int a = sc.nextInt();
System.out.println("Enter second number");
int b = sc.nextInt();
int c = a + b;
System.out.printf("total = %d", c);

//Read a double (price) and an int (quantity), print total = price × quantity

System.out.print("\nEnter you price");
double price = sc.nextDouble();
System.out.print("Enter you quantity");
int quantity = sc.nextInt();

double total = price * quantity;
System.out.print(total);


//This code has a bug — the "address" input gets skipped. Find it and fix it:
System.out.print("\nEnter age: ");
int age1 = sc.nextInt();
sc.nextLine();
System.out.print("Enter address: ");
String address = sc.nextLine();

System.out.println("Age: " + age1);
System.out.println("Address: " + address);
sc.close();
		}

}

