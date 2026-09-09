package test;

public class static_res {
	static void display() {
		System.out.println("method display");
	}
	
	}

class foo extends static_res{
	
	public static void main(String args[]) {
		display(); // no need of class and object to assen this on main funtion.
	}
}
