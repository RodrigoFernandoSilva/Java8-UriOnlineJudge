import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		int quantEntradas;
		
		quantEntradas = scanner.nextInt();

		for (int i = 1; i <= quantEntradas; i++) {
			if ((i % 2) == 0) {
				System.out.println(i + "^2" + " = " + (int)Math.pow(i, 2));
			}
		}
	}
}