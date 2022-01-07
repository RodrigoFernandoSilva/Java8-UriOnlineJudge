import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        int v1, v2;
        
        v1 = scanner.nextInt();
        v2 = scanner.nextInt();

        if (v1 % v2 == 0 || v2 % v1 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}