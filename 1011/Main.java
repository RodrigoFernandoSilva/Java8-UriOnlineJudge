import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		double PI = 3.14159;

		Scanner scanner = new Scanner(System.in);
		double raio, volume;

		raio = scanner.nextDouble();
		volume = (4.0/3.0) * PI * Math.pow(raio, 3);

		System.out.printf("VOLUME = %.3f\n", volume);
	}
}