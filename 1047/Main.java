import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		int inicioH, inicioM, fimH, fimM, horas, minutos;

		inicioH = scanner.nextInt();
		inicioM = scanner.nextInt();
		fimH = scanner.nextInt();
		fimM = scanner.nextInt();

		if (inicioH ==  fimH && inicioM == fimM) {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		} else {
			horas = fimH - inicioH;
			
			if (horas < 0) {
				horas = 24 + horas;
			}

			minutos = fimM - inicioM;

			if (minutos < 0) {
				minutos = 60 + minutos;
				//Esta forma da erro nos dados 10 12 10 11, fican dando horas negativas
				//horas--;
				//Por isso a necessidade de vereificar se as horas é igual a 0.
				horas = horas == 0 ? 23 : horas - 1;
			}
			
			System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");
		}
	}
}