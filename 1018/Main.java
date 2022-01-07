import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		int dinheiro, backup;
		int nota100, nota50, nota20, nota10, nota5, nota2;

		dinheiro = scanner.nextInt();
		backup = dinheiro;

		nota100 = (dinheiro - (dinheiro % 100)) / 100;
		dinheiro -= (nota100 * 100);
		nota50 = dinheiro / 50;
		dinheiro -= (nota50 * 50);
		nota20 = dinheiro / 20;
		dinheiro -= (nota20 * 20);
		nota10 = dinheiro / 10;
		dinheiro -= (nota10 * 10);
		nota5 = dinheiro / 5;
		dinheiro -= (nota5* 5);
		nota2 = dinheiro / 2;
		dinheiro -= (nota2 * 2);

		System.out.println(backup);
		System.out.println(nota100 + " nota(s) de R$ 100,00");
		System.out.println(nota50 + " nota(s) de R$ 50,00");
		System.out.println(nota20 + " nota(s) de R$ 20,00");
		System.out.println(nota10 + " nota(s) de R$ 10,00");
		System.out.println(nota5 + " nota(s) de R$ 5,00");
		System.out.println(nota2 + " nota(s) de R$ 2,00");
		System.out.println(dinheiro + " nota(s) de R$ 1,00");
	}
}