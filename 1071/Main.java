import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		int menor, maior, soma;
		
		menor = scanner.nextInt();
		maior = scanner.nextInt();

		if (menor > maior) {
			soma = maior;
			maior = menor;
			menor = soma;
		}

		soma = 0;
		for (int i = menor + 1; i < maior; i++) {
			if ((i % 2) != 0) {
				soma += i;
			}
		}

		System.out.println(soma);
	}
}