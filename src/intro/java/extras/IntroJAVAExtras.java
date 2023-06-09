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
        // ejercicio16
//        Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
//las personas ingresadas por teclado e indique si son mayores o menores de edad.
//Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
//mostrando personas y frenar cuando el usuario ingrese la palabra “No”
        Scanner read = new Scanner(System.in);
        String name, res;
        int age;
        boolean mayor;
        do{
            System.out.println(" Ingrese el nombre");
            name = read.nextLine();
            System.out.println("Ingrese la edad");
            age = read.nextInt();
            mayor = age>18;
            System.out.println("Nombre: "+name+", mayor de edad: "+mayor);
            System.out.println("------------------------");
            System.out.println("Desea cargar mas datos?");
            read.nextLine();
            res= read.nextLine();
            res = res.toUpperCase();
        }while(!res.equals("NO"));
    }
    
}
