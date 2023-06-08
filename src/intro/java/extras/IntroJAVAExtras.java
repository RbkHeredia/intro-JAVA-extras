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
        // ejercicio13
//        Crear un programa que dibuje una escalera de números, donde cada línea de números
//comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
//usuario al comenzar. Ejemplo: si se ingresa el número 3:
//1
//12
//123
        Scanner read = new Scanner(System.in);
        System.out.println("Cuantos numeros desea mostrar en la escalera?");
        int num = read.nextInt();
        String res = "";
        for (int i = 1; i <= num; i++) {
            res = res + String.valueOf(i);
            System.out.println(res);
        }
    }
    
}
