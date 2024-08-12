package easy;

import java.util.Scanner;

public class FormatarNumeros {
	public static void main(String[] args) {
		System.out.println("==============================");
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i <3; i++) {
			String s = scan.next();
			int x = scan.nextInt();
			System.out.printf("%-15s%03d%n", s, x);
		}
		System.out.println("==============================");


	}

}
