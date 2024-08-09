	package easy;
	
	import java.util.Iterator;
	
	public class PalindromeNumber {
		public boolean isPalindromeNumber(int value) {
	
			String valueString = Integer.toString(value);
			int vetorFront[] = new int[valueString.length()];
			int vetorBack[] = new int[valueString.length()];
			int j = 0;
			int digit = 0;
	
			for (int i = 0; i < valueString.length(); i++) {
				digit = Character.getNumericValue(valueString.charAt(i));
				vetorFront[i] = digit;
			}
	
			for (int i = valueString.length() - 1; i >= 0; i--) {
				int digitBack = Character.getNumericValue(valueString.charAt(i));
				vetorBack[j] = digitBack;
				j++;
			}
	
			for(int i = 0; i <vetorBack.length; i ++) {
				if(vetorBack[i] != vetorFront[i]) {
					return false;
				}
			}
			return true;
		}
	
		public static void main(String[] args) {
			PalindromeNumber palindromeNumber = new PalindromeNumber();
			System.out.println(palindromeNumber.isPalindromeNumber(-151));
	
		}
	
	}
