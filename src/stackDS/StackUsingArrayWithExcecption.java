package stackDS;

public class StackUsingArrayWithExcecption {
	
	private int data[];
	private int topIndex;
	
	public StackUsingArrayWithExcecption() {	
		data = new int[10];
		
	}
	
	public void push(int elem) throws StackFullException {
		// If Stack is full
		if(topIndex == data.length - 1) {
			StackFullException e = new StackFullException();
			throw e;
//			throw new StackFullException(); Shortcut of above exception
			//Throw Exception
		}
		topIndex++;
		data[topIndex] = elem;
	} 
	
	public int top() throws StackEmptyException {
		 if(topIndex == -1) {
			 // Throw StackEmptyExcption
			 throw new StackEmptyException();
		 }
		 return data[topIndex];
	}
	
	public int pop() throws StackEmptyException {
		
		 if(topIndex == -1) {
			 // Throw StackEmptyExcption
			 throw new StackEmptyException();
		 }
		 int temp = data[topIndex];
		 topIndex--;
		 return temp;
		 
		
	}
	
	public int size() {
		return topIndex +1;
	}
	public boolean isEmpty() {
		if(topIndex == -1) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

}
