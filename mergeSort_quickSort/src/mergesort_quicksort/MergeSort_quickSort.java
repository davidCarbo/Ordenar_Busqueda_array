/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mergesort_quicksort;

/**
 *
 * @author davidcarbomartinez
 */
public class MergeSort_quickSort {

    /**
     * @param args the command line arguments
     */
    
    // Al llamarlo, en este caso tienes que poner el valor de la izquierda y valor de la derecha.
    // En este link de youtube, el codigo es más largo, pero solo hace falta poner el array: https://www.youtube.com/watch?v=bOk35XmHPKs
    // Eficiencia O (n log n)
    public static void mergeSort(int A[], int izq, int der) {
        if (izq < der) {
            int m = (izq + der) / 2;
            mergeSort(A, izq, m);
            mergeSort(A, m + 1, der);
            merge(A, izq, m, der);
        }
    }

    public static void merge(int A[], int izq, int m, int der) {
        int i, j, k;
        int[] B = new int[A.length]; //array auxiliar
        for (i = izq; i <= der; i++) //copia ambas mitades en el array auxiliar                                       
        {
            B[i] = A[i];
        }

        i = izq;
        j = m + 1;
        k = izq;

        while (i <= m && j <= der) //copia el siguiente elemento más grande                                      
        {
            if (B[i] <= B[j]) {
                A[k++] = B[i++];
            } else {
                A[k++] = B[j++];
            }
        }

        while (i <= m) //copia los elementos que quedan de la primera mitad (si los hay)
        {
            A[k++] = B[i++];
        }
    }

    public static void main(String[] args) {
        int[] array = {22, 45, 67, -4, -76, 5, 5, 6, 7, 55, -7, 89};
        mergeSort(array, 0, array.length - 1);
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
