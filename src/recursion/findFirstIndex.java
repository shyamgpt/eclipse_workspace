package recursion;

public class findFirstIndex {
	
	
	public static int findIndex(int[] a, int x) {
		if(a.length == 0){
			return -1;
		}
		if(a[0] == x) {
			return 0;
		}
		
		int[] smallArray = new int[a.length-1];
		for(int i =1; i<a.length; i++) {
			smallArray[i-1] = a[i];
		}
		 int fi = findIndex(smallArray,x);
		 if(fi == -1) {
		 return -1;
		 }else {
			 return fi+1;
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,6,3,5,9,5};
		int x = 4;
		int res = findIndex(a,x);
		System.out.println(res);

	}

}
