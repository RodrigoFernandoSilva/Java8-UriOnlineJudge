import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		double PI = 3.14159;

		Scanner scanner = new Scanner(System.in);
		double a, b, c;

		a = scanner.nextDouble(); b = scanner.nextDouble(); c = scanner.nextDouble();

		System.out.printf("TRIANGULO: %.3f\n", ((a * c) / 2.0));
		System.out.printf("CIRCULO: %.3f\n", (PI * Math.pow(c, 2)));
		System.out.printf("TRAPEZIO: %.3f\n", ((a + b) * c) / 2.0);
		System.out.printf("QUADRADO: %.3f\n", (Math.pow(b, 2)));
		System.out.printf("RETANGULO: %.3f\n", (a * b));
	}
}