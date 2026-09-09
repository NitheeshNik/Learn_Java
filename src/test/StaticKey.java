package test;

public class StaticKey {
	String name;
	static String college; // if i use (static) in this method don't need object creation for this
	
	public void display(){
		System.out.println(name);
		System.out.println(college);
	}
	static void clg_name() {
		college = "goverment college of enginering";
	}
	static { // this is static block it will run program runs
		System.out.println("i am not a programmer");
	}

}
class demo{
	public static void main(String args[]) {
		StaticKey nik = new StaticKey();
		nik.name="jinitha";
		StaticKey.college="gce"; // directly call class name to that method no need of object creation
		StaticKey jini = new StaticKey();
		jini.name="nik";
		StaticKey.college="gces";  // directly call class name to that method no need of object creation
		
		StaticKey.clg_name();// clg_name is static so no need of object creation for this.
		nik.display();
		jini.display();
	}
}
