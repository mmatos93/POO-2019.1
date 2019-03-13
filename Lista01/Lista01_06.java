import java.util.Scanner;

public class Lista01_06{

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		String nome;
		int diarias;
		System.out.print("Digite o nome do cliente: ");
		nome = s.nextLine();
		System.out.print("Digite a quantidade de diarias: ");
		diarias = s.nextInt();

		if(diarias > 15){
			System.out.println("Cliente: " + nome + " , total da conta: R$ " + (60*diarias+5.50));
		}
		else if(diarias == 15){
			System.out.println("Cliente: " + nome + " , total da conta: R$ " + (60*diarias+6.0));
		}
		else {
			System.out.println("Cliente: " + nome + " , total da conta: R$ " + (60*diarias+8.0));
		}

	}

}