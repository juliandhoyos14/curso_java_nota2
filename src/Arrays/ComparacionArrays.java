package Arrays;

public class ComparacionArrays {

    public static void main(String[] args) {
        int arr1[] = new int[] {
                1, 2, 3, 4
        };

        int arr2[] = new int[] {
                1, 2, 4, 4
        };

        boolean sonIguales = true;

        int longitudArr1 = arr1.length;
        int longitudArr2 = arr2.length;

        if (longitudArr1 != longitudArr2) {
            sonIguales = false;
        }

        if(sonIguales) {
            for (int i = 0; i < longitudArr1; i++) {
                if (arr1[i] != arr2[i]) {
                    sonIguales = false;
                    break;
                }
            }
        }

        if (sonIguales) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays no son iguales");
        }
    }
}
