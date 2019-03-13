import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalculaIdade{

	public static void main(String[] args){

		Calendar cal = GregorianCalendar.getInstance();
		Scanner s = new Scanner(System.in);
		int anoatual, anonascimento;
		anoatual = cal.get(Calendar.YEAR);
		System.out.println("Ano em que voce nasceu:");
		anonascimento = s.nextInt();
		System.out.println("Sua idade e: " + (anoatual-anonascimento) + " anos.");
		

	}

}