package easy;

import java.util.Random;

public class TargetArray {
	public static void main(String[] args) {
		int array[] = {2,3,10,14};
		int target = 0;
		
		
		Random random = new Random();
		int indiceAletorio1 = random.nextInt(array.length);
		
		int indiceAleatorio2 = random.nextInt(array.length);
		
		int valorAleatorio = array[indiceAletorio1];
		int valorAleatorio2 = array[indiceAleatorio2];
		
		target = valorAleatorio + valorAleatorio2;
		
		
		System.out.println(target);
		
		
		
		System.out.println("valor target: "+target);
		
		int soma[] = new int[array.length];
		int posix = 0;
		int posiy = 0;
		
		for(int i = 0; i <array.length - 1; i++) {
			soma[i] = array[indiceAletorio1] + array[indiceAleatorio2];
			
			if(array[indiceAletorio1] + array[indiceAleatorio2] == target) {
				posix = i;
				posiy = i+1;
			}

		}
		
		System.out.println("A posicao da soma que resulta em "+target + " é: "+posix);
		System.out.println("A posicao da soma que resulta em "+target + " é: "+posiy);
		
		
	}

}
