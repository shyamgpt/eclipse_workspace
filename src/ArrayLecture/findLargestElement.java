package ArrayLecture;

import java.util.Scanner;

public class findLargestElement {
	
	public static int[] inputArray() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Array Element");
		for(int i=0; i<arr.length; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
		
	}
     public static int largestElement(int[] arr) {
    	 int max = Integer.MIN_VALUE;
    	 for(int i=0; i<arr.length; i++) {
    		 if(arr[i] > max) {
    			 max = arr[i];
    		 }
    	 }
    	 return max;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = inputArray();
		int max = largestElement(arr);
		System.out.println(max);

	}

}
