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
        // ejercicio18
//        Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
//N, con los valores ingresados por el usuario.
        Scanner read = new Scanner(System.in);
        System.out.println("¿Cuantos valores va a ingresar?");
        int q= read.nextInt();
        int vector[] = new int[q];
        for (int i = 0; i < q; i++) {
            System.out.println("Ingrese el numero");
            vector[i] = read.nextInt();
        }
        int total=0;
        for (int i = 0; i < q; i++) {
            total = total+vector[i];
        }
        System.out.println("La suma de los numeros ingresados en el vector es: " + total);
    }
    
}
