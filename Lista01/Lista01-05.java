import java.util.Scanner;

public class Mes{
	
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		int numerodomes;
		String essemes;
		System.out.print("Digite um numero entre 1 e 12: ");
		numerodomes = s.nextInt();
		essemes =  qualmes(numerodomes);

		System.out.println("O mes que voce digitou corresponde a: " + essemes);


	}

	public static String qualmes(int umnumero){

		switch(umnumero){
			case 1 : return "Janeiro";
			case 2 : return "Fevereiro";
			case 3 : return "Março";
			case 4 : return "Abril";
			case 5 : return "Maio";
			case 6 : return "Junho";
			case 7 : return "Julho";
			case 8 : return "Agosto";
			case 9 : return "Setembro";
			case 10 : return "Outubro";
			case 11 : return "Novembro";
			case 12 : return "Dezembro";
			default : return "Voce nao digitou um mes valido!";
		}

	}

}