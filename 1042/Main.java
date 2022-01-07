import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        boolean ordenar = false;
        int[] entradas = new int[3];
        int[] entradasBackup = new int[entradas.length];
        int temp;
        
        for (int i = 0; i < entradas.length; i++) {
            entradas[i] = scanner.nextInt();
            entradasBackup[i] = entradas[i];
        }

        while (!ordenar) {
            ordenar = true;

            for (int i = 0; i < entradas.length - 1; i++) {
                if (entradas[i] > entradas[i + 1]) {
                    temp = entradas[i];
                    entradas[i] = entradas[i + 1];
                    entradas[i + 1] = temp;
                    ordenar = false;
                }
            }
        }

        Batata(entradas);
        System.out.println();
        Batata(entradasBackup);
    }

    public static void Batata(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}