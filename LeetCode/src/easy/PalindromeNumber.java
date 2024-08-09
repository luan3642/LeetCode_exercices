package easy;

public class PalindromeNumber {
	public boolean isPalindromeNumber(int value) {

		return false;
	}

	public static void main(String[] args) {
		int value = 121;
		
		String numberStr = Integer.toString(value);
		
		for(int i = 0; i<numberStr.length(); i++) {
			int digit = Character.getNumericValue(numberStr.charAt(i));
			System.out.println(digit);
		}
	}

}
