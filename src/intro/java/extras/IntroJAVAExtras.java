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
        Scanner read = new Scanner(System.in);
        //ejercicio4
//        Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
//equivalente en romano
        System.out.println("Ingrese un numero del 1 al 10");
        int num = read.nextInt();
        String romano="";
        while(num>10 || num<1){
            System.out.println("Numero equivocado, ingresa nuevamente");
            num = read.nextInt();
        }
        switch(num){
            case 1:
                romano = "I";
                break;
            case 2:
                romano = "II";
                break;
            case 3:
                romano = "III";
                break;
            case 4:
                romano = "IV";
                break;
            case 5:
                romano = "V";
                break;
            case 6:
                romano = "VI";
                break;
            case 7:
                romano = "VII";
                break;
            case 8:
                romano = "VIII";
                break;
            case 9:
                romano = "IX";
                break;
            case 10:
                romano = "X";
                break;
        }
        System.out.println("El num "+num+ " es equivalente a "+ romano+ " en numeros romanos");
    }
    
}
