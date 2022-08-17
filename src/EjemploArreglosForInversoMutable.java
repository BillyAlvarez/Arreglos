import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public static void arregloInverso(String[] arreglo) {
        int total2 = arreglo.length;
        int total = arreglo.length;
        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            total2--;
        }
    }

    public static void main(String[] args) {

        String[] productos = {" Kingston Pendrive 64Gb", " Samsung Galaxy", " Disco Duro SSD Samsung Externo", " Asus Notebook", " Macbook Air", " Chromecast 4ta Generacion", " Bicicleta Oxford"};
        int total = productos.length;

        Arrays.sort(productos);
        arregloInverso(productos);

        //Collections.reverse(Arrays.asList(productos));

        System.out.println("====== Usando for =======");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice  " + i + " : " + productos[i]);
        }

//        for(int i = 0 ; i < total/2; i++){
//          String actual = productos[i];
//          String inverso = productos[total-1-i];
//          productos[i]= inverso;
//          productos[total-1-i]= actual;
//        }


//        System.out.println("====== Usando for =======");
//        for (int i = 0; i < total; i++) {
//            System.out.println("para indice  " + i + " : " + productos[i]);
//        }

    }
}
