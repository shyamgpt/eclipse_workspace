package arrayListLecture;

import java.util.ArrayList;

public class ArrayListCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<>();  
		arr.add(10);
		arr.add(20);
		arr.add(30);
		
		System.out.println(arr.size());
		System.out.println(arr.get(2));
		
		for(int i =0; i<arr.size(); i++) {
			System.out.print(arr.get(i));
		}

	}

}
