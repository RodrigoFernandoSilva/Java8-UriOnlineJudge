import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String nome;
		double salario, montante;

		nome = scanner.nextLine();
		salario = scanner.nextFloat();
		montante = scanner.nextFloat();

		System.out.printf("TOTAL = R$ %.2f\n", (salario + ((montante * 15f) / 100f)));
	}
}