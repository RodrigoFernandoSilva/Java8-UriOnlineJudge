import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		float x, y;

		x = scanner.nextFloat();
		y = scanner.nextFloat();

		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		} else if (x == 0.0 && y != 0.0) {
			System.out.println("Eixo Y");
		} else if (y == 0.0 && x != 0.0) {
			System.out.println("Eixo X");
		} else if (y > 0.0) {
			if (x > 0.0) {
				System.out.println("Q1");
			} else {
				System.out.println("Q2");
			}
		} else if (x > 0.0) {
			System.out.println("Q4");
		} else {
			System.out.println("Q3");
		}
	}
}