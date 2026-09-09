package test;

public class super_ex {
	String fruit = "apple";

}

class abc extends super_ex{
	String fruit = "orange"; // method override
	
	void dis() {
		System.out.println(fruit); // orange
		System.out.println(super.fruit); //apple (super keyword help to write a parent class value)
	}
}

class TestSuper1{
	public static void main(String [] args) {
		abc d = new abc();
		d.dis();
	}
}
