package test;

public class forEachloop {

	public static void main(String[] args) {
		
		String[] names = {"nik", "jini", "nandhu", "rahul"};
		for(String i : names) { // for-each loop only use for arrays and collections
		System.out.println(i);
		}
		
		int sum = 0;
		int[] name = {1,2,1,2};
		for (Integer i : name) {
			sum +=i;
			
			System.out.println(sum);
		}
	}

}
