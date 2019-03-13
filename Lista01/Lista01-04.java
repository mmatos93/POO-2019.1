import java.util.Scanner;

public class Aprovacao{
	
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		double[] notas = new double[4];
		double media;
		System.out.print("Digite a primeira nota: ");
		notas[0] = s.nextDouble();
		System.out.print("Digite a segunda nota: ");
		notas[1] = s.nextDouble();
		System.out.print("Digite a terceira nota: ");
		notas[2] = s.nextDouble();
		System.out.print("Digite a quarta nota: ");
		notas[3] = s.nextDouble();

		media = (notas[0] + notas[1] + notas[2] + notas[3])/notas.length;
		if(media >= 7.0){
			System.out.println("O aluno foi aprovado!");
		}
		else if(media >= 5.0 && media < 7.0){
			System.out.println("O aluno vai fazer final.");
		}
		else {
			System.out.println("O aluno foi reprovado.");
		}

	}

}