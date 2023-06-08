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
        // ejercicio14
//        Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
//hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
//de hijos para averiguar la media de edad de los hijos de todas las familias.
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        int families = read.nextInt();
        int children =0;
        int totalChild=0;
        int prom =0;
        for (int i = 0; i < families; i++) {
            System.out.println("Ingrese la cantidad de hijos que tiene esta familia");
            children=read.nextInt();
            for (int j = 0; j < children; j++) {
                System.out.println("Ingrese la edad del hijo/a");
                prom = prom+ read.nextInt();
                totalChild++;
            }
        }
        System.out.println("El promedio de edad entre "+totalChild+ " hijos, es de "+(prom/totalChild));
    }
    
}
