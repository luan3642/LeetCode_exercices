package easy;

import java.util.Iterator;

public class PalindromeNumber {
	public boolean isPalindromeNumber(int value) {

		return false;
	}

	public static void main(String[] args) {
		Integer value = 121;
		int j = 0;
		int[] vetorFront = new int[2];
		int[] vetorBack = new int[vetorFront.length];
		
		String numberStr = Integer.toString(value);
		
		for(int i = 0; i<numberStr.length(); i++) {
			int digitFront = Character.getNumericValue(numberStr.charAt(i));
			System.out.println(digitFront);
			vetorFront[i] = digitFront;
			
		}
		System.out.println();
		for(int i = numberStr.length()-1; i>=0; i--) {
			int digitFront = Character.getNumericValue(numberStr.charAt(i));
			System.out.println(digitFront);
			vetorBack[j] = digitFront;
			j++;
		}
		
		
		for (int i : vetorBack) {
			if(vetorFront[i] == vetorBack[i]) {
				System.out.println("palindromo");
			} else {
				System.out.println("nao");
			}
		}
		
		
	
		
		
		
	}

}
