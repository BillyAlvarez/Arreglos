import java.util.Scanner;

public class TareaArreglosSistemaEstadisticoArreglo {
    public static void main(String[] args) {

        /*
        Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio de los números positivos,
         el promedio de los negativos y contar el número de ceros.
         */

        int[] a = new int[7];

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un número (puede ser; positivo, negativo o cero) : ");
            a[i] = s.nextInt();
        }

        int  ceros = 0, posCont = 0, negCont = 0;
        double promPos = 0, promNeg = 0,positivos = 0, negativos = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                positivos += a[i];
                posCont++;
            } else if (a[i] < 0) {
                negativos += a[i];
                negCont++;
            } else {
                ceros++;
            }
        }

        if (posCont > 0) {
            promPos = positivos / posCont;
            System.out.println("El promedio de numeros positivos es : " + promPos);
        } else if (negCont > 0) {
            promNeg = negativos / negCont;
            System.out.println("El promedio de numeros negativos es : " + promNeg);
        }

        if (posCont == 0) {
            System.out.println("No se encontraron numeros positivos");
        }
        if (negCont == 0) {
            System.out.println("No se encontraron numeros negativos");
        }
        System.out.println("La cantidad de ceros es :" + ceros);

    }
}
