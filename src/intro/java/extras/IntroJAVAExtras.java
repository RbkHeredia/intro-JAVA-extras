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
        //ejercicio7
//        Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
//de n números (n>0). El valor de n se solicitará al principio del programa y los números
//serán introducidos por el usuario. Realice dos versiones del programa, una usando el
//bucle “while” y otra con el bucle “do - while”.
        Scanner read = new Scanner(System.in);
        System.out.println("¿Cuantos numeros desea introducir?");
        int n = read.nextInt();
        int i =0;
        int num;
        int total = 0;
        int min = 50000000;
        int max = -250000;
        //version while
//        while(i < n){
//            
//            System.out.println("Introduce un numero");
//            num = read.nextInt();
//            if(i==0){
//                min=num;
//                max=num;
//            }
//            total = total + num;
//            i++;
//            if(num<min){
//                min = num;
//            }
//            if (num>max){
//                max = num;
//            }
//        }
//        System.out.println("Minimo: "+min);
//        System.out.println("Maximo: "+max);
//        System.out.println("Promedio: "+(total/n));
        
        //do while
        do{
            System.out.println("Introduce un numero");
            num = read.nextInt();
            if(i==0){
                min=num;
                max=num;
            }
            total = total + num;
            i++;
            if(num<min){
                min = num;
            }
            if (num>max){
                max = num;
            }
        }while(i<n);
        System.out.println("Minimo: "+min);
        System.out.println("Maximo: "+max);
        System.out.println("Promedio: "+(total/n));
    }
    
}
