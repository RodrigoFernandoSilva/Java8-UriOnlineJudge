import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		int a, b, c;

		a = scanner.nextInt(); b = scanner.nextInt(); c = scanner.nextInt();
		a = (a + b + Math.abs(a - b)) / 2;
		a = (a + c + Math.abs(a - c)) / 2;
		System.out.println(a + " eh o maior");
	}
}