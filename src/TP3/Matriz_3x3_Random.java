package TP3;

/*Ejercicio 02:
Crear una matriz de 3 x 3 con elementos generados de forma aleatoria por medio del método random() de la clase Math.

Una vez que se genere el array de array mostrar los elementos cargados utilizando la consola.*/

public class Matriz_3x3_Random {

    public static void main(String[] args) {

        int[][] Matriz = new int[3][3];

        //Se carga la matriz aleatoriamente.
        for (int i=0;   i<3;    i++){
            for (int j=0;   j<3;    j++){
                Matriz[i][j] = (int)(Math.random()*50+1);
            }
        }

        //Se muestra la matriz
        for (int[] Fila:Matriz) {
            for (int Elemento:Fila){
                System.out.print("[" +Elemento+ "] ");
            }
            System.out.println();
        }

    }

}
