package Arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tamanio = 0;

        try {
            System.out.println("Ingrese el tamanio del triangulo");
            tamanio = sc.nextInt();

            for (int i = 1; i <= tamanio; i++) {
                String linea = new String("");
                for (int j = 0; j < i; j ++) {
                    linea = linea.concat("*");
                }
                System.out.println(linea);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ingresaste un valor errado, vuelve a intentar");
            sc.next();
        }
    }
}
