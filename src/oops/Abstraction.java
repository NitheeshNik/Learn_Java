package oops;

abstract class Abstraction {
	abstract void add();
	abstract void sub();
	abstract void mul();
	void test () {
		System.out.println("test");
	}
	

}

class child extends Abstraction{
	
	void add() {
		System.out.println("add");
	}
	void sub() {
		System.out.println("sub");
	}
	void mul() {
		System.out.println("mul");
	}
	void test() {
		System.out.println("one");//overwrited test method
	}
	public static void main(String args[]) {
		child obj = new child();
		obj.add();
		obj.sub();
		obj.mul();
		obj.test();
	}
}
