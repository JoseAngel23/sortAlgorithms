package shellsort;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ShellSort {
    public static void main(String[] args) {
        int salto, i, j, k, aux;

        Scanner entrada = new Scanner(System.in);
        int vector[], nElementos;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de elementos a ordenar."));

        vector = new int[nElementos];

        System.out.println("Digite el vector: ");

        for (int o = 0; o < vector.length; o++) {
            System.out.print((o + 1) + ". Ingrese el numero: "); // Corrección aquí
            vector[o] = entrada.nextInt();
        }

        salto = vector.length / 2;

        while (salto > 0) {
            for (i = salto; i < vector.length; i++) {
                j = i - salto;
                while (j >= 0) {
                    k = j + salto;
                    if (vector[j] <= vector[k]) {
                        break; // Agregar break para salir del bucle while
                    } else {
                        aux = vector[j];
                        vector[j] = vector[k];
                        vector[k] = aux;
                        j -= salto;
                    }
                }
            }
            salto = salto / 2; // Reducir el tamaño del salto
        }

        System.out.println("\nOrden ascendente: ");
        for (int m = 0; m < vector.length; m++) {
            System.out.print(vector[m] + " - ");
        }
        System.out.println("");
        
        System.out.println(5/2);

    }

}
