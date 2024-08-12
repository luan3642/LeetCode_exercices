package easy;

import java.util.Scanner;

public class ImprimindoValorSequencia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int q = scan.nextInt();

		for (int j = 0; j < q; j++) {

			int a = scan.nextInt();
			int b = scan.nextInt();
			int n = scan.nextInt();

			int si = a;
			for (int i = 0; i < n; i++) {
				si += (int) (Math.pow(2, i) * b);
				System.out.print(si + " "); // Print sem nova linha
			}
			System.out.println(); // Nova linha após cada sequência
		}

		scan.close();
	}

}
