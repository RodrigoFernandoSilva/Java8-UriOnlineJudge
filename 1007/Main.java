import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n1, n2, n3, n4;

		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		n3 = scanner.nextInt();
		n4 = scanner.nextInt();

		System.out.println("DIFERENCA = " + (n1 * n2 - n3 * n4));
	}
}