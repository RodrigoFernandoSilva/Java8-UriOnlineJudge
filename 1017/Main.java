import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		int temp, velo;
		double gasto;

		temp = scanner.nextInt();
		velo = scanner.nextInt();

		gasto = (temp * velo) / 12f;

		System.out.printf("%.3f\n", gasto);
	}
}