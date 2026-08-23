package test;

import java.util.ArrayList; // for array List 

public class array {
	
	public static void main(String[] args) {
		String [] b = {"tn","kl","ap"}; // b[0]=tn , b[1]=kl, b[2] = ap
		
		for(String i:b) {
		System.out.println(i);     
	}
		
		System.out.println("****loop****");
		System.out.print("\n");
		
		
//		another way array implementation
		String [] a = new String [100]; /* String - datatype you use others also, [] - array, a - variable, 
		new memory space [100]- array size*/
		
		a[0] = "hi"; // individual array allocation value
		a[1] = "jini"; // a = variable, 1 - index 
		
		
		System.out.println(a[1]); // index = 0 print tn
		System.out.println(b[0]); // index = 0 print tn
		System.out.println("array lenght = " + a.length); // Find array length
		
		String data = "1,nik,male,phone,10000";
		String a1[] = data.split(",");
		System.out.println(a1[4]); // index to print that value
		
		System.out.println("ArrayList");
//		Array List
		ArrayList<String> names = new ArrayList<>();
		
		
//		Add elements to ArrayList
		names.add("nik");
		names.add("nandhu");
		names.add("nile");
		
//		String str = names.get(2);  // If you need particular element want to print use = get()
		
		System.out.println(names); // normal
		String str = names.remove(2); // if you want to remove element use = remove()

		names.set(0, "jini"); // If you want to change element = set()
		
		System.out.println("ArrayList: " + names); // changed 
		
		System.out.println("ArrayList: " + str); // if you want particular element
		// remove
		
		
		
		
	}

}
