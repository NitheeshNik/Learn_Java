package test;

public class JavaMethods {
	void addition() { // method without argument
		int a = 10;
		int b= 10;
		int c = a+b;
		System.out.println("Result - " + c);
	}
	
	void sub(int a,int b) { // method with argument
		int c= a-b;
		System.out.println("Result " + c);
	}
	int add(int a , int b) { // method with return type
		int c = a+b;
		return c;
	}
	void str(String a, String b, String c) { // method with 3 argument 
		System.out.println("Result -" + a+ b+ c);
	}
	// main function
	public static void main(String[] args) {
		JavaMethods caller = new JavaMethods();
		caller.addition();
		caller.sub(20, 25);
		System.out.println(caller.add(1, 4));
		caller.str("X", "Y", "Z");
	}

}
