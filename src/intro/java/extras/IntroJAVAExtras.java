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
        //ejercicio6
//        Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
//debajo de 1.60 mts. y el promedio de estaturas en general.
        double altura;
        double promMenor = 0;
        double promGral = 0;
        int counter = 0;
        System.out.println("¿Cuantas personas desea cargar en el sistema?");
        int persons = read.nextInt();
        for (int i = 0; i < persons; i++) {
            System.out.println("Ingresa la altura de la persona");
            altura = read.nextDouble(); 
            if(altura <1.60){
                promGral= promGral + altura;
                promMenor = promMenor + altura;
                counter++;
            } else {
                promGral= promGral + altura;
            }
        }
        
        if(counter>0){
            System.out.println("Promedio menor a 1.60: "+(promMenor/counter));
        } else {
            System.out.println("No hay personas con menos de 1.60");
        }
        System.out.println("Promedio general: "+(promGral/persons));
    }
    
}
