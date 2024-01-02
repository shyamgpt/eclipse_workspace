package stackDS;

public class PracticeStackUsingArray {
	
	private int data[];
	private int topIndex;
	
	
	public PracticeStackUsingArray() {
		data = new int[10];
		topIndex = -1;
		
	}
	
	public int size() {
		return topIndex+1;
		
	}
	
	public boolean isEmpty() {
		if(topIndex == -1) {
			return true;
		} else {
			return false; 
		}
		
		public void push(int elem) {
			
			if(topIndex == data.length-1) {
				StackFullException e = new StackFullException();
				throw e;
			}
			topIndex++;
			data[topIndex] = elem;
			
		}
	}
	
	
	
	
	
		
	} 
	
	



