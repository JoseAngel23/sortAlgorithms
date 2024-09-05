package ordenamientoinsercion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class OrdenamientoInsercion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vector[], nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de elementos a ordenar."));
                
        vector = new int[nElementos];
        
        System.out.println("Digite el vector: ");
        
        for (int i = 0; i < nElementos;i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            vector[i] = entrada.nextInt();
        }
        
        int pos, aux;
        
        // Ordenamiento por insercion
        for (int i = 0; i < nElementos; i ++) {
            pos = i;
            aux = vector[i];
            
            while((pos > 0) && (vector[pos - 1] > aux)) {
                vector[pos] = vector[pos - 1];
                pos --;
            }
            vector[pos] = aux;
        }
        
        System.out.println("\nOrden ascendente: ");
        for (int i = 0;i<vector.length;i++) {
            System.out.print(vector[i] + " - ");
        }
        System.out.println("");
        
        
        System.out.println("Orden descendente: ");
        for(int i = (nElementos - 1); i>= 0; i --) {
            System.out.print(vector[i] + " - ");
        }
    }
    
}
