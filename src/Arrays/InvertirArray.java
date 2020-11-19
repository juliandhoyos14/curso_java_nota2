package Arrays;

import java.util.Scanner;

public class InvertirArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String array1[] = new String[5];
        String array2[] = new String[5];
        int index2 = 0;
        for (int i = 0; i <= 4; i++) {
            System.out.println("Ingrese el valor " + (i + 1) + " del array");
            array1[i] = sc.next();
        }

        for (int i = array1.length; i > 0; i--) {
            array2[index2] = new String(array1[i-1]);
            index2++;
        }

        System.out.println("Array 1");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        System.out.println("Array 2");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array2[i]);
        }

    }
}
