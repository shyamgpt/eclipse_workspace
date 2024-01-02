package recursion;

public class findLastElement {
	
	public static int lastElement(int[] a, int x) {
		if(a.length ==0) {
			return -1;
		}
		
		int[] smallArray = new int[a.length-1];
		for(int i =1; i<a.length; i++) {
			smallArray[i-1] = a[i];
		}
		int k = lastElement(smallArray, x);
		if(k != -1) {
			return k+1;
		} else {
			if(a[0] == x) {
				return 0;
			} else {
				return -1;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,3,5,6,7,5};
		int x = 5;
		
		int index  = lastElement(a, x);
		System.out.println(index);

	}

}
