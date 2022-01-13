import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		float entrada;
		int positivos = 0;

		for (int i = 0; i < 6; i++) {
			entrada = scanner.nextFloat();

			if (entrada > 0) {
				positivos++;
			}
		}

		System.out.println(positivos + " valores positivos");
	}
}