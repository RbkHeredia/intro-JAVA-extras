/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java.extras;

import java.util.Scanner;

/**
 *
 * @author rebek
 */
public class IntroJAVAExtras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ejercicio20
//        Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
//parámetro. Después haremos otra función o procedimiento que imprima el vector.
        System.out.println("Cuantos valores quiere agregar en el vector?");
        Scanner read = new Scanner(System.in);
        int q = read.nextInt();
        int vector[] = new int[q];
        rellenar(vector, q);
        mostrar(vector, q);
    }
    
    public static void rellenar(int vector[], int q){
        for (int i = 0; i < q; i++) {
            vector[i] = (int) (Math.random()*15);
        }
    }
    
    public static void mostrar(int vector[], int q){
        for (int i = 0; i < q; i++) {
            System.out.print("["+vector[i]+"]");
        }
    }
}
