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
        //ejercicio8
//        Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
//detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
//la cantidad de números impares. Al igual que en el ejercicio anterior los números
//negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
    Scanner read = new Scanner(System.in);
    int num;
    int pares=0;
    int impares=0;
    do{
        System.out.println("Ingrese un numero");
        num = read.nextInt();
        if(num>0){
            if(num%2 == 0){
                pares++;
            } else {
                impares++;
            }
        }
    }while(num%5 != 0);
    
        System.out.println("Pares: "+pares);
        System.out.println("Impares: "+impares);
    }
    
}
