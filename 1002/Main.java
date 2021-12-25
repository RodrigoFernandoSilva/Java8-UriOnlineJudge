import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
		final double PI = 3.14159;
		
		Scanner scan = new Scanner(System.in);
		double raio, area;
		
		raio = scan.nextDouble();
		area = PI * (raio * raio);
		
        System.out.printf("A=%.4f\n", area);
    }
}