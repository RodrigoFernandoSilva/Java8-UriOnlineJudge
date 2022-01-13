import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		int entrada;
		
		entrada = scanner.nextInt();

		if ((entrada % 2) == 0) {
			entrada++;
		}

		for (int i = entrada; i < entrada + 12; i+=2) {
			System.out.println(i);
		}
	}
}