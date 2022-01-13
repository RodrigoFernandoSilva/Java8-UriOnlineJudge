import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		int inicioD, inicioH, inicioM, inicioS, fimD, fimH, fimM, fimS;
		int dias = 0, horas = 0, minutos = 0, segundos = 0;
		String entrada;
		String[] split;

		//Ler o dia de inicio
		entrada = scanner.nextLine();
		split = entrada.split(" ");
		inicioD = Integer.parseInt(split[1]);
		entrada = scanner.nextLine();
		split = entrada.split(":");
		inicioH = Integer.parseInt(split[0].trim());
		inicioM = Integer.parseInt(split[1].trim());
		inicioS = Integer.parseInt(split[2].trim());

		//Ler o dia final
		entrada = scanner.nextLine();
		split = entrada.split(" ");
		fimD = Integer.parseInt(split[1]);
		entrada = scanner.nextLine();
		split = entrada.split(":");
		fimH = Integer.parseInt(split[0].trim());
		fimM = Integer.parseInt(split[1].trim());
		fimS = Integer.parseInt(split[2].trim());
		
		//Calcula os dias
		dias = fimD - inicioD;
		horas = fimH - inicioH;
		if (horas < 0) {
			dias--;
			horas = 24 + horas;
		}
		minutos = fimM - inicioM;
		if (minutos < 0) {
			horas--;
			minutos = 60 + minutos;

			if (horas < 0) {
				horas = 23;
				//Se ficar menor q 0 significa que passou de 24h, então tem que tirar
				//um dia, exemplo disso acontece com essas entradas:
				//Dia 5
				//08 : 12 : 23
				//Dia 5
				//09 : 12 : 22
				dias--;
			}
		}
		segundos = fimS - inicioS;
		if (segundos < 0) {
			minutos--;
			segundos = 60 + segundos;

			if (minutos < 0) {
				minutos = 59;
				horas--;
			}
		}

		System.out.println(dias + " dia(s)");
		System.out.println(horas + " hora(s)");
		System.out.println(minutos + " minuto(s)");
		System.out.println(segundos + " segundo(s)");
	}
}