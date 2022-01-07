import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		float n1, n2, n3, n4, exame, media1, media2;

		n1 = scanner.nextFloat();
		n2 = scanner.nextFloat();
		n3 = scanner.nextFloat();
		n4 = scanner.nextFloat();
		
		media1 = ((n1 * 2.0f) + (n2 * 3.0f) + (n3 * 4.0f) + (n4 * 1.0f)) / 10.0f;
		
		System.out.printf("Media: %.1f\n", media1);
		if (media1 >= 7.0) {
			System.out.println("Aluno aprovado.");
		} else if (media1 < 5.0) {
			System.out.println("Aluno reprovado.");
		} else {
			System.out.println("Aluno em exame.");

			exame = scanner.nextFloat();

			System.out.printf("Nota do exame: %.1f\n", exame);

			media2 = (media1 + exame) / 2.0f;

			if (media2 >= 5.0) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}

			System.out.printf("Media final: %.1f\n", media2);
		}
	}
}