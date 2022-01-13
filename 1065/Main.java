import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		final int QUANT_ENTRADAS = 5;

		Scanner scanner = new Scanner(System.in);

		int quantPar = 0;
		float entrada;

		for (int i = 0; i < QUANT_ENTRADAS; i++) {
			entrada = scanner.nextFloat();

			if ((entrada % 2) == 0) {
				quantPar++;
			}
		}

		System.out.println(quantPar + " valores pares");
	}
}