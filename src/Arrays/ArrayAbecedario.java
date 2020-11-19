package Arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayAbecedario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        int posicionVisualizar;
        int valorAsciiMenor = 65;
        int valorAsciiMayor = 90;
        int valorAsciiActual = 65;
        int longitudArray = valorAsciiMayor - valorAsciiMenor + 1;
        int[] arrayAlfabeto = new int[longitudArray];

        for (int i = 0; i < longitudArray; i++) {
            arrayAlfabeto[i] = valorAsciiActual;
            valorAsciiActual++;
        }

        while (!salir) {

            System.out.println("1. Imprimir posicion del Array");
            System.out.println("2. Salir");

            try {

                System.out.println("Digita una de las opciones");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Digite la posicion del arreglo que desea visualizar");
                        posicionVisualizar = sc.nextInt();
                        if (posicionVisualizar < longitudArray) {
                            System.out.println("Valor ASCII del caracter = " + arrayAlfabeto[posicionVisualizar]);
                            System.out.println("Caracter = " + (char) arrayAlfabeto[posicionVisualizar]);
                        } else {
                            System.out.println("El array solo tiene " + arrayAlfabeto.length + " elementos desde la posicion 0 a la 25");
                        }
                        break;
                    case 2:
                        salir = true;
                        break;
                    default:
                        System.out.println("La opcion es solo numeros entre 1 y 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresaste un valor errado, selecciona una opcion valida");
                sc.next();
            }
        }
    }
}
