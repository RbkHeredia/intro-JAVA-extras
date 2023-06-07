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
        //ejercicio3
//        Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
//Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String
    Scanner read = new Scanner(System.in);
    String vocales[] = new String[5];
    vocales[0] = "a";
    vocales[1] = "e";
    vocales[2] = "i";
    vocales[3] = "o";
    vocales[4] = "u";
    int counter =0;
        System.out.println("Ingresa una letra");
        String letter = read.next();
        for (int i = 0; i < 5; i++) {
            if(vocales[i].equals(letter)){
                counter ++;
            } 
        }
        if(counter >0){
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
    }
    
}
