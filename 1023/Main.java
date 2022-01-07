import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		double a, b, c, delta, r1, r2;

		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();

		delta = Math.pow(b, 2) - (4 * a * c);
		
		if (delta < 0 || a == 0) {
			System.out.println("Impossivel calcular");
		} else {
			r1 = (-b + Math.sqrt(delta)) / (2 * a);
			r2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.printf("R1 = %.5f\n", r1);
			System.out.printf("R2 = %.5f\n", r2);
		}
	}
}