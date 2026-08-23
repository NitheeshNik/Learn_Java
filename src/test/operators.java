package test;

public class operators {
	public static void main(String[] args) {
		// Declare variables
		int a = 12, b=5;
		System.out.println("Arithmetic");
		// addition 
		System.out.println("a + b = " + (a + b));
		
		// sub
		System.out.println("a - b = " + (a - b));
		
		// multiplication
		System.out.println("a * b = " + (a * b));
		
		// division
		System.out.println("a / b = " + (a / b));
		
		//modulo 
		System.out.println("a % b = " + (a % b));
		
		
		// Assignment
		System.out.println("\nAssignment operator");
		// Create variables
		 int a1 = 4;
		 int var;
		 
		 // Assign value using =
		 var = a;
		 System.out.println("var using =: " + var);
		 
		 // +=
		 var += a;
		 System.out.println("var using +=: " + var);
		 
		 // *=
		 var *= a;
		 System.out.println("var using *=: " + var);
		 
		 
		 //Relational
		 System.out.println("\nRelational operator");
		 
		 int b1=7, b2= 11;
		 
		 //value of  a and b
		 System.out.println("a is " + b1 + " and b is " + b2);
		 
		 // ==
		 System.out.println(b1==b2); //false
		 
		 // !=
		 System.out.println(b1 != b2);// true
		 
		 // >
		 System.out.println(a > b); // true
		  
		 // < 
		 System.out.println(a < b);
		 
		 // >=
		 System.out.println(a >= b);
		 
		 //<=
		 System.out.println(a <= b);
		 
		 
		 //Logical operator
		 System.out.println("\nLogical operator");
		 
		 
		 // && operator
		 System.out.println((5> 3) && (8 > 5)); // true
		 System.out.println((5> 3) && (8 < 5)); // false
		
		 // || opeator
		 System.out.println((5< 3) ||(8 > 5)); //true
		 System.out.println((5 > 3) || (8 < 5)); // true
		 System.out.println((5 < 3) || (8 < 5)); //false

		 // ! 
		 System.out.println(!(5 == 3)); //true
		 System.out.println(!(5 > 3)); // false
		 
		 
		 System.out.println("\nunary opeator");
		// declare variables
		 int a3 = 12, b3 = 12;
		 int result1, result2;

		 // original value
		 System.out.println("Value of a3: " + a3);

		 // increment operator
		 result1 = ++a3;
		 System.out.println("After increment: " + result1);

		 System.out.println("Value of b3: " + b3);

		 // decrement operator
		 result2 = --b3;
		 System.out.println("After decrement: " + result2);
		 
		 // instanceof
		 System.out.println("\nJava instanceof operator");
		
		 String strr = "hi";
		 boolean resultt;
		 
		 // Check if str is an instance of
		 // the string class
		 resultt = strr instanceof String;
		 System.out.println("Is atr an object of String? " + resultt);
		 
		 // Ternary
		 System.out.println("\nJava Ternary operator");
		 
		 int februaryDays = 29;
		 String resullt;
		 
		 // ternary operator
		 resullt = (februaryDays == 28) ? "Not a leap year" : "Leap year";
		 System.out.println(resullt);
		 
		 
	}

}
