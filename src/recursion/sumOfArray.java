package recursion;

public class sumOfArray {
	
	public static int ArraySum(int[] arr) {
		
		if(arr.length == 1) {
			return arr[0];
		}
		
		int[] smallArray = new int[arr.length-1];
		for(int i =1; i<arr.length; i++) {
			smallArray[i-1] = arr[i];
			
		}
		
		int  smallArraySum = ArraySum(smallArray);
		int finalsum = arr[0] +smallArraySum;
		
		return finalsum;
	}

	public static void main(String[] args) {
		// TODO Auto-ge n erated method stub
		int [] arr = {7, 8 ,9,5};
		int  sum = ArraySum( arr);
		System.out.println(sum);

	}

}
