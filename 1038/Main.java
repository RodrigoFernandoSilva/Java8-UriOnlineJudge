import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		int codigo, quantidade;
		double total;
		double[] tabela = {4, 4.50, 5, 2, 1.50};

		codigo = scanner.nextInt();
		quantidade = scanner.nextInt();
		
		total = tabela[codigo - 1] * quantidade;

		System.out.printf("Total: R$ %.2f\n", total);
	}
}