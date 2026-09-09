package test;

public class Final_key {
	final void run() { // the final keyword restric the method you can't directly override or modifi this
		System.out.println("I am a final method");
	}

}

class foo1 extends Final_key{
	public static void main(String args[]) {
		foo1 call = new foo1();
		call.run();
	}
}
