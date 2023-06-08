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
        // ejercicio10
//        Realice un programa para que el usuario adivine el resultado de una multiplicación entre
//dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
//si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
//al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
//utilizar la función Math.random() de Java
        Scanner read = new Scanner(System.in);
        int num1 = (int) (Math.random()*10);
//        System.out.println(num1);
        int num2 = (int) (Math.random()*10);
//        System.out.println(num2);
        int mult = num1 * num2;
        System.out.println("Ingrese un numero");
        int input = read.nextInt();
        while(input != mult){
            System.out.println("Respuesta incorrecta, intente nuevamente");
            input = read.nextInt();
        }
        System.out.println("Acertaste!");
    }
    
}
