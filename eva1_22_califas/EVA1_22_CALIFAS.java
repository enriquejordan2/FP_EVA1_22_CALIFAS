/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_22_califas;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA1_22_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califas;
        Scanner captu = new Scanner(System.in);
        System.out.println("Intrdouce la calificacion (es de 100-0)");
        califas = captu.nextInt();
        if (califas >=90 && califas <=100 ){
            System.out.println("Su calificacion es A");
        }else if (califas <=89 && califas >=80 ){
             System.out.println("Su calificacion es B");
             }else if (califas <=79 && califas >=70 ){
             System.out.println("Su calificacion es C");
              }else if (califas <=69 && califas >=60 ){
             System.out.println("Su calificacion es D");
              }else if (califas <=59 && califas >=0 ){
             System.out.println("Su calificacion es F");
              }else{
               System.out.println("Califiacion Invalidad debe ser entre 100-0");
             
        }
        
                
    }
  
}
