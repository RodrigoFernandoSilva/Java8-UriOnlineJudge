import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        double temp;
        double[] entradas = new double[3];
        boolean repetir = true;

        for (int i = 0; i < entradas.length; i++) {
            entradas[i] = scanner.nextDouble();
        }
        
        while (repetir) {
            repetir = false;

            for (int i = 0; i < entradas.length - 1; i++) {
                if (entradas[i] < entradas[i + 1]) {
                    temp = entradas[i];
                    entradas[i] = entradas[i + 1];
                    entradas[i + 1] = temp;
					
					repetir = true;
                }
            }
        }
		
        if (entradas[0] >= (entradas[1] + entradas[2])) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.pow(entradas[0], 2) == (Math.pow(entradas[1], 2) + Math.pow(entradas[2], 2))) {
                System.out.println("TRIANGULO RETANGULO");
            } if (Math.pow(entradas[0], 2) > (Math.pow(entradas[1], 2) + Math.pow(entradas[2], 2))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } if (Math.pow(entradas[0], 2) < (Math.pow(entradas[1], 2) + Math.pow(entradas[2], 2))) {
                System.out.println("TRIANGULO ACUTANGULO");
            } if (entradas[0] == entradas[1] &&
                entradas[1] == entradas[2] &&
                entradas[2] == entradas[0]) {
                
                System.out.println("TRIANGULO EQUILATERO");
            } else if((entradas[0] == entradas[1]) ||
                 (entradas[1] == entradas[2]) ||
                 (entradas[2] == entradas[0])) {
                
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}