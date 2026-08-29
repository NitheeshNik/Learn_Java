package test;

public class this_ex {
	String name;
	
	this_ex( String name){
		this.name = name; // this keyword will help to find which variable is this name used
	}
	
	void display() {
		System.out.println(name);
	}

}

class TestClass {
	public static void main(String args[]) {
		this_ex s1 = new this_ex("nik");
		s1.display();
	}
}
