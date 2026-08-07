package test;

public class JavaMethods {
	void addition() { // method withou argument
		int a = 10;
		int b= 10;
		int c = a+b;
		System.out.println("Result - " + c);
	}
	
	void sub(int a,int b) {
		int c= a-b;
		System.out.println("Result" + c);
	}
	public static void main(String[] args) {
		JavaMethods caller = new JavaMethods();
		caller.addition();
		caller.sub(20, 25);
		
	}

}
