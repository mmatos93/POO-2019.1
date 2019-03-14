import java.util.Scanner;

class Lista01_11{

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int codigo, controle = 0, qtdprodutos;
		String produto;
		double totalapagar = 0.0;

		System.out.println("Quantos produtos foram pedidos?");
		qtdprodutos = s.nextInt();

		while(controle < qtdprodutos){
			int qtdindividual = 0;
			System.out.println("Informe o código do produto:");
			codigo = s.nextInt();
			System.out.println("Informe a quantidade:");
			qtdindividual = s.nextInt();

			if(codigo == 10) totalapagar += qtdindividual*1.50;
			else if(codigo == 11) totalapagar += qtdindividual*1.80;
			else if(codigo == 12) totalapagar += qtdindividual*1.90;
			else if(codigo == 20) totalapagar += qtdindividual*10.0;
			else if(codigo == 30) totalapagar += qtdindividual*8.0;
			else if(codigo == 50) totalapagar += qtdindividual*2.50;

			controle += qtdindividual;

		}

		if(totalapagar > 50.00){

			totalapagar -= totalapagar*(0.05);

		}

		System.out.println("Seu lanche custou: R$ " + totalapagar);

	}
}