import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int numero, horas;
		float salario;

		numero = scanner.nextInt();
		horas = scanner.nextInt();
		salario = scanner.nextFloat();

		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f\n", (horas * salario));
	}
}