import java.util.Scanner;

class Lista01_08{ 

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Calcula c = new Calcula();
		int numeros[] = new int[10];
		double media = 0;

		for(int i = 0; i < numeros.length; i++){
			System.out.println("Digite um numero inteiro: ");
			numeros[i] = s.nextInt();
		}

		int max = numeros[0], min = numeros[0];

		for(int i = 0; i < numeros.length; i++){
			media += numeros[i];
			if (numeros[i] > max){
				max = numeros[i];
			}
			if (numeros[i] < min){
				min = numeros[i];
			}
		}
		media = media/numeros.length;

		System.out.println("Media dos numeros digitados: " + media);
		System.out.println("Maior numero digitado: " + max);
		System.out.println("Menor numero digitado: " + min);

	}
}