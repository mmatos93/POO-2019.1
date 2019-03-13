import java.util.Scanner;

public class Lista01_03{
	
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		double nota1, nota2, nota3;
		double media;
		System.out.print("Digite a primeira nota: ");
		nota1 = s.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = s.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = s.nextDouble();

		media = (nota1*2 + nota2*3 + nota3*5)/(2+3+5);
		System.out.println("A media do aluno e: " + media);

	}

}