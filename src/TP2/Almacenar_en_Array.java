package TP2;

/*Ejercicio 1: Almacenar en Array
Desarrollar un programa que pida al usuario que introduzca 10 números enteros por consola.
Los números introducidos se almacenarán en un array.
El programa imprime en consola cuántos números negativos, positivos y valores 0 hay en el array.*/

import javax.swing.*;
import java.util.Scanner;

public class Almacenar_en_Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] Numeros = new int[10];
        int numneg=0, ceros=0, numpos=0, i;

        JOptionPane.showMessageDialog(null,"Ingrese 10 números");
        for (i=0;   i<10;   i++){
            System.out.print("Número " +(i+1)+ ": ");       //Mostrar posicion actual, +1 para que la lista sea de 1 a 10 y no de 0 a 9.
            Numeros[i] = sc.nextInt();

            //Actualizar contadores dependiendo del número ingresado cada vez.
            if(Numeros[i]<0){
                numneg++;
            }else if (Numeros[i]>0) numpos++;
            else ceros++;
        }

        //Resultados por pantalla
        System.out.println("Cantidad de números positivos: " + numpos);
        System.out.println("Cantidad de números negativos: " + numneg);
        System.out.println("Cantidad de números ceros: " + ceros);

    }

}
