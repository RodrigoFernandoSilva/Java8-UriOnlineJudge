import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		final double PI 3.14159f;

		Scanner scanner = new Scanner(System.in);
		double raio, volume;

		raio = scanner.nextDouble();
		volume = (4.0f/3.0f) * PI * Mathf.Pow(raio, 3)

		System.out.printf("VOLUME = %.2f\n", volume);
	}
}