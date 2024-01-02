package ArrayLecture;

import java.util.Scanner;

public class returnArraySum {
	
	public static int[] inputArray() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter thr size of Array");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the element of array");
		for(int i =0; i<arr.length; i++) {
			arr[i] = s.nextInt();
		}
		// return arr;
	}
	
	public static int addArrayElemt(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			 sum = sum + arr[i];
		}
		return sum;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int [] arr =	inputArray();
	int sumArray = addArrayElemt( arr);
	System.out.println(sumArray);

	}

}
