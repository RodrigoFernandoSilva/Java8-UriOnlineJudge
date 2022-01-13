import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		final int QUANT_ENTRADAS = 5;

		Scanner scanner = new Scanner(System.in);

		int entrada, quantPar = 0, quantPos = 0, quantNeg = 0;

		for (int i = 0; i < QUANT_ENTRADAS; i++) {
			entrada = scanner.nextInt();
			
			if ((entrada % 2) == 0) {
				quantPar++;
			}

			if (entrada > 0) {
				quantPos++;
			} else if (entrada < 0) {
				quantNeg++;
			}
		}

		System.out.println(quantPar + " valor(es) par(es)");
		System.out.println((QUANT_ENTRADAS - quantPar) + " valor(es) impar(es)");
		System.out.println(quantPos + " valor(es) positivo(s)");
		System.out.println(quantNeg + " valor(es) negativo(s)");
	}
}