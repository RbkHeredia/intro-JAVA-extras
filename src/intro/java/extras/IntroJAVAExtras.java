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
        // ej1
//        Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
//usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos");
        int minutes = read.nextInt();
        int days = Math.round(minutes/1440) ;
        int rest = minutes - (days*1440);
        int hours = Math.round(rest/60);
        System.out.println(minutes+ "minutos son: "+ days+" dias y " + hours + " horas");
    }
    
}
