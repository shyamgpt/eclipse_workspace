package ArrayLecture;

import java.util.Scanner;

public class InputArray {
	
	public static void printArray(int[] arr) {
		int n = arr.length;
		for (int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}

public static int[] inputArray() {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the size of Array");
	int n = s.nextInt();
	int[] arr = new int[n];
	for(int i =0; i<n; i++) {
		System.out.println("Enter the Array Element");
		arr[i] = s.nextInt();
}
	 return arr;

}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int []arr = inputArray();
		 printArray(arr);
		
		
}
}
