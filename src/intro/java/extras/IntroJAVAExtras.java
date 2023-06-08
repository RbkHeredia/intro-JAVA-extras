/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java.extras;

/**
 *
 * @author rebek
 */
public class IntroJAVAExtras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ejercicio12
//        Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
//0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
//Ejemplo:
//0-0-0
//0-0-1
//0-0-2
//0-0-E
//0-0-4
//0-1-2
//0-1-E
//Nota: investigar función equals() y como convertir números a String.
        for (int i = 0; i < 10; i++) {
            String first = String.valueOf(i);
            if(first.equals("3")){
               first = "E";
            }
            for (int j = 0; j < 10; j++) {
                String second = String.valueOf(j);
                if(second.equals("3")){
                        second = "E";
                    }
                for (int k = 0; k < 10; k++) {
                    String third = String.valueOf(k);
                    if(third.equals("3")){
                        third = "E";
                    }
                    System.out.println(first+"-"+second+"-"+third);
                }
            }
        }
    }
    
}
