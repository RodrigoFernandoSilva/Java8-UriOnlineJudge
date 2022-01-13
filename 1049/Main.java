import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		String[]  str = {"vertebrado/ave/carnivoro/aguia",
						 "vertebrado/ave/onivoro/pomba",
						 "vertebrado/mamifero/onivoro/homem",
						 "vertebrado/mamifero/herbivoro/vaca",
						 "invertebrado/inseto/hematofago/pulga",
						 "invertebrado/inseto/herbivoro/lagarta",
						 "invertebrado/anelideo/hematofago/sanguessuga",
						 "invertebrado/anelideo/onivoro/minhoca"};

		String p1, p2, p3;

		p1 = scanner.nextLine();
		p2 = scanner.nextLine();
		p3 = scanner.nextLine();

		for (int i = 0; i < str.length; i++) {
			if (str[i].contains(p1) && str[i].contains(p2) && str[i].contains(p3)) {
				str = str[i].split("/");
				System.out.println(str[str.length - 1]);
				break;
			}
		}
	}
}