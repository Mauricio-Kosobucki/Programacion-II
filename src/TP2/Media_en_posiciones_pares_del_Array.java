package TP2;

/*Ejercicio 2. Media en posiciones pares del Array
En este ejercicio, se pide al usuario que introduzca 10 números enteros por consola.
Los números se almacenarán en un array y el programa calculará la media de los números introducidos en las posiciones pares del array.
(Debes utilizar el operador módulo “%”).*/

import javax.swing.*;
import java.util.Scanner;

public class Media_en_posiciones_pares_del_Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] Numeros = new int[10];
        double media=0;

        JOptionPane.showMessageDialog(null,"Ingrese 10 números");
        for (int i=0;   i<10;   i++){
            System.out.print("Número " +(i+1)+ ": ");       //Mostrar posicion actual, +1 para que la lista sea de 1 a 10 y no de 0 a 9.
            Numeros[i] = sc.nextInt();
            if (i%2!=0)  media+=Numeros[i];         //Suma sólo a las posiciones impares (ya que se muestran como pares por pantalla).
        }

        //Mostrar por pantalla el resultado de la media dividido la cantidad de números que se ingresaron.
        System.out.println("La media de los números introdidos en las posiciones pares es: "+(media/5));

    }

}
