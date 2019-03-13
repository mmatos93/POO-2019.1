import java.util.Scanner;

public class Conceito{

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		int nota;
		String[] conceito = {"Insuficiente", "Regular", "Bom", "Otimo"};
		System.out.print("Digite a nota do aluno: ");
		nota = s.nextInt();

		if(nota >= 0 && nota < 50) System.out.println("Conceito: " + conceito[0]);
		else if(nota >= 50 && nota < 65) System.out.println("Conceito: " + conceito[1]);
		else if(nota >= 65 && nota < 85) System.out.println("Conceito: " + conceito[2]);
		else if(nota >= 85 && nota <= 100) System.out.println("Conceito: " + conceito[3]);
		else System.out.println("Valor invalido digitado");
	}

}