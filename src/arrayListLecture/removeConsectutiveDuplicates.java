package arrayListLecture;

import java.util.ArrayList;

public class removeConsectutiveDuplicates {
	
	public static ArrayList<Integer> removeDuplicates(int[] arr) {
		
		ArrayList<Integer> result = new ArrayList<>();
		result.add(arr[0]);
		for(int i=1; i<arr.length; i++) {
			if(arr[i]!= arr[i-1]) {
				result.add(arr[i]);
			}
		}
		return result;
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,20,30,30,30,20,20,20};
		ArrayList<Integer> res = removeDuplicates(arr);
		for(int i=0; i<res.size(); i++) {
			System.out.print(res.get(i) + " ");
		}

	}

}
