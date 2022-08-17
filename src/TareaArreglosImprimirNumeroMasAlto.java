public class TareaArreglosImprimirNumeroMasAlto {
    public static void main(String[] args) {

        /*
        Imprima el numero mas alto del arreglo.
        Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99),
         por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.
        */

        int[] a = new int[7];

        a[0]= 99;
        a[1]= 33;
        a[2]= 15;
        a[3]= 36;
        a[4]= 78;
        a[5]= 21;
        a[6]= 43;

        int masAlto = 0;

       for (int i = 0 ; i< a.length; i++){
           if (a[i]>masAlto){
               masAlto = a[i];
           }
       }

        System.out.println("El numero mas alto es : " + masAlto);


    }
}
