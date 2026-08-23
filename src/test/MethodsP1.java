package test;

public class MethodsP1 {   
	 public static double calculateArea(double length, double width){
		 double area = length * width;
		 return area;
		 
	 }
	 public static double calculatePerimeter(double length, double width) {
		 double perimeter = 2 * (length + width);
		 return perimeter;
	 }
	 
	 public static void main(String[] args) {
		 double area1 = calculateArea(5.0,3.0);
		 double area2 = calculateArea(7.5,2.0);
		 
		 double perimeter1 = calculatePerimeter(5.0,3.0);
		 double perimeter2 = calculatePerimeter(7.5,2.0);
		 System.out.println("Area1:" + area1);
		 System.out.println("Area2:" + area2);
		 System.out.println("Perimeter1" + perimeter1);
		 System.out.println("Perimeter2" + perimeter2);
		 
		 
		 
	 }

}
