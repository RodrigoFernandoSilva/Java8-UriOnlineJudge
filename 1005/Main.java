import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		double n1, n2, media;
		n1 = scanner.nextFloat();
		n2 = scanner.nextFloat();
		n1 = n1 * 3.5f;
		n2 = n2 * 7.5f;
		media = ((n1 + n2) / 11);

		System.out.printf("MEDIA = %.5f\n", media);
	}
}