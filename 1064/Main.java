import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		final int QUANT_ENTRADAS = 6;

		Scanner scanner = new Scanner(System.in);

		int quantPos = 0;
		float entrada, soma = 0;

		for (int i = 0; i < QUANT_ENTRADAS; i++) {
			entrada = scanner.nextFloat();

			if (entrada > 0) {
				quantPos++;
				soma += entrada;
			}
		}

		System.out.println(quantPos + " valores positivos");
		System.out.printf("%.1f\n", (soma / quantPos));
	}
}