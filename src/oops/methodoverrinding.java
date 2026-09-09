package oops;

public class methodoverrinding {
	public void house() {
		System.out.println("house colour - red ");
	}

}

class version extends methodoverrinding {
	public void car() {
		System.out.println("car colour - yellow");
		
	}
	public void house() { // methodoverridided in house using childe class
		System.out.println("house colour - green");
	}
	public static void main(String[] args) {
		version caller = new version();
		caller.house();
		caller.car();
	}
}
