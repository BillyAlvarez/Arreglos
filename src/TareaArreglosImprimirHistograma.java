import java.util.Scanner;

public class TareaArreglosImprimirHistograma {
    public static void main(String[] args) {
/*
        Escribir un programa que recorra un arreglo y genere un histograma en base a los valores de este.
        El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.
        Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento aparece en un conjunto de datos,
        es decir debe mostrar la frecuencia para todos los números del 1 al 6, incluso si no están presente en el arreglo.
                Por ejemplo para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:
        1: ***
        2:
        3: *
        4: *****
        5: *
        6: **
        Para la tarea usaremos el asterisco(*) como representación gráfica para el histograma.
*/

        int[] a = new int[12];
        String[] b = new String[6];

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un número (rango 1 a 6): ");
            a[i] = s.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = "";
        }

        for (int i = 0; i < a.length; i++) {
            switch (a[i]) {
                case 1:
                    b[0] = b[0].concat("*");
                    break;
                case 2:
                    b[1] = b[1].concat("*");
                    break;
                case 3:
                    b[2] = b[2].concat("*");
                    break;
                case 4:
                    b[3] = b[3].concat("*");
                    break;
                case 5:
                    b[4] = b[4].concat("*");
                    break;
                case 6:
                    b[5] = b[5].concat("*");
                    break;
                default:
            }
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println(i + " = " + b[i]);
        }

    }
}
