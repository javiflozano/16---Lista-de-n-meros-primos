import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author: Javi F. Lozano
 * Date: 30 oct 2024
 * Description: Programa que calcula los números primos hasta un número máximo ingresado por consola
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> primos = new ArrayList<>();
        primos.add(2); // Añadimos el primer número primo, para evitar que la lista esté vacía
        System.out.println("Programa para calcular números primos");
        System.out.println("Introduce hasta qué numero quieres los primos");
        int limit = scanner.nextInt();

        scanner.nextLine();
        for (int numero = 3; numero <= limit; numero++){
            boolean isPrimo = true;
            for (int primo: primos){
                if (numero%primo == 0){
                    isPrimo = false;
                }
            }
            if (isPrimo) primos.add(numero);
        }
        System.out.println("La lista de primos es: ");
        System.out.println(primos);
    }
}
