package TP3;

/*Ejercicio 05:
Realice un programa que genere una matriz de 3x3 con números ingresados por el usuario por medio de la consola.

Una vez terminada la carga de los elementos se debe mostrar primero la matriz cargada con los datos iniciales y luego la matriz con los datos
ordenados de mayor a menor.*/

import java.util.Arrays;
import java.util.Scanner;

public class Matriz_Cargada_por_Usuario_Ordenada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] Matriz = new int[3][3];         //Se crea la matriz.
        int[] temp = new int[9];            //Se crea un arreglo temporal cuya demiension es n*m, siendo n y m las dimensiones de la matriz.

        //Se carga la matriz.
        for (int i=0;   i<3;    i++){
            for (int j=0;   j<3;    j++){
                System.out.print("Elemento [" +(i+1)+ "][" +(j+1)+ "]: ");
                Matriz[i][j] = sc.nextInt();
                temp[(i*3)+j] = Matriz[i][j];       //En el arreglo temp se guarda una copia de todos los elementos ingresados.
            }
        }

        //Se muestra la matriz original.
        System.out.println("Matriz Cargada:");
        for (int[] Fila:Matriz) {
            for (int Elemento:Fila){
                System.out.print("[" +Elemento+ "] ");
            }
            System.out.println();
        }

        //Se ordena el temp.
        Arrays.sort(temp);

        //Se carga la matriz ordenada usando temp.
        for (int i=0;   i<3;    i++){
            for (int j=0;   j<3;    j++){
                Matriz[i][j] = temp[(i*3)+j];
            }
        }

        System.out.println();

        //Se muestra la matriz ordenada.
        System.out.println("Matriz Ordenada:");
        for (int[] Fila:Matriz) {
            for (int Elemento:Fila){
                System.out.print("[" +Elemento+ "] ");
            }
            System.out.println();
        }

    }

}
