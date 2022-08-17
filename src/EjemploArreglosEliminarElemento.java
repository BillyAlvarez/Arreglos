import java.util.Scanner;

public class EjemploArreglosEliminarElemento {
    public static void main(String[] args) {

        int [] a = new int[10];
        int posicion;

        Scanner s = new Scanner(System.in);
        for (int i = 0 ; i < a.length; i++){
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();
        }
        System.out.println();

        System.out.println("Ingrese la posicion a eliminar (de 0 a 9 ) ");
        posicion = s.nextInt();


        for (int i = posicion; i< a.length-1; i++){
            a[i]= a[i+1];
            posicion++;
        }

        System.out.println("El nuevo arreglo ordenado : ");
        for (int i = 0; i < a.length; i++){
            System.out.println(i+ " => " + a[i]);
        }

        int [] b = new int[a.length-1];
        System.arraycopy(a,0,b,0,b.length); //copiar array

        a=b; // se asigna valor de array temporal b al array a

        for (int i = 0; i < a.length; i++){
            System.out.println(i+ " => " + a[i]);
        }
    }
}
