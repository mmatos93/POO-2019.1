import java.util.Scanner;

class Lista01_09{

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		double n1, n2, soma;
		int contapar = 0, contaimpar = 0;
		System.out.print("Digite um numero: ");
		n1 = s.nextDouble();
		System.out.print("Digite outro numero: ");
		n2 = s.nextDouble();

		if(n1%2 != 0) contaimpar += 1;
		else contapar += 1;

		if(n2%2 == 0) contapar += 1;
		else contaimpar += 1;

		System.out.println("Quantidade de numeros pares: " + contapar);
		System.out.println("Quantidade de numeros impares: " + contaimpar);
		System.out.println("Soma dos dois numeros: " + (n1+n2));
	}

}