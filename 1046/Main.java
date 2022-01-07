import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        int inicio, fim, horas;

        inicio = scanner.nextInt();
        fim = scanner.nextInt();

        if (fim > inicio) {
            horas = fim - inicio;
        } else {
            horas = (24 - inicio) + fim;
        }
        
        System.out.printf("O JOGO DUROU %d HORA(S)\n", ((fim > inicio) ? (fim - inicio) : ((24 - inicio) + fim)));
    }
}