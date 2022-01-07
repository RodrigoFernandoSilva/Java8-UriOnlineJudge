import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		int idadeEmDias;
		int ano, mes, dia;

		idadeEmDias = scanner.nextInt();

		ano = (idadeEmDias - (idadeEmDias % 365)) / 365;
		idadeEmDias -= (ano * 365);
		mes = (idadeEmDias - (idadeEmDias % 30)) / 30;
		idadeEmDias -= (mes * 30);
		dia = idadeEmDias;

		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
	}
}