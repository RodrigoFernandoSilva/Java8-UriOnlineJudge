import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		String[]  inlgesMesses = {"January",
						 "February",
						 "March",
						 "April",
						 "May",
						 "June",
						 "July",
						 "August",
						 "September",
						 "October",
						 "November",
						 "December"};

		int intMes;

		intMes = scanner.nextInt();

		System.out.println(inlgesMesses[intMes - 1]);
	}
}