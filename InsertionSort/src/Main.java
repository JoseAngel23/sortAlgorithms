public class Main {
    public static void main(String[] args) {
        int[] arreglo = {4, 3, 1, 5, 2};

        printArray(insertionSort(arreglo));
    }

    public static int[] insertionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            int pos = i;
            while (pos > 0 && arr[pos - 1] > number) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = number;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}