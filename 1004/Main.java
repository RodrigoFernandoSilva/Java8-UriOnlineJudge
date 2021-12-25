import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		int n1, n2, prod;
		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		prod = n1 * n2;

		System.out.println("PROD = " + prod);
	}
}