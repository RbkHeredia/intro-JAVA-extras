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
        // ejercicio5
//        Una obra social tiene tres clases de socios:
//o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
//todos los tipos de tratamientos.
//o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
//los mismos tratamientos que los socios del tipo A.
//o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
//tratamientos.
//o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
//real que represente el costo del tratamiento (previo al descuento) y determine el
//importe en efectivo a pagar por dicho socio.
        System.out.println("Ingrese el tipo de socio:");
        String type = read.nextLine();
        double total;
        type = type.toUpperCase();
        System.out.println("Ingrese el valor del tratamiento");
        double amount = read.nextDouble();
        switch(type){
            case "A":
                total = amount - (amount*0.5);
                break;
            case "B":
                total = amount - (amount*0.35);
                break;
            case "C":
                total = amount;
                break;
            default:
                total = 0;
        }
        System.out.println("El total a abonar es: "+total);
    }
    
}
