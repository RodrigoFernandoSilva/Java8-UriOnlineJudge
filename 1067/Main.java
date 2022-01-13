import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		int entrada;
		
		entrada = scanner.nextInt();

		for (int i = 1; i <= entrada; i++) {
			if ((i % 2) != 0) {
				System.out.println(i);
			}
		}
	}
}