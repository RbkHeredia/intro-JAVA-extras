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
        // ejercicio21
        String vectorNombres[] = {"       |   1TP", " 2TP", "1int", "2int"};
        for (int i = 0; i < 4; i++) {
            System.out.print(vectorNombres[i]+"|  ");
        }
        System.out.println("");
        System.out.println("------------------------------------------");
        int matriz[][] = new int[10][5];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                if(j==0){
                    matriz[i][j] = i+1;
                    System.out.print("al "+matriz[i][j] +"|");
                } else {
                    matriz[i][j]= (int) (Math.random()*10);
                    System.out.print("  |   " +matriz[i][j]);
                }
            }
            System.out.println("");
        }
        double vectorProm[] = new double[10];
        double total;
        for (int i = 0; i < 10; i++) {
            total = 0;
            for (int j = 1; j < 5; j++) {
                switch(j){
                    case 1:
                        total = total + (matriz[i][j]*0.1);
                        break;
                    case 2:
                        total = total +  (matriz[i][j]*0.15);
                        break;
                    case 3:
                        total = total +  (matriz[i][j]*0.25);
                        break;
                    case 4:
                        total = total +  (matriz[i][j]*0.5);
                        break;
                    default:
                        System.out.println("error");
                }
            }
            vectorProm[i] = total;
        }
        System.out.println("Promedios: ");
        int aprobados = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("alumno "+i+": " + vectorProm[i]);
            if(vectorProm[i]>=7){
                aprobados++;
            }
        }
        System.out.println("El total de alumnos es aprobados es de: "+ aprobados);
        System.out.println("El total de alumnos desaprobados es de: "+(10-aprobados));
    }
    
}
