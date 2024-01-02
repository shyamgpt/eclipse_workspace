
public class reverseArray {
	
	public static int[] arrayReverse() {
		int[] arr = {8,9,6,2,};
		for(int i=0; i<arr.length/2;i++) {
			int j = arr.length-1-i;
			int temp = arr[i];
			arr[i]= arr[j];
			arr[j] = temp;
		} return arr;
		
		
	}

	public static void main(String[] args) {
	int[] arr=	arrayReverse();
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i] + " ");
		
	}
	
	}

}
