package java_practice;
import java.util.Scanner;
public class Sum_of_1_to_N {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int set = scan.nextInt();
		int n = 0;
		for(int i = 1;i <=set; i++) {
			n+=i; // 1 + 0 = 1, n=1 , 2 + 1=3 loop (This patter called accumulator pattern)
			
			
		}
		System.out.print(n); //print final n answer
	
scan.close();
	}
}
