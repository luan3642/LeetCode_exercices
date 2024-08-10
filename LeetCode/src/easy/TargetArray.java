package easy;

public class TargetArray {
	public static void main(String[] args) {
		int array[] = {2,3,10,14};
		int target = 0;
		
		for(int i = 0; i<array.length; i++) {
			target = (int) (Math.random() * array[i]);
		}
		
		System.out.println("valor: "+target);
		
		int soma[] = new int[array.length];
		int posix = 0;
		int posiy = 0;
		
		for(int i = 0; i <array.length - 1; i++) {
			soma[i] = array[i] + array[i+1];
			
			if(array[i] + array[i+1] == target) {
				posix = i;
				posiy = i+1;
			}else {
				System.out.println("Nao há nenhum array que chegue neste valor");
				break;
			}

		}
		
		System.out.println("A posicao da soma que resulta em "+target + " é: "+posix);
		System.out.println("A posicao da soma que resulta em "+target + " é: "+posiy);
		
		
	}

}
