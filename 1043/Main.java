import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        float a, b, c;
        
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();

        if (a + b > c && b + c > a && c + a > b) {
            System.out.printf("Perimetro = %.1f\n", (a + b + c));
        } else {
            System.out.printf("Area = %.1f\n", (((a + b) * c) / 2));
        }
    }
}