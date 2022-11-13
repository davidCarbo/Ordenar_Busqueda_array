/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package burbuja_seleccion_insercion;

/**
 *
 * @author davidcarbomartinez
 */
public class Burbuja_seleccion_insercion {

    /**
     * @param args the command line arguments
     */
    public static void imprimirArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    // Estos 3 métodos tienen una eficiencia de O (n2)
    public static void ordenacionBurbuja(int[] array) {
        int i, j, auxiliar;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    auxiliar = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = auxiliar;
                }
            }
        }

    }
    
    public static void ordenacionSeleccion(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minimo = i; 
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minimo]) {
                    minimo = j; 
                }
            }
            int aux = array[i]; 
            array[i] = array[minimo]; 
            array[minimo] = aux; 
        }
    }
    
    public static void ordenacionInsercion(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int aux = array[i];
            
            while ((pos > 0) && (array[pos-1] > aux)) {
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = aux;
        }
    }
    
    public static void main(String[] args) {
        int[] array = {-76,2,-1,9,4,44,3,8};
        ordenacionInsercion(array);
        imprimirArray(array);
    }
    
}
