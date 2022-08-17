import java.util.Arrays;
import java.util.Scanner;

public class TareaArreglosMayorOcurrencia {
    public static void main(String[] args) {

        /*
        Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9).
        Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y también imprimir la cantidad de veces que aparece en el arreglo.
        Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}
        Como resultado debería imprimir lo siguiente:
        La mayor ocurrencias es: 3
        El elemento que mas se repite es: 5
        En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces.
         */

        int[] a = new int[10];

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un número : ");
            a[i] = s.nextInt();
        }

        Arrays.sort(a);
        int cont = 0, num = 0, numMax = 0;

        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] == a[i + 1]) {
                cont++;
                if (cont > numMax) {
                    num = a[i];
                    numMax = cont;
                }
            } else if (cont <= numMax) {
                cont = 0;
            }
        }

        System.out.println( " La mayor ocurrencias es: " + (numMax + 1) + " veces.");
        System.out.println("El elemento que mas se repite es : "  + num );

    }
}
