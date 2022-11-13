/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busqueda_lineal_binaria;

/**
 *
 * @author davidcarbomartinez
 */
public class Busqueda_lineal_binaria {

    /**
     * @param args the command line arguments
     */
    
    // Búsqueda líneal (no es necesario que el array esté ordenado)(eficacia -> O(n)
    public static boolean busquedaLineal(int[] array, int elemento) {
        boolean encontrado = false;

        for (int i = 0; i < array.length && !false; i++) {
            if (array[i] == elemento) {
                encontrado = true;
            }
        }
        if (encontrado == true) {
            System.out.println("El número " + elemento + " si que está");
        } else {
            System.out.println("El número " + elemento + " no está");
        }
        return encontrado;
    }
    
    // Búsqueda binaria (es necesario que el array esté ordenado) (eficacia -> O(log n)
    public static boolean busquedaBinaria (int[] array, int elemento) {
        boolean encontrado = false; 
        int inicio = 0; 
        int fin = array.length -1; 
        int posicion_buscar;
        
        while (inicio <= fin && !encontrado) {
            posicion_buscar = (inicio + fin) / 2;
            if (array[posicion_buscar] == elemento) {
                encontrado = true; 
            } else {
                if (elemento > array[posicion_buscar])
                    inicio = posicion_buscar + 1;
                else {
                    fin = posicion_buscar - 1;
                }
            }
        }
        return encontrado; 
    }
    
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

    public static void main(String[] args) {
        int[] arrayD = new int[10];
        // Rellenando el array (números aleatorios)
        for (int i = 0; i < arrayD.length; i++) {
            arrayD[i] = (int) (Math.random() * 10 + 1);
        }
        // Ordenando array 
         ordenacionBurbuja(arrayD);
        // Mostrando el array por pantalla
        System.out.print("{");
        for (int i = 0; i < arrayD.length; i++) {
            System.out.print(arrayD[i]);
            if (i < arrayD.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
        
        //Buscando un número X dentro del array
        busquedaBinaria(arrayD, 8);
        System.out.println(busquedaBinaria(arrayD, 8));
    }

}
