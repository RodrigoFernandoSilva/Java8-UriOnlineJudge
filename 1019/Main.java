import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		int tempo;
		int horas, minutos, segundos;

		tempo = scanner.nextInt();

		horas = (tempo - (tempo % 3600)) / 3600;
		tempo -= (horas * 3600);
		minutos = (tempo - (tempo % 60)) / 60;
		tempo -= (minutos * 60);
		segundos = tempo;

		System.out.println(horas + ":" + minutos + ":" + segundos);
	}
}