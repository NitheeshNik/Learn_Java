package dsa;

public class Rotatearr {

	public static void main(String[] args) {
	    int[] arr = { 5, 4, 3, 2, 1};
	    int start = 0;
	    int end = arr.length - 1;
	    reverse(arr, start, end);
	    for(int num : arr){
	       System.out.print(num + " ");
	    }
	}
public static void reverse (int[] arr, int start, int end){
    while(start <= end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end --;
    }
}
	}
