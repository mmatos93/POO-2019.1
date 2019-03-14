import java.util.Scanner;

class Lista01_10{

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		double numero, divisao;
		int contadiv = 0;

		System.out.println("Digite um numero: ");
		numero = s.nextDouble();

		divisao = numero/2.0;
		while(divisao >= 1){
			divisao = divisao/2.0;
			System.out.println("Resultado da divisão: " + divisao);
			contadiv++;
		}

		System.out.println("Quantidade de divisões successivas: " + contadiv);

	}
}