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
        //ejercicio19
//        Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
//comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
//elementos).
        Scanner read = new Scanner(System.in);
        System.out.println("Que cantidad de valores quieres ingresar en cada vector?");
        int cant = read.nextInt();
        int vector1[] = new int[cant];
        int vector2[] = new int[cant];
        rellenarVector(vector1, cant);
        rellenarVector(vector2, cant);
        comparar(vector1, vector2, cant);
    }
     public static void rellenarVector(int vector[], int q){
         Scanner read = new Scanner(System.in);
         System.out.println("Nuevo vector");
         for (int i = 0; i < q; i++) {
             System.out.println("Ingrese un valor");
             vector[i] = read.nextInt();
         }
         System.out.println("-----------------");
     }
     
     public static void comparar(int vector1[], int vector2[], int q){
         for (int i = 0; i < q; i++) {
             if(vector1[i] != vector2[i]){
                 System.out.println("Hay una diferencia en el puesto " +(i+1));
                 break;
             }
         }
         System.out.println("Programa finalizado");
     }
}
