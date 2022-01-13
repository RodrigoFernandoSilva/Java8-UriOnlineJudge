import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		int quantEntradas;
		
		quantEntradas = scanner.nextInt();

		for (int i = 0; i < quantEntradas; i++) {
			if (entrada >= 10 && entrada <= 20) {
				dentro++;
			}
		}

		System.out.println(dentro + " in");
		System.out.println((quantEntradas - dentro) + " out");
	}
}