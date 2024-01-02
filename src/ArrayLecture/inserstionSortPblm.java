package ArrayLecture;

public class inserstionSortPblm {
	
	public static void printArray(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void inserstionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] >= temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {9,6,3,7,2,8,1,5};
		
		inserstionSort(arr);
		printArray(arr);
		
		// TODO Auto-generated method stub

	}

}
