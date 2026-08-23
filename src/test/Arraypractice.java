package test;

public class Arraypractice {
	public static void main(String[] args) {
		
		int[] ar = {6,5,4,3,2,1};  
		System.out.println("Array lenght: " + ar.length);
		System.out.println("Array Index: " + ar[2]);
		
		// Find largest number in array
		System.out.println("\nFind largest number in array");
		
		for (int list : ar) {
			System.out.println(list);
		}
		int setMax = ar[0];
		
		for (int Max : ar) {
			if (Max > setMax) {
				setMax = Max;
				
			}
			
				
		}
		System.out.println("Largest number: " + setMax);

		
	}

}
