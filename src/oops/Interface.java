package oops;

public interface Interface {
	void add();
	void sub();
	void multi();

}
interface I2{
	void div();
	void mod();
}

class child1 implements Interface,I2{
	public void add() {
		System.out.println("add");
	}
	public void sub() {
		System.out.println("sub");

	}
	public void multi() {
		System.out.println("mul");

	}
	public void div() {
		System.out.println("div");
	}
	public void mod() {
		System.out.println("mod");
	}
public static void main(String args[]) {
	child1 obj = new child1();
	obj.add();
	obj.sub();
	obj.multi();
	obj.div();
	obj.mod();
}
}
