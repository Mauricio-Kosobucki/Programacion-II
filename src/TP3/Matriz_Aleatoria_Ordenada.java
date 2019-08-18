package TP3;

/*Ejercicio 04:
Realice un programa que genere una matriz de 3x3 con números al azar y la muestra utilizando la consola.

Una vez que muestre la matriz desordenada, debe mostrar también la matriz ordenada de menor a mayor*/

import java.util.Arrays;

public class Matriz_Aleatoria_Ordenada {

    public static void main(String[] args) {

        int[][] Matriz = new int[3][3];         //Se crea la matriz.
        int[] temp = new int[9];            //Se crea un arreglo temporal cuya demiension es n*m, siendo n y m las dimensiones de la matriz.

        //Se carga la matriz.
        for (int i=0;   i<3;    i++){
            for (int j=0;   j<3;    j++){
                Matriz[i][j] = (int)(Math.random()*50+1);
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
