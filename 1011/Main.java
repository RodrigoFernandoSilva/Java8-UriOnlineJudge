import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String[] split;
		String[] linhas = new String[2];
		int[] numero = new int[2];
		double total = 0;

		linhas[0] = scanner.nextLine();
		linhas[1] = scanner.nextLine();

		for (int i = 0; i < linhas.length; i++) {
			split = linhas[i].split(" ");
			total += (Integer.parseInt(split[1]) * Float.valueOf(split[2]));
		}

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
	}
}