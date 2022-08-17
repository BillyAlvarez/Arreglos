import java.util.Scanner;

public class TareaArreglosOrdenarFormaUltimoPrimero {
    public static void main(String[] args) {

        /*
        Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
         Luego debemos mostrarlos en el siguiente orden: el último, el primero,
         el penúltimo, el segundo, el antepenúltimo, el tercero, y así sucesivamente.
        */

        int[] a = new int[10];

        Scanner s = new Scanner(System.in);
        for (int i = 0 ; i < a.length; i++){
            System.out.print("Ingrese un número : ");
            a[i] = s.nextInt();
        }

        int aux = a.length-1;

        for (int i=0; i< a.length/2; i++){
            System.out.println("numero  " + a[aux] );
            System.out.println("numero  " + a[i] );
            aux--;
        }

    }
}
