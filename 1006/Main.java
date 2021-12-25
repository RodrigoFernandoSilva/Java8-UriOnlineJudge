import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		double n1, n2, n3, media;
		n1 = scanner.nextFloat() * 2;
		n2 = scanner.nextFloat() * 3f;
		n3 = scanner.nextFloat() * 5;

		media = ((n1 + n2 + n3) / 10);

		System.out.printf("MEDIA = %.1f\n", media);
	}
}