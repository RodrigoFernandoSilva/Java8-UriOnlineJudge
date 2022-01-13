import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		double salario, reajuste;
		int porcentagem;

		salario = scanner.nextFloat();
		
		if (salario <= 400.0) {
			porcentagem = 15;
		} else if (salario > 400.0 && salario <= 800.0) {
			porcentagem = 12;
		} else if (salario > 800.0 && salario <= 1200.0) {
			porcentagem = 10;
		} else if (salario > 1200.0 && salario <= 2000.0) {
			porcentagem = 7;
		} else {
			porcentagem = 4;			
		}
		
		reajuste = (salario * porcentagem) / 100;

		System.out.printf("Novo salario: %.2f\n", (salario + reajuste));
		System.out.printf("Reajuste ganho: %.2f\n", reajuste);
		System.out.println("Em percentual: " + porcentagem + " %");
	}
}