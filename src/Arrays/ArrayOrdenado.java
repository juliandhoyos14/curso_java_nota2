package Arrays;

public class ArrayOrdenado {

    public static void main(String[] args) {

        int[] array = new int[1000];
        int auxiliar;

        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }

        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length -i - 1; j++) {
                if(array[j + 1] < array[j]) {
                    auxiliar = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = auxiliar;
                }
            }
        }

        System.out.println("Array Ordenado Ascendente");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
