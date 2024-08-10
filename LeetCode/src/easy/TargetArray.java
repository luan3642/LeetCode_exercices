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
		
	
		
		
		
		System.out.println("A posicao da soma que resulta em "+target + " é: "+indiceAleatorio2);
		System.out.println("A posicao da soma que resulta em "+target + " é: "+indiceAletorio1);
		
		
	}

}
