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
        // ejercicio15
//        Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
//restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
//matemática y deben devolver sus resultados para imprimirlos en el main. 
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int num1 = read.nextInt();
        System.out.println("Ingresa otro numero");
        int num2 = read.nextInt();
        System.out.println("Opciones:");
        System.out.println("1. sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int option = read.nextInt();
        int total;
        switch(option){
            case 1:
                total = sumar(num1, num2);
                break;
            case 2:
                total = restar(num1, num2);
                break;
            case 3:
                total = multiplicar(num1, num2);
                break;
            case 4:
                total = dividir(num1, num2);
                break;
            default:
                System.out.println("Opcion incorrecta");
                total = 0;
        }
        System.out.println("El total es: " + total);
    }
    
    public static int sumar(int num1, int num2){
        int total = num1+num2;
        return total;
    }
    
    public static int restar(int num1, int num2){
        int total = num1-num2;
        return total;
    }
    public static int multiplicar(int num1, int num2){
        int total = num1*num2;
        return total;
    }
    public static int dividir(int num1, int num2){
        int total = num1/num2;
        return total;
    }
    
}
