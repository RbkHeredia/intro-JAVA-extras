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
        //ejercicio11
//        Escribir un programa que lea un número entero y devuelva el número de dígitos que
//componen ese número. Por ejemplo, si introducimos el número 12345, el programa
//deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
//de división. Nota: recordar que las variables de tipo entero truncan los números o
//resultados.
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = read.nextInt();
        int dig = 0;
        while(num>0){
            num=num/10;
            dig++;
        }
        System.out.println("El numero tiene "+dig+" digitos");
    }
    
}
