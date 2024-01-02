package recursion;

public class findDigitCount {
	
	
	public static int countDigit(int num) {
		if(num == 0) {
			return 0;
		}
		
		int smallAns = num/10;
		int ans = smallAns+1;
		return ans;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1234;
		int  sol = countDigit( num);
		System.out.println(sol);
		
		
		
//		int count =0;
//		int num = 123;
//		while(num != 0) {
//			 num = num/10;
//			count ++;
//			
//			
//		}
//		System.out.println(count);
		

	}

}
