package easy;

public class TargetArray {
	public static void main(String[] args) {
		int array[] = {1,5,10,14};
		int target = 24;
		int soma[] = new int[array.length];
		
		for(int i = 0; i <array.length -1; i++) {
			soma[i] = array[i] + array[i+1];
			//0 = 1 + 5
			//6  = 5 + 10
			//15 = 10 + 14
			// 24 
			
			
		}
		
		
	}

}
