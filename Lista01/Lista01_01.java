import java.util.Scanner;

public class Lista01_01{
	
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		double metrosegundo;
		double kilometrohora;

		System.out.print("Digite a velocidade em m/s: ");
		metrosegundo = s.nextDouble();
		kilometrohora = metrosegundo*3.6;
		System.out.println("A velocidade em km/h e:" + kilometrohora);

	}


}