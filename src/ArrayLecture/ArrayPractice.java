package ArrayLecture;

import java.util.Scanner;

public class ArrayPractice {
	
public static int[] inputArray() {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n = s.nextInt();
	int[] arr = new int[n];
	for(int i=0; i< arr.length; i++) {
		System.out.println("Enter the element of array");
		arr[i] = s.nextInt();
	}
	 return arr;
	
}	

public static void PrintArray(int[] arr) {
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+ " ");
	}
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr =	  inputArray();
	PrintArray(arr);
  
	}

}
