package oops;

public class version1 {
	
	public void layout() {
		System.out.println("version 1");
		System.out.println("red colour menu");
	}
}

class version2 extends version1{
	public void layout2() {
		System.out.println("version 2");
		System.out.println("yellow colour menu");
		
	}
}
	
	class version3 extends version2{
		public void layout3(){
		System.out.println("version 3");
		System.out.println("green colour menu");
		}	
		
		public static void main(String[] args) {
		version3 caller = new version3();
		caller.layout();
		caller.layout2();
		caller.layout3();
	}
		
	
	


}
